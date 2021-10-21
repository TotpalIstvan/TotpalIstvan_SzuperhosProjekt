package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos,Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (lelemenyesseg > szuperhos.mekkoraAzEreje()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return "Batman" + String.format("leleményesség: %f", lelemenyesseg);
    }
}
