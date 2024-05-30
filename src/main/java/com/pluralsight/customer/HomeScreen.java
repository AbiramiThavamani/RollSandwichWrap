package com.pluralsight.customer;

import java.util.Scanner;

public class HomeScreen {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        boolean exit = false;

        while (!exit){

            System.out.println("\n-----{---%%-----WELCOME TO ROLL SANDWICH WRAP ----%%---}-----\n");

            System.out.println("1. NEW ORDER...");
            System.out.println("0. EXIT");

            System.out.print("\nENTER OPTION:");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.orderScreen();
                    break;
                case 0:
                    System.out.println("EXIT THANK YOU FOR YOUR ORDER!");
                   return;
                default:
                    System.out.println("Invalid option ");
            }

        }
    }
}
