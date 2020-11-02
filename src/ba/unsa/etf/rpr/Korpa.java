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
        boolean ima=false;
        Artikl art = null;
        System.out.println("brojac je: " + br);
        int indeks = 0;
        for(Artikl c : artikli){
            String str = c.getKod();
            if(str.equals(kod)){
                ima = true;
                break;
            }
            indeks++;
        }
        if(ima){
            art=artikli[indeks];
            pomjeriSve(indeks);
        }
        return art;
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

