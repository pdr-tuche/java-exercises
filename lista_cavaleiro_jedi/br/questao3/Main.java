package br.questao3;

import java.util.ArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(gerador.nextInt(24));
        }

        int entre0e12 = 0;

        System.out.println("numeros da lista");
        for (Integer elem :
                lista) {
            System.out.println(elem);
        }

        for (Integer elem :
                lista) {
            if (elem >= 0 && elem <= 12) {
                entre0e12++;
            }
        }

        System.out.print("quantidade = " + entre0e12);
    }
}
