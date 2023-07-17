package com.apap.demo.controller;

/**
 * @author muhammad.khadafi
 */

import com.apap.demo.model.Book;
import com.apap.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/api/book", method = RequestMethod.GET)
    public ResponseEntity getAllBooks() {
        ResponseEntity responseEntity = null;
        try {
            List<Book> books = bookService.getAllBooks();
            responseEntity = ResponseEntity.ok(books);
        } catch (Exception e) {
            System.out.println("Error in get all books!");
            responseEntity = ResponseEntity.badRequest().body(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/api/book", method = RequestMethod.POST)
    public ResponseEntity addBook(@RequestBody Book book) {
        ResponseEntity responseEntity = null;

        try {
            bookService.add(book);
            responseEntity = ResponseEntity.ok().build();
        } catch (Exception e) {
            System.out.println("Error in add book!");
            responseEntity = ResponseEntity.badRequest().body(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

    @RequestMapping(value = "/api/book/{kodeBuku}", method = RequestMethod.DELETE)
    public ResponseEntity deleteBook(@PathVariable String kodeBuku) {
        ResponseEntity responseEntity = null;

        try {
            bookService.delete(kodeBuku);
            responseEntity = ResponseEntity.ok().build();
        } catch (Exception e) {
            System.out.println("Error in delete book!");
            responseEntity = ResponseEntity.badRequest().body(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

    @RequestMapping(value = "/api/book", method = RequestMethod.PUT)
    public ResponseEntity updateBook(@RequestBody Book book) {
        ResponseEntity responseEntity = null;

        try {
            bookService.update(book);
            responseEntity = ResponseEntity.ok().build();
        } catch (Exception e) {
            System.out.println("Error in update book!");
            responseEntity = ResponseEntity.badRequest().body(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

}
