package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class OrderScreen {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private  List<Chips> chips;

    public OrderScreen(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }


    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public void display(){
       Scanner scanner = new Scanner(System.in);

       while (true){
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


           switch (choice){

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
                   checkOut();
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

    public void addSandwich(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add sandwich");
        System.out.println("\nselect bread type: \n" +
                           "(only type the number)\n" +
                           "1. white\n" +
                           "2. Wheat\n" +
                           "3. Rye\n" +
                           "4. Wrap\n");

        int breadChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter sandwich size: \n" + "(4,8, or 12 inches): ");
        int sizeChoice = scanner.nextInt();
        scanner.nextLine();








    }

}
