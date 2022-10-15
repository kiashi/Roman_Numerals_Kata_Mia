package org.kata.roman.numerals.record;

import org.kata.roman.numerals.utils.RomanNumberConverter;

public record RomansNumber(String romansNumber) {
    public Integer toRegularNumber(){
        return new RomanNumberConverter().toRegularNumber.apply(this.romansNumber);
    }
}
