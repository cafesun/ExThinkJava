package org.think.ex;
import java.util.*;

public class ExStringBuilder {

    public static void main(String[] args) {

        StringBuilder oBuilder = new StringBuilder("cafe sun");
        System.out.println(oBuilder);
        int iPos = oBuilder.indexOf(" ");
        oBuilder.delete(iPos, oBuilder.length() - 1);
        System.out.println(oBuilder);
    }

}
