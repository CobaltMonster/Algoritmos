package com.github.cobaltmonster.repeticao;

import java.util.Scanner;

public class MaioresDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas?");
        int n = scanner.nextInt();

        int maiores = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i);
            int idade = scanner.nextInt();
            if (idade >= 18) {
                maiores++;
            }
        }

        System.out.println("Quantidade de maiores de idade: " + maiores);
    }
}

