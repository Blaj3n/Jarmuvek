package modell;

public abstract class Jarmu {

    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public void beindit() {
        if (beinditva == true) {

        }
    }

    public void leallit() {

    }

    public boolean tankol() {
        if (beinditva == false) {
        }
        return true;
    }

    public boolean halad() {
        if (uzemanyag == false) {
            Jarmu(beinditva == true);
        }
        return false;
        else()
    
    }
}
