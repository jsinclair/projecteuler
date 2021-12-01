package com.projecteuler.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntegerComparatorTest {
    @Test
    public void testCompare() {
        // given
        final IntegerComparator comparator = new IntegerComparator();
        // then
        assertTrue(-1 == comparator.compare(2, 5));
        assertTrue(0 == comparator.compare(5, 5));
        assertTrue(1 == comparator.compare(5, 2));
    }
}
