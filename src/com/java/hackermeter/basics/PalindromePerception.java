package com.java.hackermeter.basics;

import java.util.*;

/**
 * A palindrome is a string reads the same from left to right and from right to left. For example: 'abba' is a palindrome, as well as 'aba', but not 'bbaaa.'
 * We want to determine whether strings are palindromes.
 * The first line of the input will be an integer N (1 <= N <= 10000).
 * Each of the following N lines represents a single test case, containing a string S (1 <= length of S <= 10000). The string will not contain any spaces or special characters.
 * *Note* each string will end with '\n' given each line has only one string(test case)
 * For each test case, print 'Y' if S is a palindrome and 'N' if not. No blank line between test cases.
 */
public class PalindromePerception {
    public static void run(Scanner scanner) {
        //Code here!
        String palindrome = scanner.nextLine();
        String[] p = scanner.nextLine().split(" ");

        for(int idx = 0; idx < (palindrome.length()/2)+1; idx++) {
            int left = idx, right = palindrome.length() - idx - 1;
            if(palindrome.charAt(left) != palindrome.charAt(right)) {
                System.out.println("N");
                break;
            } else if(left == right || left + 1 == right)
                System.out.println("Y");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++) {
            run(scanner);
        }
    }
}

