package com.projecteuler.solutions;

import java.util.LinkedList;
import java.util.List;

import com.projecteuler.utils.ListUtils;
import com.projecteuler.utils.Sorter;

public class MultipleSummer {
    private final List<Integer> multiples;
    private final int max;

    public MultipleSummer(Integer[] multiples, int max) {
        this.max = max;
        this.multiples = Sorter.sortAndDistinct(ListUtils.toList(multiples));
    }

    public int calculate() {
        int sum = 0;
        List<Integer> cutList = removeMultiples();

        if (cutList.size() == 0) {
            return sum;
        }

        for (int i = cutList.get(0); i < max; i++) {
            for (int j : multiples) {
                if (i % j == 0) {
                    sum += i;
                    break;
                }
            }
        }

        return sum;
    }

    private List<Integer> removeMultiples() {
        List<Integer> cut = new LinkedList<>(multiples);
        for (int i = 0; i < cut.size() - 1; i++) {
            for (int j = i + 1; j < cut.size();) {
                if (cut.get(j) % cut.get(i) == 0) {
                    cut.remove(j);
                } else {
                    j++;
                }
            }
        }
        return cut;
    }
}
