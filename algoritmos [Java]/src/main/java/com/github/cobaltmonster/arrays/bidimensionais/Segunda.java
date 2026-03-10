package com.github.cobaltmonster.arrays.bidimensionais;

import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println(matriz[0][0]);
        System.out.println(matriz[2][3]);
    }
}
