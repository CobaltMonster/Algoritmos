package com.github.cobaltmonster.arrays.bidimensionais;

import java.util.Scanner;

public class Terceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizOriginal = new int[5][5];
        int[][] matrizCubo = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizOriginal[i][j] = scanner.nextInt();
                matrizCubo[i][j] = matrizOriginal[i][j] * matrizOriginal[i][j] * matrizOriginal[i][j];
            }
        }

        System.out.println(matrizCubo[2][2]);
    }
}
