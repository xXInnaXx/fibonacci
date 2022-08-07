package com.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciCalculatorTest {
    @Test
    void shouldReturnNumber() {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int position = 5;
        int expected = 3;
        int actual = fibonacciCalculator.calculateByPosition(position);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnErrorCodeIfPositionZero() {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int position = 0;
        int expected = -1;
        int actual = fibonacciCalculator.calculateByPosition(position);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnErrorCodeIfPositionLessZero() {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int position = -1;
        int expected = -1;
        int actual = fibonacciCalculator.calculateByPosition(position);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnZeroIfPositionOne() {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int position = 1;
        int expected = 0;
        int actual = fibonacciCalculator.calculateByPosition(position);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnOneIfPositionTwo() {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int position = 2;
        int expected = 1;
        int actual = fibonacciCalculator.calculateByPosition(position);
        assertEquals(actual, expected);
    }


}