package modell;

public class Sor {

    private int alkoholFok;
    private int mennyiseg;
    private boolean vilagos;

    public Sor() {
        this(4,500, true);
    }

    public Sor(int alkoholFok, int mennyiseg, boolean vilagos) {
        this.alkoholFok = alkoholFok;
        this.mennyiseg = mennyiseg;
        this.vilagos = vilagos;
    }

    public int getAlkoholFok() {
        return alkoholFok;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public boolean isVilagos() {
        return vilagos;
    }


    @Override
    public String toString() {
        String tipus = vilagos ? "világos" : "barna";
        return String.format("alkohol: %d%%, mennyiség: %d ml, típus: %s", 
                             alkoholFok, mennyiseg, tipus);
    }
    
    
    
}
