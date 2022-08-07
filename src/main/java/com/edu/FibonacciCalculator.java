package com.edu;

public class FibonacciCalculator {

    public int calculateByPosition(int position) {
        if (position <= 0) {
            System.out.println("Incorrect position, should be > 0");
            return -1;
        }
        int first = 0;
        System.out.println(first);
        if (position == 1) {
            return first;
        }
        int second = 1;
        System.out.println(second);
        if (position == 2) {
            return second;
        }
        int current = 0;
        for (int i = 3; i <= position; i++) {
            current = first + second;
            first = second;
            second = current;
            System.out.println(current);
        }
        return current;
    }

}