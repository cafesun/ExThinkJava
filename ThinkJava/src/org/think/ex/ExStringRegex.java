package org.think.ex;

import java.util.Arrays;

public class ExStringRegex {
    public static String knight = "Then, when you have found the shurrybery. You must " +
            "cut down the mightiest tree in the forest... " +
            "with ...... a herring";

    public static void split(String strRegex) {
        System.out.println(
                Arrays.toString(knight.split(strRegex)));
    }

    public static void main(String[] argv) {
//        split(" ");
//        split("\\W+");
//        split("n\\W+");

        String strSplit = "1000|2008-01-01|2222|cmcc|";
        String[] arSplit = strSplit.split("\\|");
        String[] arSplintN = strSplit.split("\\|", 2);
        for (int i = 0; i <arSplit.length; i++)
        {
            System.out.println(arSplit[i]);
        }
        System.out.println("End");

        for (String s : arSplintN)
        {
            System.out.println(s);
        }
        System.out.println("End");

        String strRegexInteger = "(-|\\+)?\\d+";
        String strNumber = "-1000";
        boolean bRet = strNumber.matches(strRegexInteger);
        System.out.printf("%s match %s result = %s\n", strNumber, strRegexInteger, bRet);

        String strMyBirthDay = "My BirthDay is 19811025";
        String strMyDaughterBirthDay = strMyBirthDay.replaceAll(strRegexInteger, "20110826");
        System.out.printf("Tiantian's birthday is %s\n", strMyDaughterBirthDay);
    }
}
