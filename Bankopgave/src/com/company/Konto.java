package com.company;

public class Konto {
    private int kontonummer;
    private String ejernavn;
    private double saldo;

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Kontonummer: " + kontonummer + "\n" +
                "Ejernavn: " + ejernavn + "\n" +
                "Saldo: " + saldo;
    }

    public double indsæt(double beløb) {
        this.saldo += beløb;
        return this.saldo;
    }

    public double hæv(double beløb) {
        if(beløb <= this.saldo) {
            this.saldo -= beløb;
            return this.saldo;
        } else {
            return -1;
        }
    }

    public void overfør(double beløb, int kontonummer) {
        if(beløb+5 <= this.saldo) {
            hæv(beløb);
            this.saldo -= 5;

        }
    }


    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getEjernavn() {
        return ejernavn;
    }

    public void setEjernavn(String ejernavn) {
        this.ejernavn = ejernavn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
