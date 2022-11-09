package br.questao8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Media aritimetica" +
                " 2. Media ponderada" +
                " 3. sair");

        int option = input.nextInt();

        double res=0;
        double n1, n2, n3;
        double peso1, peso2, peso3;
        switch (option) {

            case 1:
                System.out.println("digite duas notas: ");

                n1 = input.nextDouble();
                n2 = input.nextDouble();
                res = (n1 + n2) / 2;
                System.out.println("a media aritimetica e de: " + res);
                break;
            case 2:
                System.out.println("digite tres notas: ");

                n1 = input.nextDouble();
                n2 = input.nextDouble();
                n3 = input.nextDouble();
                System.out.println("digite o peso das tres notas: ");

                peso1 = input.nextDouble();
                peso2 = input.nextDouble();
                peso3 = input.nextDouble();

                res = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);
                System.out.println("a media ponderada e de: " + res);
                break;
            case 3:
                break;
            default:
                System.out.println("opcao invalida");
                break;

        }
    }
}
