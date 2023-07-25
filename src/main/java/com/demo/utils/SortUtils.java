package com.demo.utils;

/**
 * Created by Amit Pisal
 */

public enum SortUtils {
    SortByFirstName(0), SortByLastName(1), SortByEmail(2);
    private final int value;

    SortUtils(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
