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
           return this.saldo -= beløb;
        } else {
            return -1;
        }
    }

    public void overfør(double beløb, Konto konto) {
        double gebyr = 5.0;
        if(beløb + gebyr <= this.saldo) {
            hæv(beløb+gebyr);
            konto.setSaldo(beløb);
        }
    }

    public int getKontonummer() {
        return this.kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getEjernavn() {
        return this.ejernavn;
    }

    public void setEjernavn(String ejernavn) {
        this.ejernavn = ejernavn;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double beløb) {
        this.saldo += beløb;
    }
}
