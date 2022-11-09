package br.questao7;

import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
// 7 - Faça um programa que leia três valores inteiros A, B e C e diga se a soma de A + B é menor que C
public class PeleMelhorQueMaradona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if((A+B) > C){
            System.out.println("A soma de A + B é maior que C");
        } else if ((A+B) < C) {
            System.out.println("C é maior que a soma de A + B");
        }else{
            System.out.println("A soma de A + B é Exatamente igual a C");
        }
    }
}
