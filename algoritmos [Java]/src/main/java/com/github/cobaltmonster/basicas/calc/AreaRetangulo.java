package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("A área do retangulo é %d", num1 * num2);
    }
}
