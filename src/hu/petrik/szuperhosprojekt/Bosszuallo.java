package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

     public Bosszuallo(double szuperero, boolean vanEGyengesege) {
         this.szuperero = szuperero;
         this.vanEGyengesege = vanEGyengesege;
     }

     public abstract boolean megmentiAVilagot();

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }


    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public boolean legyoziE(boolean Szuperhos) {
        return vanEGyengesege;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
