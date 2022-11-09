package br.questao8;

import java.util.Random;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
//8 – Faça um programa que sorteie 6 números entre 1 e 60.
public class QueSorteio {
    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.println(gerador.nextInt(61)); // o intervalo do numero é fechado, logo nao inclui o 60, por isso coloquei 61
        }
    }
}
