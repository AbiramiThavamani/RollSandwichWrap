package com.pluralsight;

import com.pluralsight.interfaces.Topping;

import java.util.Scanner;

public class OrderScreen {
    Scanner scanner = new Scanner(System.in);
    private Order order;

    public OrderScreen(Order order) {
        this.order = order;
    }

    public void orderScreen() {
      boolean exit = false;

        while (!exit) {
            System.out.println(" *-*-*-*-*- Order Screen *-*-*-*-*");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. CheckOut");
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
                case 0:
                    System.out.println("\n Cancel order");
                  exit = true;
                default:
                    System.out.println("Invalid choice");

            }

        }

    }

    private void addSandwich() {

        // prompt the user for sandwich details
        System.out.println("-----SANDWICH BREAD----");
        System.out.println("1. WHITE");
        System.out.println("2. WHEAT");
        System.out.println("3. RYE");
        System.out.println("4. WRAP");

        System.out.println("CHOOSE A BREAD: ");
        int bread = scanner.nextInt();
        SandwichBread sandwichBread = SandwichBread.values()[bread -1];
        scanner.nextLine();
        System.out.println("-----SANDWICH SIZE------");
        System.out.println("1. 4");
        System.out.println("2. 8");
        System.out.println("3. 12");
        System.out.println("CHOOSE A SIZE: ");
        int size = scanner.nextInt();
        SandwichSize sandwichSize = SandwichSize.values()[size - 1];
        Sandwich sandwich1 = new Sandwich(sandwichBread,sandwichSize);
        scanner.nextLine();

        System.out.println("------MEAT------");
        System.out.println("1. STEAK");
        System.out.println("2. HAM");
        System.out.println("3. SALAMI");
        System.out.println("4. ROAST BEEF");
        System.out.println("5. CHICKEN");
        System.out.println("6. BACON");
        System.out.println("0. NO MEAT ");
        System.out.println("CHOOSE A MEAT: ");
        int meat = scanner.nextInt();
        if (meat > 0){
            Topping meatTopping = Topping.values()[meat - 1];
            sandwich.addTopping(meatTopping);
        } else if (meat == 0) {
            System.out.println("No Meat");

        }
        //prompt the user if the want extra meat
        System.out.println("WOULD YOU LIKE EXTRA MEAT ? (yes/no): ");
        String extraChoice = scanner.next().toUpperCase();
          if (extraChoice.equalsIgnoreCase("yes")){
              Extras choice = new Extras(ExtraChoise.EXTRA_MEAT, sandwichSize);
              order.addOrder(choice);

          }




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



        //prompt the user if they want to add sides
        System.out.println("\nDo you want to add sides? (yes/no): ");
        String addSidesChoice = scanner.nextLine();
        boolean addSides = addSidesChoice.equalsIgnoreCase("yes");


           // sandwich object
        Bread breadType;
        switch (breadChoice){
            case 1:
                breadType = Bread.white;
                break;
            case 2:
                breadType = Bread.wheat;
                break;
            case 3:
                breadType = Bread.rye;
                break;
            case 4:
                breadType = Bread.wrap;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }






        }



}

}
