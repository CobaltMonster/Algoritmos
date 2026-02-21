package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raio = scanner.nextInt();
        double area = Math.PI * (raio * raio);

        System.out.printf("A área do circulo é %f cm", area);
    }
}
