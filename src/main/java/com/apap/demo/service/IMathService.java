package com.apap.demo.service;

/**
 * @author muhammad.khadafi
 */

public class IMathService {

    /* Returns an integer approximation to the square root of x.*/
    public static int isqrt(int x) {

//        int guess = 1;
//
//        while (guess * guess < x) {
//            guess++;
//        }
//
//        return guess;

        return (int) Math.sqrt(x);
    }
}

