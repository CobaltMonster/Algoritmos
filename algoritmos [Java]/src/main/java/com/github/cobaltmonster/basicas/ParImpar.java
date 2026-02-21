package com.github.cobaltmonster.basicas;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
            return;
        }

        System.out.printf("O número %d é ímpar", num);

    }
}
