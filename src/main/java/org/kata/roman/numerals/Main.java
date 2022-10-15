package org.kata.roman.numerals;

import org.kata.roman.numerals.record.Number;
import org.kata.roman.numerals.record.RomansNumber;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------START MAIN ROMANS NUMBER KATA---------------");

        System.out.println("----REGULAR NUMBER  => ROMAN NUMBER----");

        var number90 = new Number(90);
        var romanNumberXC = number90.toRoman();
        System.out.println(romanNumberXC + " => 90");

        assert "XC".equals(romanNumberXC);

        var number541 = new Number(541);
        var romanNumberDXLI = number541.toRoman();
        System.out.println(romanNumberDXLI + " => 541");

        assert "DXLI".equals(romanNumberDXLI);

        System.out.println("----ROMAN NUMBER => REGULAR NUMBER----");

        var romanNumber = new RomansNumber("DCCLXXXIX");
        var number789 = romanNumber.toRegularNumber();
        System.out.println(number789 + " => DCCLXXXIX");

        assert number789 == 789;

        var romanNumberMMCMXCIX = new RomansNumber("MMCMXCIX");
        var number2999 = romanNumberMMCMXCIX.toRegularNumber();
        System.out.println(number2999 + " => MMCMXCIX");

        assert number2999 == 2999;

        System.out.println("--------------THANKS---------------");
    }
}

