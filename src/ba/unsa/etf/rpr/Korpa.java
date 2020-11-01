package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50]; //maksimalno 50
    private int br=0;
    public boolean dodajArtikl(Artikl art){
        if(br < 50){
            artikli[br] = new Artikl(art.getNaziv(), art.getCijena(), art.getKod());
            br++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i = 0; i < br; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i] = null;
                pomjeriSve(i);
                return novi;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala(){
        int cijena=0;
        for(int i = 0; i < br; i++){
            cijena = cijena+artikli[i].getCijena();
        }
        return cijena;
    }

    private void pomjeriSve(int poz){
        for(int i = poz; i< br; i++){
            artikli[i] = artikli[i+1];
        }
        artikli[br] = null;
        br--;
    }
}

