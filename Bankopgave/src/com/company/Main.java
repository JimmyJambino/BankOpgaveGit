package com.company;

import java.util.Scanner;

public class Main {

    public String inputString() {
        Scanner in = new Scanner(System.in);
        String brugerinput = in.nextLine();
        return brugerinput;
    }

    public static int inputInt() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            int temp;
            while ()
                System.out.println("Indsæt venligst et helt tal: \n");
            in.nextInt();

        }
        int brugerinput = in.nextInt();
        return brugerinput;
    }

    public String inputDouble() {
        Scanner in = new Scanner(System.in);

        String brugerinput = in.nextLine();
        return brugerinput;
    }


    public static void main(String[] args) {

    }
}