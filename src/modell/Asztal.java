
package modell;

public class Asztal {
    private Sor [] sorok = new Sor [4];
    private int db;
    
    public void sorHozzaad(Sor ujSor){
        if (db < sorok.length){
            sorok[db] = ujSor;
            db++;
        }else{
            System.out.println("Tele az asztal!");
        }
    }
    
    public void megjelenites(){
        System.out.println("|" + (db >= 1 ? "o": " ")+ " " + (db >= 2 ? "o" : " ") + "|");
        System.out.println("|" + (db >= 3 ? "o": " ")+ " " + (db >= 4 ? "o" : " ") + "|");
        
        for (int i = 0; i < db; i++) {
            System.out.println(sorok[i]);
        }
    }

    public int getDb() {
        return db;
    }

    public Sor[] getSorok() {
        return sorok;
    }
    
}
