package modell;

public class Sor {

    private int alkoholFok;
    private int mennyiseg;
    private boolean vilagos;
    private boolean barna;

    public Sor() {
        this(4,50, true, false);
    }

    public Sor(int alkoholFok, int mennyiseg, boolean vilagos, boolean barna) {
        this.alkoholFok = alkoholFok;
        this.mennyiseg = mennyiseg;
        this.vilagos = vilagos;
        this.barna = barna;
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

    public boolean isBarna() {
        return barna;
    }

    @Override
    public String toString() {
        return "Sor{" + "alkoholFok=" + alkoholFok + ", mennyiseg=" + mennyiseg + ", vilagos=" + vilagos + ", barna=" + barna + '}';
    }
    
    
    
}
