package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000]; //maksimalno 1000
    private int br = 0;
    public boolean dodajArtikl(Artikl a){
        if(br < 50){
            artikli[br] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
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
    private void pomjeriSve(int poz){
        for(int i = poz; i< br; i++){
            artikli[i] = artikli[i+1];
        }
        artikli[br] = null;
        br--;
    }

}
