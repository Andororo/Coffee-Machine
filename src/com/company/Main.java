package com.company;
import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    public static void main(String[] args) {
        // write your code here
        String action;
        String option;
        do  {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scan.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("\nWhat do you want buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - main menu:");
                    option = scan.nextLine();
                    switch (option) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water! ");
                                break;
                            }else {
                                System.out.println("I have enough resources, making you a coffee");
                                water -= 250;
                                beans -= 16;
                                cups -= 1;
                                money += 4;
                            }
                            break;
                        case "2":
                            //something here
                            if (water < 350) {
                                System.out.println("Sorry, not enough water! ");
                                break;
                            }else {
                                System.out.println("I have enough resources, making you a coffee");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                money += 7;
                            }
                            break;
                        case "3":
                            //something here
                            if (water < 200) {
                                System.out.println("Sorry, not enough water! ");
                                break;
                            }else {
                                System.out.println("I have enough resources, making you a coffee");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                money += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water fo you want to add:");
                    //initial water plus added water
                    water += scan.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    //initial milk plus added milk
                    milk += scan.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    //initial coffee beans plus added beans
                    beans += scan.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    //initial cups plus added cups
                    cups += scan.nextInt();
                    scan.nextLine();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money -= money;
                    break;
                case "remaining":
                    intialAmount();
                    break;
            }
        }while (!action.equals("exit"));
    }
    public static void intialAmount() {
        System.out.println("\nThe coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}
