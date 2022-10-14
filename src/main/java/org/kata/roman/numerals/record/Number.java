package org.kata.roman.numerals.record;

import org.kata.roman.numerals.utils.RomanNumberConverter;

public record Number(int number) {
    public String toRoman(){
        return new RomanNumberConverter().toRomanNumber.apply(this.number);
    }
}
