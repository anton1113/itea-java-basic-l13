package com.itea.java.basic.l12.practice;

public class MyExceptionTest {

    public static void main(String[] args) {

        try {
            throw new MyException("Some message");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDescription());

            throw e;
        }
    }
}
