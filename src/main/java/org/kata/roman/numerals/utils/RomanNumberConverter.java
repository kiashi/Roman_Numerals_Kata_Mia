package org.kata.roman.numerals.utils;

import org.kata.roman.numerals.enums.Roman;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.Function;

public class RomanNumberConverter {

    private static NavigableMap<Integer, Roman> romanReference;

    public RomanNumberConverter(){
        romanReference = buildRomanReference();
    }

    public Function<Integer, String> toRomanNumber = number -> {
        var numberList = new ArrayList<Integer>();
        splitNumberToListRomansNumber(number, numberList);
        return transcode(numberList);
    };

    private void splitNumberToListRomansNumber(int number, List<Integer> listRomanNumber) {
        if(number != 0){
            var key = romanReference.floorKey(number);
            listRomanNumber.add(key);
            splitNumberToListRomansNumber(number-key, listRomanNumber);
        }
    }

    private String transcode(List<Integer> splitlist){
        var response = new ArrayList<String>();
        splitlist.forEach(s -> response.add(romanReference.get(s).getValue()));
        return String.join("", response);
    }

    private NavigableMap<Integer, Roman> buildRomanReference() {
        NavigableMap<Integer, Roman> reference = new TreeMap<>();
        reference.put(1, Roman.UN);
        reference.put(4, Roman.QUATRE);
        reference.put(5, Roman.CINQ);
        reference.put(9, Roman.NEUF);
        reference.put(10, Roman.DIX);
        reference.put(20, Roman.VINGT);
        reference.put(40, Roman.QUARANTE);
        reference.put(50, Roman.CINQUANTE);
        reference.put(60, Roman.SOIXANTE);
        reference.put(90, Roman.QUATRE_VINGT_DIX);
        reference.put(100, Roman.CENT);
        reference.put(500, Roman.CINQ_CENT);
        reference.put(900, Roman.NEUF_CENT);
        reference.put(1000, Roman.MILLE);
        return reference;
    }
}
