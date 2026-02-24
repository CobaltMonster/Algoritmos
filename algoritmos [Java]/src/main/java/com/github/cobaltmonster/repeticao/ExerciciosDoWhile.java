package com.github.cobaltmonster.repeticao;

public class ExerciciosDoWhile {
    public static void main(String[] args) {

        System.out.println("a) Números de 1 até 100:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);
        System.out.println();

        System.out.println("b) Números de 100 até 1:");
        i = 100;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println();

        System.out.println("c) Números pares entre 1 e 50:");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 50);
        System.out.println();

        System.out.println("d) Quantidade de pares entre 1 e 50:");
        int contaPares = 0;
        i = 2;
        do {
            contaPares++;
            i += 2;
        } while (i <= 50);
        System.out.println(contaPares);

        System.out.println("e) Números ímpares entre 50 e 150:");
        i = 51;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 150);
        System.out.println();

        System.out.println("f) Quantidade de ímpares entre 50 e 150:");
        int contaImpares = 0;
        i = 51;
        do {
            contaImpares++;
            i += 2;
        } while (i <= 150);
        System.out.println(contaImpares);

        System.out.println("g) Soma dos números de 1 até 5:");
        int soma = 0;
        i = 1;
        do {
            soma += i;
            i++;
        } while (i <= 5);
        System.out.println(soma);

        System.out.println("h) Média dos números de 1 até 5:");
        double media = soma / 5.0;
        System.out.printf("%.2f\n", media);

        System.out.println("i) Produto dos números de 1 até 5:");
        int produto = 1;
        i = 1;
        do {
            produto *= i;
            i++;
        } while (i <= 5);
        System.out.println(produto);

        System.out.println("j) Soma dos pares de 1 até 10:");
        int somaPares = 0;
        i = 2;
        do {
            somaPares += i;
            i += 2;
        } while (i <= 10);
        System.out.println(somaPares);

        System.out.println("k) Soma dos ímpares de 1 até 10:");
        int somaImpares = 0;
        i = 1;
        do {
            somaImpares += i;
            i += 2;
        } while (i <= 10);
        System.out.println(somaImpares);
    }
}

