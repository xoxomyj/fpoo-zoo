package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animais {

    String tipo, nome, idade, sexo, raca;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimais() {
        System.out.println("///---------- CADASTRO ---------///");
        System.out.println("Informe o Tipo do seu animal: ");
        tipo = scanner.nextLine();
        System.out.println("Informe o Nome do seu animal: ");
        nome = scanner.nextLine();
        System.out.println("Informe a Idade do seu animal: ");
        idade = scanner.nextLine();
        System.out.println("Informe o Sexo do seu animal: ");
        sexo = scanner.nextLine();
        System.out.println("Informe a Raça do seu animal: ");
        raca = scanner.nextLine();
    }
}

