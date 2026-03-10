package com.github.cobaltmonster.arrays.bidimensionais;

public class PrimeiraA {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int valor = 11;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
