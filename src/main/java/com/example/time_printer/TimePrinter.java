package com.example.time_printer;

import java.time.LocalTime;

public class TimePrinter {
    public void startPrinting() {
        while (true) {
            System.out.println("Current Time: " + LocalTime.now());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
                break;
            }
        }
    }
}
