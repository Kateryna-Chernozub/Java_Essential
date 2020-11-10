package task3;

import java.util.Scanner;

public class Distance {
    double distance;

    public void print(){
        System.out.println("Some distance.");
    }

    public  static class Converter{
        public static void converterMeterToCentimeter ( double distance) {
            System.out.println( distance + " meters its " + distance * 100 + " centimeters");
        }

        public static void converterMeterToKilometers ( double distance) {
            System.out.println( distance + " meters its " + distance / 1000 + " kilometers");
        }

        public static void converterMeterToMiles ( double distance) {
            System.out.println( distance + " meters its " + distance / 6213 + " miles");
        }
    }
}

class Main{
    public static void main(String[] args) {
//      System.out.println("Enter a number to convert");
//      Scanner scanner = new Scanner(System.in);
//      double distance = scanner.nextDouble();

       // Distance.Converter converter = new Distance().new Converter();
        Distance.Converter.converterMeterToCentimeter(1);
        Distance.Converter.converterMeterToKilometers(1000);
        Distance.Converter.converterMeterToMiles(3160);
    }
}