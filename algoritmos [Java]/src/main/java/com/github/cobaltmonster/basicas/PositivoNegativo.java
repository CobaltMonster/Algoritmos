package com.github.cobaltmonster.basicas;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 0) {
            System.out.printf("O número %d é negativo", num);
            return;
        }

        if (num > 0) {
            System.out.printf("O número %d é positivo", num);
            return;
        }

        System.out.printf("O número %d é neutro", num);

    }
}
