package test;

import modell.Asztal;
import modell.Sor;

public class SorazAsztalonTest {

    public static void main(String[] args) {
        tesztesetek();

    }

    private static void tesztesetek() {
        tesztUresAsztal();
        tesztMaxNegySor();
        tesztSorAdatok();
        System.out.println("Tesztek lefutottak");

    }

    private static void tesztUresAsztal() {
        System.out.println("Teszt: Üres asztal");
        Asztal asztal = new Asztal();
        
        assert asztal.getDb() == 0 : "HIBA: nem 0 sörrel indult";
        System.out.println("SIKERES");

    }

    private static void tesztMaxNegySor() {   
    System.out.println("Teszt: Max 4 sör");
    Asztal asztal = new Asztal();
    for (int i = 0; i < 5; i++) {
        asztal.sorHozzaad(new Sor());
    }
    
    assert asztal.getDb() == 4 : "HIBA: Több sör van az asztalon mint 4!";
    System.out.println("SIKERES");
    }

    private static void tesztSorAdatok() {
    System.out.println("Teszt: Sör adatok ellenőrzése");
    Asztal asztal = new Asztal();
    Sor tesztSor = new Sor(8, 500, false);
    asztal.sorHozzaad(tesztSor);
    
    assert asztal.getSorok()[0].getAlkoholFok() == 8 : "HIBA: Az alkoholfok nem egyezik!";
    System.out.println("SIKERES");
}

}
