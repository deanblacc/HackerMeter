package com.java.hackermeter.basics;

import java.util.*;

/**
 * A happy number is defined by the following process:
 * Given a number X, square each digit and sum the results. Repeat this procedure on the resulting sum until you either reach 1, or fall into a repeating cycle which does not include 1.
 * When this process ends in 1, X is a happy number.
 * The first line of the input will be an integer N (1 <= N <= 100).
 * Each of the following N lines represents a single test case, containing an integer X (1 <= X <= 100000).
 * For each test case, print 'Y' if X is a happy number, and 'N' if not. No blank line between test cases.
 */
public class NumericalNirvana {
    public static void run(Scanner scanner) {
        //Code here!
        String numStr = scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(true) {
            int total = 0;
            for(int i = 0; i < numStr.length(); i++) {
                int n = Character.getNumericValue(numStr.charAt(i));
                total = total + (n*n);
            }
            if(total == 1) {
                System.out.println("Y");
                return;
            }
            for(int y : arr) {
                if(y == total) {
                    System.out.println("N");//loop
                    return;
                }
            }
            arr.add(total);
            numStr = Integer.toString(total);
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
