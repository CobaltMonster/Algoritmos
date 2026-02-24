package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double results = peso / (altura * altura);

        System.out.printf("O seu IMC é %f", results);
    }
}
