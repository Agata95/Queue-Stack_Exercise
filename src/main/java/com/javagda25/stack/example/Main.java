package com.javagda25.stack.example;

// przykładowe zastosowanie stosu

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // LIFO - last in, first out
        Stack<Integer> lifo = new Stack<>();

        lifo.push(1);   // dodawanie do kolejki
        lifo.push(2);
        lifo.push(3);

        while (!lifo.empty()) {
            System.out.println(lifo.pop()); // zabieranie elementów ze stosu
        }
    }
}
