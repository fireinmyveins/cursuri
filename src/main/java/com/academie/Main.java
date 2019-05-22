package com.academie;

import com.academie.contribuabili.*;

/**
 * Se cere sa se dezvolte un program care sa tina evidenta veniturilor cetatenilor
 * si a taxelor pe care le au de platit
 *
 * Orice cetatean care plateste taxe(contribuabil) trebuie sa fie aibe urmatorul comportament:
 *  - isi declare veniturile noi (se adauga la veniturile totale)
 *  - isi plateasca taxele (se scade din taxele totale pe care le are de platit)
 *              *** nu are voie sa plateasca mai mult decat taxele datorate
 *  - sa raspunda la intrebarea ce venituri a avut pana in prezent
 *  (suma a tot ce a declarat pana in prezent)
 *  - sa raspunda la intrebarea ce taxe are de platit (double suma taxelor)
 *  - sa raspunda la intrbarea ce taxe a platit pana acum
 *  - sa raspunda la intrebarea ce id are
 *              *** stim ca idul se vrea sa fie unic si sa fie in ordineea creeari lor.
 *              *** De asemenea idul nu va putea fi schimbat dupa ce a fost asignat unui contribuabil
 *
 * Toti contribuabilii trebuie sa fie adaugati la un registru care expune urmatoarele functionalitati:
 *  - adauga un contribuabil nou
 *  - sterge un contribuabil
 *
 *  - raporteaza evidenta tuturor contribuabililor (
 *          ce id are,
         *  ce venituri au,
         *  ce taxe au platit,
         *  ce taxe mai au de platit)
 *
 * Reigistrul este unic pentru toti contribuabilii
 *
 * *** Solutia initiala nu va fi optima, dar pe masura ce cursul va inainte elevii isi asuma responsabilitatea sa
 * *** Se va folosi doar ce am invatat pana acum
 */
public class Main {

    public static void main(String[] args) {
        Contribuabil c1 = new ContribuabilTest();
        Contribuabil c2 = new ContribuabilTest();
        Contribuabil c3 = new ContribuabilTest();


        Registru.REGISTRU.adaugaContribuabil(c1);
        Registru.REGISTRU.adaugaContribuabil(c2);
        Registru.REGISTRU.adaugaContribuabil(c3);

        Contribuabil c4 = new ContribuabilTest();
        Registru.REGISTRU.stergeContribuabil(c4);
        Registru.REGISTRU.stergeContribuabil(c1);

        PlatitorTaxe c5 = new PlatitorTaxe(RatieTaxa.CONSTRUCTII);
        System.out.println(c5);
        c5.declaraVenit(100);


        System.out.println(c5.toString());

        c5.platesteTaxa(50);

        System.out.println(c5);

        c5.platesteTaxa(6);

        System.out.println(c5);


        c5.platesteTaxa(-4554);
        System.out.println(c5);
    }
}
