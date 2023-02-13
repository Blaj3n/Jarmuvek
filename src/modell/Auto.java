package modell;

public class Auto {

    private boolean defekt;
    
    public void kereketCserel(){
        
    }
    public boolean halad(){
        return false;
        
    }

    public Auto(boolean defekt) {
        this.defekt = defekt;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public void setDefekt(boolean defekt) {
        this.defekt = defekt;
    }
    
}
