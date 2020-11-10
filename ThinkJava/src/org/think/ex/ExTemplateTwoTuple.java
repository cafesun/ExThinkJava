package org.think.ex;

public class ExTemplateTwoTuple<T,S> {
    public final T first;
    public final S second;

    public ExTemplateTwoTuple(T a, S b) {
        first = a;
        second = b;
    }


    public String toString() {
        return "(" + first + "." + second + ")";
    }

    public static void main(String [] args) {
        ExTemplateTwoTuple<String, String> oTupleStr = new ExTemplateTwoTuple<String, String>("abc", "123");
        ExTemplateTwoTuple<Integer, Integer> oTupleint = new ExTemplateTwoTuple<Integer, Integer>(1, 100);
        System.out.println(oTupleStr);
        System.out.println(oTupleint);
    }
}
