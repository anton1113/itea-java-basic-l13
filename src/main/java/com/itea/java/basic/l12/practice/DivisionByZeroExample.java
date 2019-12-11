package com.itea.java.basic.l12.practice;

import java.util.Scanner;

public class DivisionByZeroExample {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        division();
    }

    private static void division() {
        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        divide(a, b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
