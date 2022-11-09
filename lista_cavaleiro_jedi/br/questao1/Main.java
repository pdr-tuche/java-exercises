package br.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite seu nome:");
        String nome = input.nextLine();

        String ultimoNome = nome.substring(nome.lastIndexOf(" "));
        String primeiroNome = nome.substring(0,nome.indexOf(" "));

        System.out.println(primeiroNome + ultimoNome);

    }
}
