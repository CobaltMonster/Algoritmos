package com.github.cobaltmonster.arrays.bidimensionais;

public class Quinta {
    public static void main(String[] args) {
        int[][] matriz = new int[7][8];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
