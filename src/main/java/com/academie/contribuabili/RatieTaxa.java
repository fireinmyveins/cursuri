package com.academie.contribuabili;

public enum RatieTaxa {

    GENERAL(0.16),
    IT(0.10),
    CONSTRUCTII(0.06),
    CONSTRUCTII_2020(0.2)
    ;

    private double ratieTaxa;

    private RatieTaxa(double ratieTaxa) {
        this.ratieTaxa = ratieTaxa;
    }

    public double getRatieTaxa() {
        return ratieTaxa;
    }


}
