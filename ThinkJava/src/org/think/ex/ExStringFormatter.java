package org.think.ex;

import java.util.*;

public class ExStringFormatter {

    public static void main(String args[]) {
        StringBuilder oStringBuilder = new StringBuilder();
        Formatter oFormat = new Formatter(oStringBuilder);
        oFormat.format("Today is %04d-%02d-%02d", 2017, 7, 31);
        System.out.println(oStringBuilder);

        Formatter oPrintFmt = new Formatter(System.out);
        String strValue = "World";
        oPrintFmt.format("Hello %s\n", strValue);

        String strFormat = String.format("%s is loser country", "India");
        System.out.println(strFormat);
    }
}
