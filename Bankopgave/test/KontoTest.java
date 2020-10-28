import com.company.Konto;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto = new Konto(500);
    Konto overførkonto = new Konto(500);

    @org.junit.jupiter.api.Test
    void indsæt() {
        assertEquals(600, konto.indsæt(100));
    }

    @org.junit.jupiter.api.Test
    void hæv() {
        assertEquals(400, konto.hæv(100));

    }

    @org.junit.jupiter.api.Test
    void overfør() {
        assertEquals(590, konto.overfør(5, overførkonto(hæv(5.0))));

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