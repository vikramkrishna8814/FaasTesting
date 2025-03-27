package com.example.time_printer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalTime;

public class TimePrinter {
    private static final Logger logger = LoggerFactory.getLogger(TimePrinter.class);

    public void startPrinting() {
        while (true) {
            logger.info("Current Time: {}", LocalTime.now());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.error("Thread interrupted", e);
                break;
            }
        }
    }
}
