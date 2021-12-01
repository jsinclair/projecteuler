package com.projecteuler;

import com.projecteuler.solutions.MultipleSummer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Integer[] nums = { 3, 5 };
        System.out.println((new MultipleSummer(nums, 10000)).calculate());
    }
}
