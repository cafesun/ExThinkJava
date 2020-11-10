package org.think.ex;
import java.util.*;

class ArrayAlg {
    // 泛型方法
    public static <T extends Comparable> T min(T[] varArray) {
        if (varArray == null || varArray.length == 0) {
            return null;
        }
        T varMin = varArray[0];
        for (int i = 0; i < varArray.length; i++) {
            if (varMin.compareTo(varArray[i]) > 0) {
                varMin = varArray[i];
            }
        }
        return varMin;
    }
}

public class ExTemplateAlgo {
    public static void main(String[] args) {
        GregorianCalendar[] arCalendar = new GregorianCalendar[]{
                new GregorianCalendar(2012, Calendar.AUGUST, 26),
                new GregorianCalendar(1981, Calendar.OCTOBER, 25),
                new GregorianCalendar(1984, Calendar.SEPTEMBER, 17)
        };
        GregorianCalendar var = ArrayAlg.min(arCalendar);
        System.out.println(var.getTime());
        System.out.println(var.get(Calendar.ZONE_OFFSET)/(60 * 60 * 1000));
    }
}
