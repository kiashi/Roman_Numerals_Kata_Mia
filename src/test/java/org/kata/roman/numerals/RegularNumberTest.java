package org.kata.roman.numerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.kata.roman.numerals.record.RegularNumber;
import org.kata.roman.numerals.record.RomansNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("#1 - Test convert Regular number to a Romans number")
public class RegularNumberTest {

    @Test
    @DisplayName("1 should be I")
    public void test1(){
        var number = new RegularNumber(1);
        assertEquals(new RomansNumber("I"), number.toRoman());
    }

    @Test
    @DisplayName("2 should be II")
    public void test2(){
        var number = new RegularNumber(2);
        assertEquals(new RomansNumber("II"), number.toRoman());
    }

    @Test
    @DisplayName("14 should be XIV")
    public void test14(){
        var number = new RegularNumber(14);
        assertEquals(new RomansNumber("XIV"), number.toRoman());
    }

    @Test
    @DisplayName("19 should be XIX")
    public void test19(){
        var number = new RegularNumber(19);
        assertEquals(new RomansNumber("XIX"), number.toRoman());
    }

    @Test
    @DisplayName("30 should be XXX")
    public void test30(){
        var number = new RegularNumber(30);
        assertEquals(new RomansNumber("XXX"), number.toRoman());
    }

    @Test
    @DisplayName("36 should be XXXVI")
    public void test36(){
        var number = new RegularNumber(36);
        assertEquals(new RomansNumber("XXXVI"), number.toRoman());
    }

    @Test
    @DisplayName("40 should be XL")
    public void test40(){
        var number = new RegularNumber(40);
        assertEquals(new RomansNumber("XL"), number.toRoman());
    }

    @Test
    @DisplayName("55 should be LV")
    public void test55(){
        var number = new RegularNumber(55);
        assertEquals(new RomansNumber("LV"), number.toRoman());
    }

    @Test
    @DisplayName("90 should be XC")
    public void test90(){
        var number = new RegularNumber(90);
        assertEquals(new RomansNumber("XC"), number.toRoman());
    }

    @Test
    @DisplayName("150 should be CL")
    public void test150(){
        var number = new RegularNumber(150);
        assertEquals(new RomansNumber("CL"), number.toRoman());
    }

    @Test
    @DisplayName("208 should be CCVIII")
    public void test208(){
        var number = new RegularNumber(208);
        assertEquals(new RomansNumber("CCVIII"), number.toRoman());
    }

    @Test
    @DisplayName("344 should be CCCXLIV")
    public void test344(){
        var number = new RegularNumber(344);
        assertEquals(new RomansNumber("CCCXLIV"), number.toRoman());
    }

    @Test
    @DisplayName("560 should be DLX")
    public void test560(){
        var number = new RegularNumber(560);
        assertEquals(new RomansNumber("DLX"), number.toRoman());
    }

    @Test
    @DisplayName("661 should be DCLXI")
    public void test661(){
        var number = new RegularNumber(661);
        assertEquals(new RomansNumber("DCLXI"), number.toRoman());
    }

    @Test
    @DisplayName("902 should be CMII")
    public void test902(){
        var number = new RegularNumber(902);
        assertEquals(new RomansNumber("CMII"), number.toRoman());
    }

    @Test
    @DisplayName("1001 should be MI")
    public void test1001(){
        var number = new RegularNumber(1001);
        assertEquals(new RomansNumber("MI"), number.toRoman());
    }

    @Test
    @DisplayName("2006 should be MMVI")
    public void test2006(){
        var number = new RegularNumber(2006);
        assertEquals(new RomansNumber("MMVI"), number.toRoman());
    }

    @Test
    @DisplayName("2708 should be MMDCCVIII")
    public void test2708(){
        var number = new RegularNumber(2708);
        assertEquals(new RomansNumber("MMDCCVIII"), number.toRoman());
    }

    @Test
    @DisplayName("3000 should be MMM")
    public void test3000(){
        var number = new RegularNumber(3000);
        assertEquals(new RomansNumber("MMM"), number.toRoman());
    }
}
