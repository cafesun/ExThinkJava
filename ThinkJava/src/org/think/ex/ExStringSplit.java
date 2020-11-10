package org.think.ex;

import java.util.Arrays;

public class ExStringSplit {
    public static String knight = "Then, when you have found the shurrybery. You must " +
            "cut down the mightiest tree in the forest... " +
            "with ...... a herring";

    public static void split(String strRegex) {
        System.out.println(
                Arrays.toString(knight.split(strRegex)));
    }

    public static void main(String[] argv) {
        split(" ");
        split("\\W+");
        split("n\\W+");

    }
}
