package com.java.hackermeter.basics;

import java.util.*;
/**
 * Two strings are "sublime" when all the characters in the first string appear in
 * the same order in the second string. For example, "rat" and "rather" are sublime,
 * "mat" and "moat" are sublime, but "can" and "cat" are not. We want to determine whether
 * pairs of strings are sublime or not.
 *
 * The first line of the input will be an integer N (1 <= N <= 100).
 *
 * Each of the following N lines represents a single test case, containing a space-separated
 * pair of strings A, B, each of which consists of only letters (no special characters).
 *
 * For each test case, print 'sublime' if A is sublime to B, or 'unsublime' if not.
 * No blank line between test cases.
 */
public class SublimeString {
    public static void run(Scanner scanner) {
        // Code here!
        String[] input = scanner.nextLine().split(" ");
        int charIndex = 0;
        boolean found = false;
        int strLenTwo = input[1].toCharArray().length;

        for(int i = 0; i < input[0].toCharArray().length; i++) {
            found = false;
            for(int j = charIndex; j < strLenTwo; j++) {
                charIndex = j;

                if(input[0].charAt(i) == input[1].charAt(j)) {
                    found = true;
                    break;
                } else if(j == strLenTwo - 1) {
                    System.out.println("unsublime");
                    return;
                }
            }
        }

        System.out.println("sublime");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cases = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < cases; i++) {
            run(scanner);
        }
    }
}
