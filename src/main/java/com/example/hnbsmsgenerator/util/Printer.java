package com.example.hnbsmsgenerator.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Printer {
    private Printer() {
    }


    public static void print(String str) throws IOException {
        Logger logger = Logger.getLogger(Printer.class.getName());

        FileHandler fileHandler;
        try
        {
            fileHandler = new FileHandler("C:\\Users\\danidu_o\\Desktop\\My Works\\HNB SMS\\logs\\" + java.time.LocalDate.now() + ".txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.log(Level.INFO,str);
            fileHandler.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void printStatus(String str) throws IOException {
        Logger logger = Logger.getLogger(Printer.class.getName());

        FileHandler fileHandler;
        try
        {
            fileHandler = new FileHandler("C:\\Users\\danidu_o\\Desktop\\My Works\\HNB SMS\\logs\\" + "status-"+ java.time.LocalDate.now() + ".txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.log(Level.WARNING,str);
            fileHandler.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
