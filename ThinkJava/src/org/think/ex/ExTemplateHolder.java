package org.think.ex;

class Automobile {

}

public class ExTemplateHolder<T> {

    private T data;

    public ExTemplateHolder(T varData) {
        this.data = varData;
    }

    public void set(T varData) {
        this.data = varData;
    }

    public T get() {
        return this.data;
    }

    public static void main(String[] args) {
        ExTemplateHolder<Automobile> varHolder =
                new ExTemplateHolder<Automobile>(new Automobile());
        Automobile varMobile = varHolder.get();
    }
}
