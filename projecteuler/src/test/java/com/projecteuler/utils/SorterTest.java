package com.projecteuler.utils;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SorterTest {
    Integer[] nums = { 2, 4, 1, 5, 10, 1 };
    Integer[] expected = { 1, 2, 4, 5, 10 };

    @Test
    public void testSortAndDistinct() {
        // given
        List<Integer> listNums = ListUtils.toList(nums);
        List<Integer> listExpected = ListUtils.toList(expected);
        // when
        List<Integer> listSorted = Sorter.sortAndDistinct(listNums);
        // then
        assertArrayEquals(listExpected.toArray(), listSorted.toArray());
    }
}
