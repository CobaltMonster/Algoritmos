package com.github.cobaltmonster.repeticao;

public class ExerciciosFor {
    public static void main(String[] args) {

        System.out.println("a) Números de 1 até 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("b) Números de 100 até 1:");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("c) Números pares entre 1 e 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("d) Quantidade de pares entre 1 e 50:");
        int contaPares = 0;
        for (int i = 2; i <= 50; i += 2) {
            contaPares++;
        }
        System.out.println(contaPares);

        System.out.println("e) Números ímpares entre 50 e 150:");
        for (int i = 51; i <= 150; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("f) Quantidade de ímpares entre 50 e 150:");
        int contaImpares = 0;
        for (int i = 51; i <= 150; i += 2) {
            contaImpares++;
        }
        System.out.println(contaImpares);

        System.out.println("g) Soma dos números de 1 até 5:");
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            soma += i;
        }
        System.out.println(soma);

        System.out.println("h) Média dos números de 1 até 5:");
        double media = soma / 5.0;
        System.out.printf("%.2f\n", media);

        System.out.println("i) Produto dos números de 1 até 5:");
        int produto = 1;
        for (int i = 1; i <= 5; i++) {
            produto *= i;
        }
        System.out.println(produto);

        System.out.println("j) Soma dos pares de 1 até 10:");
        int somaPares = 0;
        for (int i = 2; i <= 10; i += 2) {
            somaPares += i;
        }
        System.out.println(somaPares);

        System.out.println("k) Soma dos ímpares de 1 até 10:");
        int somaImpares = 0;
        for (int i = 1; i <= 10; i += 2) {
            somaImpares += i;
        }
        System.out.println(somaImpares);
    }
}

