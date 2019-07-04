package com.javagda25.queue.ex1_farmacy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Apteka {
    private PriorityQueue<Customer> customerQue = new PriorityQueue<>(
            new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    if (o1.isWCiazy() && !o2.isWCiazy()) {
                        return -1;
                    } else if (!o1.isWCiazy() && o2.isWCiazy()) {
                        return 1;
                    }
                    if (o1.getWiek() > 60 && o2.getWiek() < 60) {
                        return -1;
                    } else if (o1.getWiek() < 60 && o2.getWiek() > 60) {
                        return 1;
                    }
                    return 0;
                }
            }
    );

    void dodajKlientowDoKolejki(Customer... customers) {
        customerQue.addAll(Arrays.asList(customers));
    }

    void wypisz() {
        while (!customerQue.isEmpty()) {
            // opróżniamy kolejkę, w ten sposób mamy pewność że wybierany element jest stale
            // największy
            System.out.println(customerQue.poll());
        }
    }
}
