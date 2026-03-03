package com.github.cobaltmonster.arrays;

public class ExerciciosArrays {
    public static void main(String[] args) {

        // a) Números de 1 até 100
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
        System.out.println("a) Números de 1 até 100:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // b) Números de 100 até 1
        int[] b = new int[100];
        for (int i = 0; i < 100; i++) {
            b[i] = 100 - i;
        }
        System.out.println("b) Números de 100 até 1:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        // c) Números pares de 1 até 100
        int[] c = new int[50];
        for (int i = 0; i < 50; i++) {
            c[i] = (i + 1) * 2;
        }
        System.out.println("c) Números pares de 1 até 100:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // d) Números ímpares de 1 até 100
        int[] d = new int[50];
        for (int i = 0; i < 50; i++) {
            d[i] = i * 2 + 1;
        }
        System.out.println("d) Números ímpares de 1 até 100:");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}

