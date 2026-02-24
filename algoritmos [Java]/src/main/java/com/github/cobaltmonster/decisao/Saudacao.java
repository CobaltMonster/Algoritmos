package com.github.cobaltmonster.decisao;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o turno (m, t, n):");
        String turno = scanner.next();

        if (turno.equals("m")) {
            System.out.println("Bom Dia!");
        } else if (turno.equals("t")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equals("n")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Turno inválido.");
        }
    }
}

