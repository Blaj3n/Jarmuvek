package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu{}

public class JarmuTeszt {

    public static void main(String[] args) {
        new JarmuTeszt();
    }

    public JarmuTeszt() {
        //mintaSablonTeszt();
        haladAutoBeinditasNelkulTeszt();
        haladAutoBeinditassalTeszt();
        haladJarmuBeinditassalTeszt();

        haladJarmuurestankkal();
        haladJarmuteletankkal();
    }

    private void haladAutoBeinditasNelkulTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "Autó beindítás nélkül is haladt!";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "Autó nem halad!";
    }

    private void haladJarmuBeinditassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.halad();
        boolean vart = true;
        assert kapott == vart : "nem halad!";
    }

    private void haladJarmuurestankkal() {
        Jarmu jarmu = new Jarmu();
        jarmu.tankol();
        boolean kapott = jarmu.tankol();
        boolean vart = false;
        assert kapott == vart : "Jármű üres tankkal is haladt!";
    }

    private void haladJarmuteletankkal() {
        Jarmu jarmu = new Jarmu();
        jarmu.tankol();
        boolean kapott = jarmu.tankol();
        boolean vart = true;
        assert kapott == vart : "Jármű tele tankkal halad!";
    }

    private void mintaSablonTeszt() {
        int kapott = 7; //kapott eredmény
        int vart = 4; // várt eredmény
        assert kapott == vart : "nem egyenlőek";
    }

}
