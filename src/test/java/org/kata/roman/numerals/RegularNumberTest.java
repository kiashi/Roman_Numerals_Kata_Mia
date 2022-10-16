package org.kata.roman.numerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.kata.roman.numerals.record.RegularNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("#1 - Test convert Regular number to a Romans number")
public class RegularNumberTest {

    @Test
    @DisplayName("1 should be I")
    public void test1(){
        var number = new RegularNumber(1);
        assertEquals("I", number.toRoman().value());
    }

    @Test
    @DisplayName("2 should be II")
    public void test2(){
        var number = new RegularNumber(2);
        assertEquals("II", number.toRoman().value());
    }

    @Test
    @DisplayName("14 should be XIV")
    public void test14(){
        var number = new RegularNumber(14);
        assertEquals("XIV", number.toRoman().value());
    }

    @Test
    @DisplayName("19 should be XIX")
    public void test19(){
        var number = new RegularNumber(19);
        assertEquals("XIX", number.toRoman().value());
    }

    @Test
    @DisplayName("30 should be XXX")
    public void test30(){
        var number = new RegularNumber(30);
        assertEquals("XXX", number.toRoman().value());
    }

    @Test
    @DisplayName("36 should be XXXVI")
    public void test36(){
        var number = new RegularNumber(36);
        assertEquals("XXXVI", number.toRoman().value());
    }

    @Test
    @DisplayName("40 should be XL")
    public void test40(){
        var number = new RegularNumber(40);
        assertEquals("XL", number.toRoman().value());
    }

    @Test
    @DisplayName("55 should be LV")
    public void test55(){
        var number = new RegularNumber(55);
        assertEquals("LV", number.toRoman().value());
    }

    @Test
    @DisplayName("90 should be XC")
    public void test90(){
        var number = new RegularNumber(90);
        assertEquals("XC", number.toRoman().value());
    }

    @Test
    @DisplayName("150 should be CL")
    public void test150(){
        var number = new RegularNumber(150);
        assertEquals("CL", number.toRoman().value());
    }

    @Test
    @DisplayName("208 should be CCVIII")
    public void test208(){
        var number = new RegularNumber(208);
        assertEquals("CCVIII", number.toRoman().value());
    }

    @Test
    @DisplayName("344 should be CCCXLIV")
    public void test344(){
        var number = new RegularNumber(344);
        assertEquals("CCCXLIV", number.toRoman().value());
    }

    @Test
    @DisplayName("560 should be DLX")
    public void test560(){
        var number = new RegularNumber(560);
        assertEquals("DLX", number.toRoman().value());
    }

    @Test
    @DisplayName("661 should be DCLXI")
    public void test661(){
        var number = new RegularNumber(661);
        assertEquals("DCLXI", number.toRoman().value());
    }

    @Test
    @DisplayName("902 should be CMII")
    public void test902(){
        var number = new RegularNumber(902);
        assertEquals("CMII", number.toRoman().value());
    }

    @Test
    @DisplayName("1001 should be MI")
    public void test1001(){
        var number = new RegularNumber(1001);
        assertEquals("MI", number.toRoman().value());
    }

    @Test
    @DisplayName("2006 should be MMVI")
    public void test2006(){
        var number = new RegularNumber(2006);
        assertEquals("MMVI", number.toRoman().value());
    }

    @Test
    @DisplayName("2708 should be MMDCCVIII")
    public void test2708(){
        var number = new RegularNumber(2708);
        assertEquals("MMDCCVIII", number.toRoman().value());
    }

    @Test
    @DisplayName("3000 should be MMM")
    public void test3000(){
        var number = new RegularNumber(3000);
        assertEquals("MMM", number.toRoman().value());
    }
}
