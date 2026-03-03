package com.github.cobaltmonster.arrays;

import java.util.Scanner;

public class NumeroXnoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite o número X para buscar:");
        int x = scanner.nextInt();

        boolean encontrou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("O número " + x + " faz parte do vetor.");
        } else {
            System.out.println("O número " + x + " não faz parte do vetor.");
        }
    }
}

