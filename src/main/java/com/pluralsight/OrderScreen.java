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
            Sandwich.addTopping(meatTopping);
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

        System.out.println("----CHEESE-----");
        System.out.println("7. AMERICAN" );
        System.out.println("8. PROVOLONE");
        System.out.println("9. CHEDDAR");
        System.out.println("10. SWISS");
        System.out.println("CHOOSE A CHEESE: ");
        int cheese = scanner.nextInt();
        Topping cheeseTopping = Topping.values()[cheese -1];
        Sandwich.addTopping(cheeseTopping);

        // prompt the user if they want extra cheese
        System.out.print("WOULD YOU LIKE EXTRA CHEESE ? (YES/NO): ");
        String extraCheese = scanner.next().toUpperCase();
       if (extraCheese.equalsIgnoreCase("yes")){
           Extras choice = new Extras (ExtraChoice.EXTRA_CHEESE, sandwichSize);
           order.addOrder(choice);
       }

        // prompt the user if they want sandwich toasted
        System.out.print("WOULD YOU LIKE IT TOASTED ? (YES/NO):");
        boolean choice = Boolean.parseBoolean(scanner.next());
        if (choice){
            sandwich1.setToasted(true);
        }
        boolean done = false;
        while (!done){

            // prompt the user for toppings

            System.out.println("-----VEGETABLE------");
            System.out.println("11. LETTUCE");
            System.out.println("12. PEPPER");
            System.out.println("13. ONION");
            System.out.println("14. TOMATOES");
            System.out.println("15. JALAPENOS");
            System.out.println("16. CUCUMBER");
            System.out.println("17. PICKLES");
            System.out.println("18. GUACAMOLE");
            System.out.println("19. MUSHROOMS");
            System.out.println("0. DONE WITH TOPPINGS");
            System.out.println("CHOOSE TOPPINGS: ");

            int topping = scanner.nextInt();
            if (topping == 0){
                done = true;
            }


        }

















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
