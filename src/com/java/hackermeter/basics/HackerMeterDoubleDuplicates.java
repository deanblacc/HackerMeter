package com.java.hackermeter.basics;

import java.util.*;

/**
 * You've got a list of X+2 numbers containing the numbers 0 through X-1, but with two duplicates.
 * We want to find those duplicates using as little memory as possible. (That's important.)
 * The first line of the input will be an integer N (1 <= N <= 100).
 * Each of the following N test cases consists of one line containing an integer X (1 <= X <= 1000),
 * followed by X+2 space-separated integers on the next line.
 * For each test case, print out the two duplicate elements, separated by a newline,
 * with the smaller one first. No blank line between test cases.
 */

public class HackerMeterDoubleDuplicates {
    public static void run(Scanner scanner) {
        // Code here!
        int x = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        int[] nums = new int[x+2];

        for(int i = 0; i < x+2; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);

        for(int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j-1] || nums[j]-2 >= nums[j-1]) {
                System.out.println(nums[j]);
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
