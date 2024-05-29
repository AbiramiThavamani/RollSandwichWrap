package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    private final Order order;

    public ReceiptManager(Order order) {
        this.order = order;
    }

    public void saveToFile(String receipt){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String fileName = formatter.format(LocalDateTime.now()) + ".txt";
        String directoryPath = "receipts";
        String filePath = directoryPath + "/" + fileName;

        // create directory if it does not exist
        Path directoryPathOb = Path.get(directoryPath);
        boolean directoryExists = Files.exists(directoryPathOb);
        if (!directoryExists){
            try {
                Files.createDirectories(directoryPathOb);
                System.out.println("Directory created successfully!");
            } catch (IOException e) {
                System.out.println("Failed to create directory!" + e.getMessage());

            }
        }
        try
            (PrintWriter writer = new PrintWriter(new FileWriter(filePath))){
            writer.println("Order Details: ");
            writer.println(order.getReceipt());
            writer.println("Total price: " + order.getTotalPrice());
            System.out.println("Receipt saved to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while trying to save the receipt. ");
            e.printStackTrace();
        }

    }
}
