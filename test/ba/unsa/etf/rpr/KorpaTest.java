package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("Biciklo", 100, "1");
        assertTrue(korpa.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("Cincilator", 1250, "42");
        korpa.dodajArtikl(a);
        korpa.dodajArtikl(new Artikl("Vezice", 4, "23"));
        korpa.dodajArtikl(new Artikl("Japanke", 54, "11"));
        korpa.izbaciArtiklSaKodom("42");
        assertNotEquals(3, korpa.getBr());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Lopta", 25, "1"));
        korpa.dodajArtikl(new Artikl("Asov", 54, "12"));
        assertEquals(79, korpa.dajUkupnuCijenuArtikala());
    }
}