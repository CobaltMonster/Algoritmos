package com.github.cobaltmonster.arrays;

import java.util.Scanner;

public class ContaXnoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite o número X para contar:");
        int x = scanner.nextInt();

        int conta = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                conta++;
            }
        }

        System.out.println("O número " + x + " aparece " + conta + " vezes no vetor.");
    }
}

