package com.java.hackermeter.basics;

import java.util.Scanner;

/**
 * Solution for hackerMeter basics-fibonacci.
 */
public class HackerMeterFibonacci {
    public static void run(Scanner scanner) {
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
