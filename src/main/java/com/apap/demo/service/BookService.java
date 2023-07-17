package com.apap.demo.service;

import com.apap.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    public BookService() {
        Book book1 = new Book("F01", "Harry Potter and Goblet of Fire", "JK Rowling", "Fiksi", 100000);
        Book book2 = new Book("F02", "The Chronicles of Narnia", "CS Lewis", "Fiksi", 90000);
        Book book3 = new Book("SD01", "Atomic Habits", "James Clear", "Self Development", 120000);

        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void add(Book book) {
        Book newBook = new Book(book.getKodeBuku(), book.getJudulBuku(), book.getPenulis(), book.getGenre(), book.getHarga());
        books.add(newBook);
    }

    public void delete(String kodeBuku) {
        Book bookDeleted = null;

        for (Book book: books) {
            if (book.getKodeBuku().equals(kodeBuku))
                bookDeleted = book;
        }

        books.remove(bookDeleted);
    }

    public void update(Book book) {

        delete(book.getKodeBuku());
        add(book);

    }
}

