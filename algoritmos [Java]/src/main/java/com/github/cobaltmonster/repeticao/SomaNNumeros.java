package com.github.cobaltmonster.repeticao;

import java.util.Scanner;

public class SomaNNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja somar?");
        int n = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o %dº número: ", i);
            double num = scanner.nextDouble();
            soma += num;
        }

        System.out.printf("A soma é: %.2f\n", soma);
    }
}

