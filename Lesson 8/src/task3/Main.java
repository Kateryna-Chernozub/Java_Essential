package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *  Created by Kateryna Chernozub on 21-22.10.2020
 */

public class Main {
    public static void main(String[] args) {
        Price[] price = new Price[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< price.length; i++) {

            System.out.println("Product name: ");
            String name = scanner.nextLine();

            System.out.println("Shop name: ");
            String shopName = scanner.nextLine();

            System.out.println("Product cost: ");
            String cost = scanner.nextLine();

            price[i] = new Price(name, shopName, cost);
        }

        for( int i = 0; i < price.length; i++){
            System.out.println(price[i].toString());
        }

        // Try to sort string. Not successful.
  /*      Arrays.sort(price, new Comparator<Price>() {
            public int compare(Price o1, Price o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
  */ }
}
