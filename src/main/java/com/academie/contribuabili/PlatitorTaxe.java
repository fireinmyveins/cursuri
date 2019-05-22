package com.academie.contribuabili;

public class PlatitorTaxe implements Contribuabil {

    private RatieTaxa ratieTaxa;
    private static int counter = 1;

    private int id;

    private double venituri;

    private double taxePlatite;

    private double taxeDePlatit;



    public PlatitorTaxe(RatieTaxa ratieTaxa) {
        id = counter;
        counter++;
        this.ratieTaxa = ratieTaxa;
    }


    public void declaraVenit(double venit) {
        this.venituri += venit;
        this.taxeDePlatit += venit * ratieTaxa.getRatieTaxa();
    }


    public void platesteTaxa(double valoare) {
        if (valoare <= 0) {
            System.out.println("Valoarea trebuie sa fie mai mare ca zero: "
                    + valoare);
            return;
        }
        if (taxeDePlatit < valoare) {
            System.out.println("Ati dorit sa platiti mai mult: " +
                    valoare + " > " + taxeDePlatit);
            return;
        }
        this.taxePlatite += valoare;
        this.taxeDePlatit -= valoare;
    }

    public int getId() {
        return id;
    }

    public double getVenituri() {
        return venituri;
    }

    public double getTaxePlatite() {
        return taxePlatite;
    }

    public double getTaxeNeplatite() {
        return taxeDePlatit;
    }

    public String toString() {
        return "PlatitorTaxe{" +
                "id=" + id +
                ", venituri=" + venituri +
                ", taxePlatite=" + taxePlatite +
                ", taxeDePlatit=" + taxeDePlatit +
                '}';
    }
}
