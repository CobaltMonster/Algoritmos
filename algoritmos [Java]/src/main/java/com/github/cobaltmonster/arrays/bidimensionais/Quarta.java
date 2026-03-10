package com.github.cobaltmonster.arrays.bidimensionais;

import java.util.Scanner;

public class Quarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            soma += matriz[i][i];
        }

        System.out.println(soma);
    }
}
