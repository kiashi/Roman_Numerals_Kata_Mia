package org.kata.roman.numerals.record;

import org.jetbrains.annotations.NotNull;
import org.kata.roman.numerals.utils.RomanNumberConverter;

public record RegularNumber(int value) implements Comparable<RegularNumber>{
    public RomansNumber toRoman(){
        var numberConverter = new RomanNumberConverter();
        return new RomansNumber(numberConverter.toRomanNumber.apply(this.value));
    }

    @Override
    public int compareTo(@NotNull RegularNumber o) {
        return Integer.compare(this.value, o.value);
    }
}
