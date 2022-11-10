package br.lista3.questao2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        int maiores = 0;

        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(10));
            if (lista.get(i) > 5) {
                maiores++;
            }
        }

        for (Integer elem :
                lista) {
            System.out.println(elem);
        }

        System.out.printf("%d numeros maiores que 5", maiores);
    }
}
