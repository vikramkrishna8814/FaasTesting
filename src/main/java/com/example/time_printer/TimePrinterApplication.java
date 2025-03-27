package com.example.time_printer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimePrinterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TimePrinterApplication.class, args);
	}

	@Override
	public void run(String... args) {
		TimePrinter timePrinter = new TimePrinter();
		timePrinter.startPrinting();
	}
}