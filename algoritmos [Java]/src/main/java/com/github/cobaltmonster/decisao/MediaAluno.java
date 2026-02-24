package com.github.cobaltmonster.decisao;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("Aprovado. Média: %.2f\n", media);
        } else {
            System.out.printf("Média: %.2f\n", media);
            System.out.println("Digite a nota do exame:");

            double exame = scanner.nextDouble();
            double novaMedia = (media + exame) / 2;

            if (novaMedia >= 5) {
                System.out.printf("Aprovado em exame. Média final: %.2f\n", novaMedia);
            } else {
                System.out.printf("Reprovado. Média final: %.2f\n", novaMedia);
            }
        }
    }
}