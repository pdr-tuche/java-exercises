package br.questao9;

import java.util.ArrayList;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
//9– Faça um programa que escreve os números pares entre 1 e 20.
public class Pares {
    public static void main(String[] args) {
        ArrayList<Integer>lista = new ArrayList<>(20);
        for (int i = 1; i <= 21; i++) {
            lista.add(i);
        }

        for (Integer num : lista){
            if(num % 2 == 0){
                System.out.print(num+ " ");
            }
        }
    }
}
