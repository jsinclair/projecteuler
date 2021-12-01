package com.projecteuler.utils;

import java.util.List;

public class Sorter {
    public static List<Integer> sortAndDistinct(List<Integer> toSort) {
        toSort.sort(new IntegerComparator());

        for (int i = 0; i < toSort.size() - 1;) {
            if (toSort.get(i) == toSort.get(i + 1)) {
                toSort.remove(i + 1);
            } else {
                i += 1;
            }
        }

        return toSort;
    }
}
