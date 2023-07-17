package com.apap.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IMathServiceTest {

    @Test
    public void testIsqrt() {
        assertEquals(0, IMathService.isqrt(0));
        assertEquals(1, IMathService.isqrt(1));
        assertEquals(1, IMathService.isqrt(2));
        assertEquals(1, IMathService.isqrt(3));
        assertEquals(2, IMathService.isqrt(4));
        assertEquals(2, IMathService.isqrt(7));
        assertEquals(3, IMathService.isqrt(9));
        assertEquals(10, IMathService.isqrt(100));
    }

}
