package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class SalarioPorcentagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double porcentagem = scanner.nextDouble();

        double adicional = salario * (porcentagem / 100);
        double total = salario + adicional;

        System.out.printf("O novo salário é %.2f", total);
    }
}
