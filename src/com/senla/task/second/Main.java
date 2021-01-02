package com.senla.task.second;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        int n, m;

        System.out.println("\n");
        System.out.println("Enter the number");

        try {
            n = scanner.nextInt();
            m = scanner.nextInt();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong input, please, try again");
            scanner.nextLine();
            return;
        }

        System.out.println("The greatest common divisor is: " + DivisibilityAnalyzer.gcd(m, n));
        System.out.println("The least common multiple is: " + DivisibilityAnalyzer.lcm(m, n));
    }

    public static void main(String[] args) {
        while (true)
            runInterface();
    }
}
