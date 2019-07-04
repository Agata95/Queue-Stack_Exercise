package com.javagda25.queue.ex2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Poczekalnia {
    private PriorityQueue<Klient> klientPriorityQueue = new PriorityQueue<>(
            new Comparator<Klient>() {
                @Override
                public int compare(Klient o1, Klient o2) {
                    if (o1.isCzyPriorytet() && !o2.isCzyPriorytet()) {
                        return -1;
                    } else if (!o1.isCzyPriorytet() && o2.isCzyPriorytet()) {
                        return 1;
                    }
                    if(o1.getCzasPrzybycia().isAfter(o2.getCzasPrzybycia())){
                        return 1;
                    } else if (o2.getCzasPrzybycia().isAfter(o1.getCzasPrzybycia())){
                        return -1;
                    }
                    return 0;
                }
            }
    );

    void dodajKlienta(String imie, boolean czyPriorytet) {
        klientPriorityQueue.add(new Klient(imie, czyPriorytet));
    }

    Klient pobierzKlienta() throws QueueEmptyExeption {
        Klient k = klientPriorityQueue.poll();
        if (k == null) {
            throw new QueueEmptyExeption(":(");
        }
        return k;
    }

    void wypiszKolejnoscKlientów() {
        PriorityQueue<Klient> tmp = new PriorityQueue<>(klientPriorityQueue);
        while (!tmp.isEmpty()) {
            System.out.println(tmp.poll());
        }
    }
}
