package main;

import java.util.Scanner;

import static java.lang.System.*;

public class Shop {



    public static void main(String[] args){

        Customers[] customers;
            customers = new Customers[3];
            customers[0] = new Customers(11, "Nick", "Black", 500.0);
            customers[1] = new Customers(12, "John", "Green", 750.0);
            customers[2] = new Customers(13, "Ann", "Kris", 1000.0);
        Products[] products;
            products = new Products[3];
            products[0] = new Products(1, "Bread", 13.5);
            products[1] = new Products(2, "Milk", 27.5);
            products[2] = new Products(3, "Meat", 102.5);
            for (int i = 0; i <= 2; i++) {
                System.out.println(customers[i]);
            }
        for (int j = 0; j <= 2; j++) {
            System.out.println(products[j]);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Customer id: ");
        int customerIncomeId = in.nextInt();

        System.out.println("Product id: ");
        int productIncomeId = in.nextInt();
        
       System.out.printf("CustomerId: %d ProductId: %d", customerIncomeId, productIncomeId);
        in.close();


    }
}
