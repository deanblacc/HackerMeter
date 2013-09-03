package com.java.hackermeter.basics;

import java.util.*;

/**
 * The Fibonacci sequence is a sequence in which each term is the sum of the two previous terms, like so:
 F(0) = 0
 * F(1) = 1
 * F(2) = 1
 * F(3) = 2
 * F(4) = 3
 * …
 * We want to write a function that prints the first X numbers of the sequence.
 * The first line of the input will be an integer N (1 <= N <= 100).
 * Each of the following N lines represents a single test case, containing an integer X (1 <= X <= 90).
 * For each test case, print the first X numbers of the Fibonacci sequence, one per line. No blank line between test cases.
 */
public class Fibonacci {
    public static void run(Scanner scanner) {
        //Code here!
        int fibNum = Integer.parseInt(scanner.nextLine());

        long x = 0, y = 1, i = 0;

        while(i != fibNum) {
            if(i < 2)
                System.out.println(i);
            else {
                long answer = x + y;
                x = y;
                y = answer;

                System.out.println(answer);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cases = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < cases; i++) {
            run(scanner);
        }
    }
}
