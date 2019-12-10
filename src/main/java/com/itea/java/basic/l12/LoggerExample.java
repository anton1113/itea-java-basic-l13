package com.itea.java.basic.l12;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerExample {

    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger("hello");

        FileHandler fileHandler = new FileHandler("log.txt");
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        logger.addHandler(fileHandler);

        logger.log(Level.SEVERE, "Error!");
    }
}
