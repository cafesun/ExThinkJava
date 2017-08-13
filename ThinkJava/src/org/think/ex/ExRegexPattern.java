package org.think.ex;
import java.util.regex.*;


public class ExRegexPattern {

    public static void main(String[] argv) {
        if (argv.length < 2) {
            System.out.println("TestString Regex1,Regex2...");
            return;
        }
        System.out.println("Input \"" + argv[0] + "\"");
        for (String arg : argv) {
            System.out.println("Regex expression = " + arg);
            Pattern oRegex = Pattern.compile(arg);
            Matcher oMatcher = oRegex.matcher(argv[0]);
            while (oMatcher.find()) {
                System.out.println("Match \"" + oMatcher.group() + "\" at positions:" +
                        oMatcher.start() + " - " + (oMatcher.end() -1 ));
            }
        }


    }


}
