package com.itea.java.basic.l12.log;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLoggerFactory {

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd-HH-mm-ss";

    public static Logger getLogger() {
        try {
            Logger logger = Logger.getLogger("my-logger");
            FileHandler fileHandler = new FileHandler(generateLogFilename());
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
            return logger;
        } catch (IOException e) {
            e.getStackTrace();
            return null;
        }
    }

    private static String generateLogFilename() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        String dateTimeString = LocalDateTime.now().format(formatter);
        return "log " + dateTimeString + ".txt";
    }
}
