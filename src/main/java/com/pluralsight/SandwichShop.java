package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Prompt the user for the size of the sandwich (1 or 2):
//        a. 1: Regular: base price $5.45
//        b. 2: Large: base price $8.95
//        Prompt the user for their age:
//        a. Student (17 years old or younger) – receive a 10% discount
//        b. Seniors (65 years old or older) – receive a 20% discount
//        c. Everyone else won't receive a discount
//        Display the cost of the sandwich to the screen

        double sandwichPrice= 8.95;
        //float sandwichPrice=5.45f;

        System.out.print("Enter size. (1)large or (2)regular sandwich: ");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

        if (sandwichSize == 1) {
            System.out.print("Your large sandwich price is $8.95");
        }

           if(sandwichSize>=2) {
               System.out.println("Your regular sandwich price is $5.45");
           }

        System.out.println("Enter age:");
        int age = scanner.nextInt();


        float elderlyDiscount = .2f;
        float adolescentDiscount = .10f;

        if (age <= 17) {
            double price1 = (sandwichPrice - (adolescentDiscount * sandwichPrice));


            double roundedPrice = Math.round(price1 * 100.0) / 100.0;
            System.out.print("price: " + roundedPrice);
        }


        if (age >= 65) {
            float price2;
            price2 = (sandwichSize - (elderlyDiscount * sandwichSize));
            double roundedPrice = Math.round(price2 * 100.0) / 100.0;
            System.out.print("price: " + roundedPrice);
        }
        else{
            System.out.print("price: " + sandwichSize);
        }

        //Exercise 2 Loaded Sandwich
        //regular add 1.00
        //large add 1.75


        System.out.print("    if you would like a loaded sandwich enter the price of size of sandwich. Otherwise enter 6: ");
        float loadedSandwich = scanner.nextFloat();


        if (loadedSandwich < 5.45) {
            float price3;
            float addedCost = 1.00f;
            price3 = addedCost + loadedSandwich;
            System.out.print("price: " + price3);
        } else if (loadedSandwich > 7.00) {
            float price4;
            float largeAddedCost = 1.75f;
            price4 = largeAddedCost + loadedSandwich;
            System.out.print("price: " + price4);

            //double roundedPrice2 = Math.round(price4 * 100.0) / 100.0;
            //System.out.print("price: " + roundedPrice2);
        } else  {
            System.out.print("you do not want a loaded sandwich       " + "" +
                    "");


            }


        }
    }

