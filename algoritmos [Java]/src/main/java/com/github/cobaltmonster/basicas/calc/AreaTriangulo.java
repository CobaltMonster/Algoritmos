package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        int area = base * altura / 2;

        System.out.printf("A área do triângulo é %d", area);
    }
}
