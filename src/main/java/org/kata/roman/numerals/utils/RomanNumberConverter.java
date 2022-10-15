package org.kata.roman.numerals.utils;

import org.kata.roman.numerals.enums.Roman;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
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

    public Function<String, Integer> toRegularNumber = romanNumber ->
            this.convertToRegularNumberMap
                .andThen(this.transformNumberMap).apply(romanNumber).values().stream()
                .toList().stream()
                .mapToInt(s -> s)
                .sum();

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


    private final Function<Map<Integer, Integer>, Map<Integer, Integer>> transformNumberMap = regularNumberMap -> {
        var regularNumberMapCopy = new HashMap<>(regularNumberMap);
        var size = regularNumberMapCopy.size();
        var chainPossibilityWithX = Arrays.asList(50, 100);
        var chainPossibilityWithC = Arrays.asList(500, 1000);
        regularNumberMap.forEach((key, value) -> {
            var nextKey = key+1;
            if(value == 1 && nextKey < size && regularNumberMapCopy.get(nextKey) != 1) regularNumberMapCopy.replace(key, -1);
            if(value == 10 && nextKey < size && chainPossibilityWithX.contains(regularNumberMapCopy.get(nextKey))) regularNumberMapCopy.replace(key, -10);
            if(value == 100 && nextKey < size && chainPossibilityWithC.contains(regularNumberMapCopy.get(nextKey))) regularNumberMapCopy.replace(key, -100);
        });
        return regularNumberMapCopy;
    };

    private final Function<String, Map<Integer, Integer>> convertToRegularNumberMap = romanNumber -> {
        var numberList = new HashMap<Integer, Integer>();
        var index = new AtomicInteger(0);

        romanNumber.chars().mapToObj(e -> (char)e).toList()
                .forEach(s ->
                        romanReference.entrySet().stream()
                                .filter(a -> String.valueOf(s).equals(a.getValue().getValue()))
                                .map(Map.Entry::getKey)
                                .forEach(v -> {
                                    numberList.put(index.get(), v);
                                    index.getAndIncrement();
                                })
                );

        return numberList;
    };

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
        reference.put(400, Roman.QUATRE_CENT);
        reference.put(500, Roman.CINQ_CENT);
        reference.put(900, Roman.NEUF_CENT);
        reference.put(1000, Roman.MILLE);
        return reference;
    }
}
