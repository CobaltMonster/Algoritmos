package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseMenor = scanner.nextInt();
        int baseMaior = scanner.nextInt();
        int altura = scanner.nextInt();
        int area = (baseMaior + baseMenor) * altura / 2;

        System.out.printf("A área do trapezio é %d cm", area);
    }
}
