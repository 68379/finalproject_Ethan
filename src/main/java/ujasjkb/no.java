package ujasjkb;

import java.util.Scanner;

public class no {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("What kind of pizza do you like? \n" +
                    "Please choose from 1-3");
            System.out.print("" +
                    "1. Pepperoni \n" +
                    "2. Cheese \n" +
                    "3. Beef \n" +
                    "Your choice: ");
            int pizza = input.nextInt();
            if (pizza == 1) {
                String p = "pepperoni";
            } else if (pizza == 2) {
                String p =  "cheese";
            } else if (pizza == 3) {
                String p = "beef";
            } else
                System.out.println("Hey Choose a number between 1-3");



            System.out.println("What kind of topping would you like? \n" +
                    "Please choose from 1-3");
            System.out.print("" +
                    "1. Tomato \n" +
                    "2. Sausage \n" +
                    "3. Sauce \n" +
                    "Your choice: ");
            int topping = input.nextInt();
            if (topping == 1) {
                String t = "Tomato";
            } else if (topping == 2) {
                String t = "Sausage";
            } else if (topping == 3) {
                String t = "Sauce";
            } else
                System.out.println("Hey Choose a number between 1-3");

            System.out.println("What kind of side dish would you like? \n" +
                    "Please choose from 1-3");
            System.out.print("" +
                    "1. Fries \n" +
                    "2. Soda \n" +
                    "3. Bread \n" +"Your choice: ");
            int sd = input.nextInt();
            if (sd == 1) {
                String s = "fries";
            } else if (sd == 2) {
                String s = "soda";
            } else if (sd == 3) {
                String s = "bread";
            } else
                System.out.println("Hey Choose a number between 1-3");
        }
}

