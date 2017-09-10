package org.think.ex;

public class ExTwoTuple<T,S> {
    public final T first;
    public final S second;

    public ExTwoTuple(T a, S b) {
        first = a;
        second = b;
    }


    public String toString() {
        return "(" + first + "." + second + ")";
    }

    public static void main(String [] args) {
        ExTwoTuple<String, String> oTupleStr = new ExTwoTuple<String, String>("abc", "123");
        ExTwoTuple<Integer, Integer> oTupleint = new ExTwoTuple<Integer, Integer>(1, 100);
        System.out.println(oTupleStr);
        System.out.println(oTupleint);
    }
}
