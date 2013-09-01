package com.java.hackermeter.basics;

import java.util.*;

/**
 * Solution for HackerMeter Basics: PalindromePerception.
 */
public class HackerMeterPalindromePerception {
    public static void run(Scanner scanner) {
        //Code here!
        String palindrome = scanner.nextLine();

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
