package com.senla.task.first;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        int number;

        System.out.println("\n");
        System.out.println("Enter the number");

        try {
            number = scanner.nextInt();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong input, please, try again");
            scanner.nextLine();
            return;
        }

        if (number <= 0)
            System.out.println("The number is zero or less - it's neither a composite nor a prime one");
        else if (NumberAnalyzer.isComposite(number))
            System.out.println("The number is composite");
        else System.out.println("The number is prime");


        if (NumberAnalyzer.isEven(number))
            System.out.println("The number is even");
        else System.out.println("The number is odd");

    }

    public static void main(String[] args) {

        while (true){
            runInterface();
        }
    }
}
