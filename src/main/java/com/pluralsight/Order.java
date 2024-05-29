package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private List<Sandwich> sandwiches;
    private List<Drinks> drinks;
    private List<Chips> chips;
    private List<OrderItem> items;


    public Order(List<Sandwich> sandwiches, List<Drinks> drinks, List<Chips> chips, List<OrderItem> items) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.items = items;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" *-*-*-*-*- Order Screen *-*-*-*-*");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. CheckOut");
            System.out.println("5. Return to Home Screen");
            System.out.println("0. Cancel Order");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {

                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    return;
                case 0:
                    cancelOrder();
                    return;

                default:
                    System.out.println("Invalid choice");

            }

        }

    }

    public void addSandwich() {
        Scanner scanner = new Scanner(System.in);

        // prompt the user for sandwich details
        System.out.println("Add sandwich");
        System.out.println("\nselect bread type: \n" +
                           "(only type the number)\n" +
                           "1. white\n" +
                           "2. Wheat\n" +
                           "3. Rye\n" +
                           "4. Wrap\n");

        int breadChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter sandwich size: \n" + "(" +
                "1. 4" +
                "2. 8" +
                "3. 12 inches): ");
        int sizeChoice = scanner.nextInt();
        scanner.nextLine();

        // prompt the user for toppings
        System.out.println("Select Toppings: \n" + ",");
        System.out.println("-----VEGETABLE------\n");
        System.out.println("1. -lettuce\n" +
                           "2. -peppers\n" +
                           "3. -onions\n" +
                           "4. -tomatoes\n" +
                           "5. -jalapenos\n" +
                           "6. -cucumber\n" +
                           "7. -pickles\n" +
                           "8. -guacamole\n" +
                           "9. -mushrooms\n");

        int topping = scanner.nextInt();
        scanner.nextLine();

        System.out.println("------MEAT------\n");
        System.out.println("1. -steak\n" +
                           "2. -ham\n" +
                           "3. -salami\n" +
                           "4. -roast beef\n" +
                           "5. -chicken\n" +
                           "6. -bacon\n");


        System.out.println("----CHEESE-----\n");
        System.out.println("1. -american cheese\n" +
                           "2. -provolone cheese\n" +
                           "3. -cheddar cheese\n" +
                           "4. -swiss cheese\n");

        String toppingsInput = scanner.nextLine();
        String[] toppingsArray = toppingsInput.split(",");


        // prompt the user for sauces
        System.out.println("Select sauces:\n" + "," +
                           "1. -mayo\n" +
                           "2. -mustard\n" +
                           "3. -ketchup\n" +
                           "4. -ranch\n" +
                           "5. -thousand islands\n" +
                           "6. -vinaigrette\n");

        String saucesInput = scanner.nextLine();
        String[] saucesArray = saucesInput.split(",");

        // prompt the user if they want sandwich toasted
        System.out.print("\nWould you like sandwich toasted? (yes/no):");
        String toastedChoice = scanner.nextLine();
        boolean toasted = toastedChoice.equalsIgnoreCase("yes");

        // prompt the user if they want extra cheese
        System.out.print("\nDo you want extra cheese? (yes/no): ");
        String extraCheeseChoice = scanner.nextLine();
        boolean extraCheese = extraCheeseChoice.equalsIgnoreCase("yes");

        //prompt the user if the want extra meat
        System.out.println("\nDo you want extra meat? (yes/no): ");
        String extraMeatChoice = scanner.nextLine();
        boolean extraMeat = extraMeatChoice.equalsIgnoreCase("yes");

        //prompt the user if they want to add sides
        System.out.println("\nDo you want to add sides? (yes/no): ");
        String addSidesChoice = scanner.nextLine();
        boolean addSides = addSidesChoice.equalsIgnoreCase("yes");





        }











    }

}
