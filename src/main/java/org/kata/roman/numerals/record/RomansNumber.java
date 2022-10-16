package org.kata.roman.numerals.record;

import org.jetbrains.annotations.NotNull;
import org.kata.roman.numerals.utils.RomanNumberConverter;

public record RomansNumber(String value) implements Comparable<RomansNumber>{
    public RegularNumber toRegularNumber(){
        var numberConverter = new RomanNumberConverter();
        return new RegularNumber(numberConverter.toRegularNumber.apply(this.value));
    }

    @Override
    public int compareTo(@NotNull RomansNumber o) {
        return this.value.compareTo(o.value);
    }
}
