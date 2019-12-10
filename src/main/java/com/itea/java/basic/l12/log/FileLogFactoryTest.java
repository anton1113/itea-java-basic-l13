package com.itea.java.basic.l12.log;

import java.util.logging.Level;

public class FileLogFactoryTest {

    public static void main(String[] args) {

        FileLoggerFactory.getLogger().log(Level.INFO, "Some info");
    }
}
