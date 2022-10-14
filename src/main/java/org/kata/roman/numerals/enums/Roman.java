package org.kata.roman.numerals.enums;

import lombok.Getter;

@Getter
public enum Roman {
    UN("I"),
    QUATRE("IV"),
    CINQ("V"),
    NEUF("IX"),
    DIX("X"),
    VINGT("XX"),
    QUARANTE("XL"),
    CINQUANTE("L"),
    SOIXANTE("LX"),
    QUATRE_VINGT_DIX("XC"),
    CENT("C"),
    CINQ_CENT("D"),
    NEUF_CENT("CM"),
    MILLE("M");

    private final String value;

    Roman(String value) {
        this.value = value;
    }
}
