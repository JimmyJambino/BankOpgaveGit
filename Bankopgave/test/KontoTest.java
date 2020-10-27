import com.company.Konto;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto = new Konto(500);

    @org.junit.jupiter.api.Test
    void indsæt() {

    }

    @org.junit.jupiter.api.Test
    void hæv() {

    }

    @org.junit.jupiter.api.Test
    void overfør() {

    }

    @org.junit.jupiter.api.Test
    void getKontonummer() {
        assertEquals(1,1);

    }

    @org.junit.jupiter.api.Test
    void setKontonummer() {

    }

    @org.junit.jupiter.api.Test
    void getEjernavn() {
        konto.setEjernavn("Hans");
        assertEquals("Hans", konto.getEjernavn());
    }

    @org.junit.jupiter.api.Test
    void setEjernavn() {
        konto.setEjernavn("Hans");
        assertEquals("Hans",konto.getEjernavn());
    }

    @org.junit.jupiter.api.Test
    void getSaldo() {
        assertEquals(500,konto.getSaldo());
    }

    @org.junit.jupiter.api.Test
    void setSaldo() {
        konto.setSaldo(50);


    }
}