package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        Bosszuallo b = new Bosszuallo(15, false) {

            @Override
            public boolean megmentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Szuperhos szuperhos) {
                return false;
            }
        };
        Vasember v = new Vasember();
        Batman bruce = new Batman();
        System.out.println(b);
        System.out.println(v);
        System.out.println(bruce);
        System.out.println("\n\n");
        Kepregeny.szereplok("szuperhos.txt");
        Kepregeny.szuperhosok();
    }
}
