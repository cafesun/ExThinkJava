package org.think.ex;

public class ExTemplateStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node (U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return this.item == null && this.next == null;
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public boolean end() {
        if (top == null) {
            return true;
        }
        else {
            return top.end();
        }
    }

    public static void main(String[] args) {
        ExTemplateStack<String> oStack = new ExTemplateStack<String>();
        for (String s : "Phaser of Satunm!".split(" ")) {
            oStack.push(s);
        }
        while (!oStack.end()) {
            String s = oStack.pop();
            System.out.println(s);
        }
    }
}
