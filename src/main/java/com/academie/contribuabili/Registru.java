package com.academie.contribuabili;

public enum Registru {

    REGISTRU,

    REGISTRU_PROVINCIE;

    private int counter = 0;

    private Contribuabil[] contribuabili = new Contribuabil[2];

    private Registru() {
    }

    public void adaugaContribuabil(Contribuabil contribuabil) {
        if (counter + 1 > contribuabili.length) {
            dubleazaArray();
        }
        System.out.println("S-a adaugat un contribuabil " + contribuabil.getId());
        contribuabili[counter] = contribuabil;
        counter++;
        System.out.println(counter);
    }

    private void dubleazaArray() {
        Contribuabil[] nouArray = new Contribuabil[contribuabili.length * 2];

        for (int i = 0; i < contribuabili.length; i++) {
            nouArray[i] = contribuabili[i];
        }
        contribuabili = nouArray;

    }

    public void stergeContribuabil(Contribuabil contribuabil) {
        int i = gasesteIdContribuabil(contribuabil);
        if (i == -1) {
            System.out.println("Nu exista acel Contribuabil " + contribuabil.getId());
            return;
        }
        for (int j = i; j < counter - 1; j++) {
            contribuabili[j] = contribuabili[j + 1];
        }
        System.out.println("S-a STERS un contribuabil " + contribuabil.getId());
        contribuabili[counter - 1] = null;
        counter--;

        System.out.println(counter);

    }

    //TODO
    /*
    folosind binary search eficietizati algoritmul
     */
    public int gasesteIdContribuabil(Contribuabil contribuabil) {
        for (int i = 0; i < counter; i++) {
            if (contribuabil.getId() == contribuabili[i].getId()) {
                return i;
            }
        }

        return -1;
    }


    public int getNumarContribuabili() {
        return counter;
    }


}
