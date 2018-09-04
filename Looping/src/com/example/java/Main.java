package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int choice;
         do {
             System.out.println("Choose your pizza order: ");
             System.out.println("1. Cheese");
             System.out.println("2. Cheese, pepperoni");
             System.out.println("3. Cheese, sausage");
             System.out.println("4. Cheese, bacon");
             System.out.println("5. Cheese, ham");
             choice = in.nextInt();
         }while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
         switch (choice)
         {
             case 1:
                 System.out.println("You selected: 1. Cheese");
                 break;
             case 2:
                 System.out.println("You selected: 2. Cheese, pepperoni");
                 break;
             case 3:
                 System.out.println("You selected: 3. Cheese, sausage");
                 break;
             case 4:
                 System.out.println("You selected: 4. Cheese, bacon");
                 break;
             case 5:
                 System.out.println("You selected: 5. Cheese, ham");
                 break;
         }
    }
}
