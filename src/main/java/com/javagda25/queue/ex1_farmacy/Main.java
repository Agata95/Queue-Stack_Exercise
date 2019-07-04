package com.javagda25.queue.ex1_farmacy;

public class Main {
    public static void main(String[] args) {
        Apteka apteka = new Apteka();
        Customer klient2 = new Customer(25, true, "Ania");
        Customer klient3 = new Customer(50, false, "Marian");
        Customer klient4 = new Customer(18, true, "Karyna");
        Customer klient5 = new Customer(88, false, "Halina");
        Customer klient6 = new Customer(35, false, "Piotr");
        Customer klient1 = new Customer(70, true, "Helga");
        Customer klient7 = new Customer(27, false, "Patryk");

        apteka.dodajKlientowDoKolejki(klient1, klient2, klient3, klient4, klient5, klient6, klient7);

        System.out.println("Po posortowaniu: ");
        apteka.wypisz();
    }
}
