package org.kata.roman.numerals;

import org.kata.roman.numerals.record.Number;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(s -> {
            Number number = new Number(s);
            System.out.println(number.toRoman());
        });
    }
}

