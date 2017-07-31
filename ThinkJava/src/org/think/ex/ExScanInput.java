package org.think.ex;

import java.io.*;
import java.util.Scanner;

public class ExScanInput {

    public static void main(String args[]) {
        Scanner oScanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("What's your name?");
        String strName = oScanner.next();
        System.out.println("How old are you? What's your favorite double?");
        System.out.println("<age> <double>");
        int iAge = oScanner.nextInt();
        double dValue = oScanner.nextDouble();
        System.out.printf("age = %d, double = %f", iAge, dValue);
    }
}
