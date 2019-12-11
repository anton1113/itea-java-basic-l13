package com.itea.java.basic.l12.practice;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerExample {

    public static void main(String[] args) throws IOException, SecurityException {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Logger logger = Logger.getLogger("My logger");

        FileHandler fileHandler = new FileHandler("log-" + localDateTime.format(dateTimeFormatter) + ".txt");
        logger.addHandler(fileHandler);

        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        for (int i = 0; i < 1; i++) {
            logger.log(Level.INFO, "My first log message #" + i);
        }
    }
}
