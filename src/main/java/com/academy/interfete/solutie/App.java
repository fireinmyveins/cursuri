package com.academy.interfete.solutie;

public class App {

    public static void main(String[] args) {
//        RemoteControlled rc = new MasinaDeTest();
//        MasinaDeTest masinaDeTest = new MasinaDeTest();
        RemoteControlled masinaAdev = new Masina();
        Telecomanda telecomanda = new Telecomanda(masinaAdev);
        telecomanda.apasButonInainte();
        System.out.println(RemoteControlled.getANumber(4));
    }

}
