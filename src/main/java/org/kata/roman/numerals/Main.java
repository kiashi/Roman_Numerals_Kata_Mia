package org.kata.roman.numerals;

import org.kata.roman.numerals.record.RegularNumber;
import org.kata.roman.numerals.record.RomansNumber;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------START MAIN ROMANS NUMBER KATA---------------");

        System.out.println("----REGULAR NUMBER  <=> ROMAN NUMBER----");

        var number90 = new RegularNumber(90);
        var romanNumberXC = number90.toRoman();
        var regularNumberXC = romanNumberXC.toRegularNumber();
        System.out.println(number90.value() + " : [Romans Number : " + romanNumberXC.value() + " =>" + " Regular number : " + regularNumberXC.value() + "]");

        assert number90.compareTo(regularNumberXC) == 0;

        var number541 = new RegularNumber(541);
        var romanNumberDXLI = number541.toRoman();
        var regularNumberDXLI = romanNumberDXLI.toRegularNumber();
        System.out.println(number541.value() + " : [Romans Number : " + romanNumberDXLI.value() + " =>" + " Regular number : " + regularNumberDXLI.value() + "]");

        assert number541.compareTo(regularNumberDXLI) == 0;

        System.out.println("----ROMAN NUMBER <=> REGULAR NUMBER----");

        var romanNumber = new RomansNumber("DCCLXXXIX");
        var number789 = romanNumber.toRegularNumber();
        var romansNumber789 = number789.toRoman();
        System.out.println(romanNumber.value() + " : [Regular Number : " + number789.value() + " =>" + " Romans number : " + romansNumber789.value() + "]");

        assert romanNumber.compareTo(romansNumber789) == 0;

        var romanNumberMMCMXCIX = new RomansNumber("MMCMXCIX");
        var number2999 = romanNumberMMCMXCIX.toRegularNumber();
        var romansNumber2999 = number2999.toRoman();
        System.out.println(romanNumberMMCMXCIX.value() + " : Regular Number : " + number2999.value() + " =>" + " Romans number : " + romansNumber2999.value() + "]");

        assert romanNumberMMCMXCIX.compareTo(romansNumber2999) == 0;

        System.out.println("--------------THANKS---------------");
    }
}

