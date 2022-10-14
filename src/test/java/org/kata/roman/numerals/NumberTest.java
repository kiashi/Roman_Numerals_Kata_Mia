package org.kata.roman.numerals;

import org.junit.jupiter.api.Test;
import org.kata.roman.numerals.record.Number;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {

    @Test
    public void test1(){
        var number = new Number(1);
        assertEquals("I", number.toRoman());
    }

    @Test
    public void test2(){
        var number = new Number(2);
        assertEquals("II", number.toRoman());
    }

    @Test
    public void test14(){
        var number = new Number(14);
        assertEquals("XIV", number.toRoman());
    }

    @Test
    public void test19(){
        var number = new Number(19);
        assertEquals("XIX", number.toRoman());
    }

    @Test
    public void test30(){
        var number = new Number(30);
        assertEquals("XXX", number.toRoman());
    }

    @Test
    public void test36(){
        var number = new Number(36);
        assertEquals("XXXVI", number.toRoman());
    }

    @Test
    public void test40(){
        var number = new Number(40);
        assertEquals("XL", number.toRoman());
    }

    @Test
    public void test55(){
        var number = new Number(55);
        assertEquals("LV", number.toRoman());
    }

    @Test
    public void test90(){
        var number = new Number(90);
        assertEquals("XC", number.toRoman());
    }

    @Test
    public void test150(){
        var number = new Number(150);
        assertEquals("CL", number.toRoman());
    }

    @Test
    public void test208(){
        var number = new Number(208);
        assertEquals("CCVIII", number.toRoman());
    }

    @Test
    public void test344(){
        var number = new Number(344);
        assertEquals("CCCXLIV", number.toRoman());
    }

    @Test
    public void test560(){
        var number = new Number(560);
        assertEquals("DLX", number.toRoman());
    }

    @Test
    public void test661(){
        var number = new Number(661);
        assertEquals("DCLXI", number.toRoman());
    }

    @Test
    public void test902(){
        var number = new Number(902);
        assertEquals("CMII", number.toRoman());
    }

    @Test
    public void test1001(){
        var number = new Number(1001);
        assertEquals("MI", number.toRoman());
    }

    @Test
    public void test2006(){
        var number = new Number(2006);
        assertEquals("MMVI", number.toRoman());
    }

    @Test
    public void test3000(){
        var number = new Number(3000);
        assertEquals("MMM", number.toRoman());
    }
}
