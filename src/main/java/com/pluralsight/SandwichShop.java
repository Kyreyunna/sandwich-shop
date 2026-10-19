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

        System.out.print("Is the sandwich (1)large or (2)regular? Enter number: ");
        float sandwichSize=scanner.nextInt();
        scanner.nextLine();

        float price = adolescentAge +sandwichSize;
               float adolescentAge =.10f;

        if (adolescentAge<17){
            price= adolescentAge + sandwichSize;
        } else {
            price= elderlyAge * sandwichSize;

        }
        System.out.print(price);

        +sandwichSize


        System.out.println("How old are you? :");


    }
}
