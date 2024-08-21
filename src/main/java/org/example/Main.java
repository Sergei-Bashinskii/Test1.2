package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arres = {1, 2, 3, 4, 5};

        int levo = 0;
        int pravo = arres.length - 1;

        while (levo < pravo) {

            int zero = arres[levo];
            arres[levo] = arres[pravo];
            arres[pravo] = zero;

            levo++;
            pravo--;
        }

        for (int i : arres) {
            System.out.println(i);
        }
    }
}