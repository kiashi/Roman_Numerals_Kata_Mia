package org.kata.roman.numerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.kata.roman.numerals.record.RomansNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("#2 - Test convert Romans number to a Regular number")
public class RomansNumberTest {

    @Test
    @DisplayName("XIV should be 14")
    public void testXIV(){
        var romanNumber = new RomansNumber("XIV");
        assertEquals(14, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("XXXVI should be 36")
    public void testXXXVI() {
        var romanNumber = new RomansNumber("XXXVI");
        assertEquals(36, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("IX should be 9")
    public void testIX() {
        var romanNumber = new RomansNumber("IX");
        assertEquals(9, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("XIII should be 13")
    public void testXIII() {
        var romanNumber = new RomansNumber("XIII");
        assertEquals(13, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("XVI should be 16")
    public void testXVI() {
        var romanNumber = new RomansNumber("XVI");
        assertEquals(16, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("CDLIV should be 454")
    public void testCDLIV() {
        var romanNumber = new RomansNumber("CDLIV");
        assertEquals(454, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("XLI should be 41")
    public void testXLI() {
        var romanNumber = new RomansNumber("XLI");
        assertEquals(41, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("LVII should be 57")
    public void testLVII() {
        var romanNumber = new RomansNumber("LVII");
        assertEquals(57, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("DCCXI should be 711")
    public void testDCCXI() {
        var romanNumber = new RomansNumber("DCCXI");
        assertEquals(711, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("CCCXL should be 340")
    public void testCCCXL() {
        var romanNumber = new RomansNumber("CCCXL");
        assertEquals(340, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("MCCXXXIV should be 1234")
    public void testMCCXXXIV() {
        var romanNumber = new RomansNumber("MCCXXXIV");
        assertEquals(1234, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("MCMLXXXIX should be 1989")
    public void testMCMLXXXIX() {
        var romanNumber = new RomansNumber("MCMLXXXIX");
        assertEquals(1989, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("MMCXXXVIII should be 2138")
    public void testMMCXXXVIII() {
        var romanNumber = new RomansNumber("MMCXXXVIII");
        assertEquals(2138, romanNumber.toRegularNumber());
    }

    @Test
    @DisplayName("MMCCXXII should be 2222")
    public void testMMCCXXII() {
        var romanNumber = new RomansNumber("MMCCXXII");
        assertEquals(2222, romanNumber.toRegularNumber());
    }
}
