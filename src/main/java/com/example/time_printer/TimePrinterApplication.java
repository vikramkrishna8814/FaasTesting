package com.example.time_printer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class TimePrinterApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(TimePrinterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TimePrinterApplication.class, args);
	}

	@Override
	public void run(String... args) {
		TimePrinter timePrinter = new TimePrinter();
		timePrinter.startPrinting();
	}
}