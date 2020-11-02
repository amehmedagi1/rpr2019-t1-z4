package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl a = new Artikl("Biciklo", 100, "1");
        assertTrue(supermarket.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("banane", 2, "63"));
        supermarket.dodajArtikl(new Artikl("jabuke", 1, "12"));
        supermarket.dodajArtikl(new Artikl("jagode", 4, "22"));
        supermarket.izbaciArtiklSaKodom(("63"));
        assertNotEquals(3, supermarket.getBr());

    }
}