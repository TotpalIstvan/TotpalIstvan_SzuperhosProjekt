package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperEro;
    private boolean vanEGyengesege;

     public Bosszuallo(double szuperero, boolean vanEGyengesege) {
         this.szuperEro = szuperero;
         this.vanEGyengesege = vanEGyengesege;
     }



    public abstract boolean megmentiAVilagot();

    public double getSzuperero() {
        return szuperEro;
    }

    public boolean getVanEGyengese() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperEro) {
        this.szuperEro = szuperEro;
    }


    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
       if (szuperhos.mekkoraAzEreje() > this.szuperEro && this.vanEGyengesege) {
           return true;
       }
       else {
           return false;
       }
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperEro;
    }

    @Override
    public String toString() {
        return String.format("Erő = %f; Van-e gyengesége = %b", szuperEro, vanEGyengesege);
    }
}
