package com.company;

import java.util.Scanner;

public class Main {

    public String inputString(String prompts) {
        System.out.println(prompts);
        Scanner in = new Scanner(System.in);
        String brugerinput = in.nextLine();
        return brugerinput;
    }

    public static int inputInt(String prompt) {
        System.out.print(prompt);
        int input = 0;
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while (run) {
            int temp;
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.print("\nInvalid input.\nPlease type a number: ");
            }
            temp = scan.nextInt();
            if(temp > 0) {
                input = temp;
                return input;
            } else {
                System.out.print("\nPlease input a positive number: ");
            }
        }
        return input;
    }

    public Double inputDouble(String prompt) {
        System.out.print(prompt);
        double input = 0;
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while (run) {
            double temp;
            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.print("\nInvalid input.\nPlease type a number: ");
            }
            temp = scan.nextDouble();
            if(temp > 0) {
                input = temp;
                return input;
            } else {
                System.out.print("\nPlease input a positive number: ");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(inputInt("Insert number: "));

    }
}