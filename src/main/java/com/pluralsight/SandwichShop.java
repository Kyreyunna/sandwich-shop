package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        Prompt the user for the size of the sandwich (1 or 2):
//        a. 1: Regular: base price $5.45
//        b. 2: Large: base price $8.95
//        Prompt the user for their age:
//        a. Student (17 years old or younger) – receive a 10% discount
//        b. Seniors (65 years old or older) – receive a 20% discount
//        c. Everyone else won't receive a discount
//        Display the cost of the sandwich to the screen

        System.out.print("Enter price of sandwich: ");
        float sandwichSize=scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter age:");
        int age =scanner.nextInt();

        float price;
        float elderlyDiscount =.2f;
               float adolescentDiscount =.10f;

        if (age<=17){
            price= (sandwichSize - (adolescentDiscount * sandwichSize));


        double roundedPrice= Math.round(price*100.0)/100.0;
        System.out.print("price: " + roundedPrice);
        }


        if (age>=65) {
            price = (sandwichSize - (elderlyDiscount * sandwichSize));


            double roundedPrice2 = Math.round(price * 100.0) / 100.0;
            System.out.print("price: " + roundedPrice2);
        }






    }
}
