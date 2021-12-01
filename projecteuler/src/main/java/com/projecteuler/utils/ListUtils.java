package com.projecteuler.utils;

import java.util.LinkedList;
import java.util.List;

public class ListUtils {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new LinkedList<T>();
        for (T i : arr) {
            list.add(i);
        }
        return list;
    }
}
