package com.itea.java.basic.l12;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionExample {

    private static final Logger log = Logger.getLogger(ExceptionExample.class.getSimpleName());

    // example throwing my custom exception
    public static void main(String[] args) throws Exception {
        try {
            // опасный кусок кода
        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception occurred! " + e.getMessage());
            throw e;
        }
    }

    private static void foo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("wow");
    }
}
