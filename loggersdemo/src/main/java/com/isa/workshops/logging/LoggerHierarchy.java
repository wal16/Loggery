package com.isa.workshops.logging;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerHierarchy {

    private static Logger logger1 = Logger.getLogger(LoggerHierarchy.class.getName()); // korzystam z nazwy classy,
    // a nie z getName bo mamy private static

    private static Logger logger2  = Logger.getLogger(LoggerHierarchy.class.getPackage().getName());


    public void loggerMethod1() {
        for (int i = 0; i < 10 ; i++) {
            if (i % 2==0 ){
                logger1.log(Level.WARNING, "EVEN number: {0} with logger name{1}",
                        new Object[]{String.valueOf(i), logger1.getName() });
            }
            else {
                logger1.log(Level.SEVERE, "ODD number: {0} with logger name {1}",
                        new Object[]{String.valueOf(i), logger1.getParent().getName()});
            }

        }
    }


    public static void main(String[] args) {
        LoggerHierarchy loggingHierarchy = new LoggerHierarchy();
        loggingHierarchy.loggerMethod1();


    }

}
