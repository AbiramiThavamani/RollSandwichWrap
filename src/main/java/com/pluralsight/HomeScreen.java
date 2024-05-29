package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        boolean exit = false;

        while (!exit){
            System.out.println("-------SANDWICH SHOP-----");
            System.out.println("1. NEW ORDER");
            System.out.println("0. EXIT");

            System.out.print("ENTER OPTION:");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.orderScreen();
                    break;
                case 0:
                    System.out.println("EXIT THANK YOU!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option ");
            }
            
        }
    }
}
