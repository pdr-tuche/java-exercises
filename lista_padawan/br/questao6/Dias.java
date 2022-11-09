package br.questao6;

import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
//6 - Faça um programa que receba um número e exiba o dia correspondente (1 – domingo, 2 – segunda, 3 – terça,
//4 – quarta, 5 – quinta, 6 – sexta e 7 – sábado).
public class Dias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
}
