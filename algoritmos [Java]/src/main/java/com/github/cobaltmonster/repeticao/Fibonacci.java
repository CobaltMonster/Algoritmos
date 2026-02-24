package com.github.cobaltmonster.repeticao;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        System.out.print(a + ", " + b);

        for (int i = 3; i <= 15; i++) {
            int proximo = a + b;
            System.out.print(", " + proximo);
            a = b;
            b = proximo;
        }

        System.out.println();
    }
}

