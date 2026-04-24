
package main;

import modell.Asztal;
import modell.Sor;

public class Program {
    public static void main(String[] args) {
        Asztal asztal = new Asztal();
        
        Sor s1 = new Sor();
        asztal.sorHozzaad(s1);
        asztal.megjelenites();
        Sor s2 = new Sor(5, 330, false);
        Sor s3 = new Sor(4, 330, true);
        asztal.sorHozzaad(s2);
        asztal.sorHozzaad(s3);
        asztal.megjelenites();
        Sor s4 = new Sor(6, 500, false);
        asztal.sorHozzaad(s4);
        asztal.megjelenites();
        

    }
}
