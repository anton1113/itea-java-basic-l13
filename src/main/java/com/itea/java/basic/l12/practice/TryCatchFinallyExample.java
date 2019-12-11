package com.itea.java.basic.l12.practice;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            System.out.println("Try");
            int i = 1 / 0;
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Try");
        int i = 1 / 0;
        System.out.println("Finally");

        try {
            throw new Exception();
        } catch (Exception e) {
//            throw e;
        }
    }
}
