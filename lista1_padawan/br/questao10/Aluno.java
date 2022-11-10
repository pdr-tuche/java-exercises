package br.questao10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
//10 – Faça um programa que calcula a média de 3 notas de 10 alunos.
public class Aluno {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>(10);
        ArrayList<Double> media = new ArrayList<>(10);

        Scanner input = new Scanner(System.in);
        //"basicamente" se resolvi essa questao com espelhamento de arrayslist igual a questao 3
        for (int i = 0; i < 10; i++) {
            double acumulador = 0;
            String nomeTemp;

            System.out.println("digita o nome do aluno pf");
            nomeTemp = input.next();
            alunos.add(nomeTemp);

            System.out.println("as notas");
            for (int j = 0; j < 3; j++) {
                double aux = input.nextDouble();
                acumulador += aux;
            }
            media.add(acumulador / 3);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("a media do aluno "+alunos.get(i)+" foi "+ media.get(i));
        }


    }
}
