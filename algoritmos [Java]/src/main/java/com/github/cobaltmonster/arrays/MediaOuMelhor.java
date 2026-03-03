package com.github.cobaltmonster.arrays;

import java.util.Scanner;

public class MediaOuMelhor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }

        double media = soma / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] >= media) {
                count++;
            }
        }

        System.out.println(media);
        System.out.println(count);
    }
}

