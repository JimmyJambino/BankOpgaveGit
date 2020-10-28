package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Konto> kontoList = new ArrayList<>();

    public static String inputString(String prompts) {
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

    public static Double inputDouble(String prompt) {
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

    //TODO: Tilføj kontonummer ved oprettelse
    public static void opretNyKonto() {
        Konto konto = new Konto(inputDouble("Start saldo: "));
        kontoList.add(konto);
    }


    public static Konto findKonto(int kontonummer) {

        for (Konto konto : kontoList) {
            if(konto.getKontonummer() == kontonummer) {
                return konto;
            }
        }
        System.out.println("Kontoen findes ikke");
        return null;

    }

    public static void main(String[] args) {

        // TODO: Menu med valgmuligheder
        // Hurtig hardcoded kode så vi kan se at det virker
        opretNyKonto(); // 0 i kontolist, og kontonummer = 0
        kontoList.get(0).setKontonummer(0);
        System.out.println("Saldo 0: " + kontoList.get(0).getSaldo()); // ser saldoen

        opretNyKonto(); // 1 i kontolist, og kontonummer = 1
        kontoList.get(1).setKontonummer(1);
        System.out.println("Saldo 1: " + kontoList.get(1).getSaldo()); // ser saldoen


        kontoList.get(0).overfør(100,findKonto(1));
        System.out.println("Saldo 0: " + kontoList.get(0).getSaldo()); // ser saldoen
        System.out.println("Saldo 1: " + kontoList.get(1).getSaldo()); // ser saldoen

    }
}