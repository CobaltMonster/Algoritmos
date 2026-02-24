package com.github.cobaltmonster.decisao;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double aux;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.printf("Ordem crescente: %.2f, %.2f, %.2f\n", a, b, c);
    }
}

