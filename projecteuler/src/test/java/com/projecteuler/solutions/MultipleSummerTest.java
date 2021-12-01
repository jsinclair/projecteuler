package com.projecteuler.solutions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultipleSummerTest {
    @Test
    public void testCalculate() {
        // given
        Integer[] nums = { 3, 5 };
        MultipleSummer summer = new MultipleSummer(nums, 10);
        // then
        assertTrue(summer.calculate() == 23);
    }

    @Test
    public void testCalculate20() {
        // given
        Integer[] nums = { 3, 5 };
        MultipleSummer summer = new MultipleSummer(nums, 20);
        System.out.println(summer.calculate());
        // then
        assertTrue(summer.calculate() == 78);
    }

    @Test
    public void testCalculate1000() {
        // given
        Integer[] nums = { 3, 5 };
        MultipleSummer summer = new MultipleSummer(nums, 1000);
        System.out.println(summer.calculate());
        // then
        assertTrue(summer.calculate() == 233168);
    }
}
