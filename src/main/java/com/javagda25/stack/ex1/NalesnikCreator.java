package com.javagda25.stack.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NalesnikCreator implements Runnable {
    // jeśli coś jest final i static to powinno być pisane wielkimi literami

    private static final String[] SKLADNIKI = new String[]{
            "nutella",
            "dżem",
            "banan",
            "truskawki",
            "jagody",
            "śmietana",
            "cukier",
            "twaróg",
            "cukier puder",
            "kurczak",
            "stek",
            "ser",
            "bolognese",
            "sos pomidorowy",
            "śledź"
    };
    private Nalesnikarnia nalesnikarnia;

    public NalesnikCreator(Nalesnikarnia nalesnikarnia) {
        this.nalesnikarnia = nalesnikarnia;
    }

    @Override
    public void run() {
        while (nalesnikarnia.pobierzIloscGotowychNalesnikow() < 50) {
            // losuj ilość składników
            System.out.println("Naleśników jest mniej niż 50, zabieram się do pracy.");
            int iloscSkladnikow = new Random().nextInt(10);

            // losujemy składniki
            List<String> skladniki = new ArrayList<>();
            for (int i = 0; i < iloscSkladnikow; i++) {
                // wylosuj składnik i dodaj go do listy
                skladniki.add(SKLADNIKI[new Random().nextInt(SKLADNIKI.length)]);
            }

            // tworzymy naleśnika
            nalesnikarnia.stworzNalesnika(skladniki);

            // przesypiamy zadaną ilość czasu.
            try {
                Thread.sleep(new Random().nextInt(5000) + 1);
            } catch (InterruptedException e) {
                // pracownik żali się że ktoś go zaczepia
                System.err.println("Ktoś przerwał moje działanie.");
            }
        }
    }
}
