package com.projecteuler.utils;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class ListUtilsTest {
    @Test
    public void testToList() {
        // given
        Integer[] numsArr = { 1, 2, 3, 4, 5 };
        // when
        List<Integer> numsList = ListUtils.toList(numsArr);
        // then
        assertArrayEquals(numsArr, numsList.toArray());
    }
}
