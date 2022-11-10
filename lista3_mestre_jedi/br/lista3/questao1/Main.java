package br.lista3.questao1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(rand.nextInt(100));
            System.out.println(lista.get(i) + " na posição: "+ i);
        }

    }
}
