package com.github.cobaltmonster.basicas.calc;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


        System.out.printf("A área do quadrado é %d", num * num);
    }
}
