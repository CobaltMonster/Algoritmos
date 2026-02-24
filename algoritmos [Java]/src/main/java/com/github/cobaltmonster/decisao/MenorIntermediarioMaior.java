package com.github.cobaltmonster.decisao;

import java.util.Scanner;

public class MenorIntermediarioMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double menor, intermediario, maior;

        if (x <= y && x <= z) {
            menor = x;
            if (y <= z) {
                intermediario = y;
                maior = z;
            } else {
                intermediario = z;
                maior = y;
            }
        } else if (y <= x && y <= z) {
            menor = y;
            if (x <= z) {
                intermediario = x;
                maior = z;
            } else {
                intermediario = z;
                maior = x;
            }
        } else {
            menor = z;
            if (x <= y) {
                intermediario = x;
                maior = y;
            } else {
                intermediario = y;
                maior = x;
            }
        }

        System.out.printf("Menor: %.2f\n", menor);
        System.out.printf("Intermediário: %.2f\n", intermediario);
        System.out.printf("Maior: %.2f\n", maior);
    }
}

