package org.think.ex;

import java.io.IOException;

class SimpleException extends Exception {

    SimpleException() {

    }

    SimpleException(String strEx) {

        super(strEx);
    }
}

class ComplexException extends Exception {
    ComplexException(String strEx) {
        super(strEx);
    }
}


public class ExTryCatch {

    // 如果声明的异常规范与显式throw语句抛出的异常类型不同，则编译不通过
    // 如果没有声明异常规范，但有显式的调用throw语句，则也同样编译不过.
    // 如果没有声明异常规范或者声明了异常规范，但没有显式调用throw语句抛出异常，而是运行时产生的异常，可以编译通过
    public void doException() throws SimpleException {
        System.out.println("throw SimpleException!");
        throw new SimpleException("Hello Exception");
    }

    public void doNullException() throws ComplexException {
        try {
            String strNull = null;
            System.out.println(strNull.length());
        }
        catch (Exception ex) {
            ComplexException varComplexEx = new ComplexException("Complex Exception!");
            varComplexEx.initCause(ex);
            throw varComplexEx;
        }
    }

    public static void main(String[] args) {

        ExTryCatch oTryEx = new ExTryCatch();
        try {
            oTryEx.doException();
            //oTryEx.doNullException();

        }
        catch (SimpleException ex) {
            System.out.println("Catch SimpleException!");
            System.out.println("What() = " + ex.getMessage());
            System.out.println("ToString() = " + ex.toString());
            ex.printStackTrace(System.out);
        }
        catch (Exception ex) {
            // 捕获所有的异常.
            System.out.println("Catch Exception :" + ex.getMessage());
            System.out.println("ToString() = " + ex.toString());
            ex.printStackTrace(System.out);
        }
        finally {
            // 即使捕获了异常，也会执行finally从句中的内容. finally从句中用于关闭资源.
            System.out.println("Catch UnKnownException!");
        }

        try {
            oTryEx.doNullException();
        }
        catch (ComplexException ex)
        {
            System.out.println(ex);
            ex.printStackTrace(System.out);
            System.out.println(ex.getCause());
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

    }
}
