package br.lista3.extra.questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int aux = input.nextInt();
            lista.add(aux);
        }

        int maior = 0;
        for (Integer elem :
                lista) {
            if (elem > maior) {
                maior = elem;
            }
        }

        int menor = maior;

        for (Integer elem :
                lista) {
            if (elem < menor) {
                menor = elem;
            }
        }
        System.out.printf("maior elemento => %d\n", maior);
        System.out.printf("menor elemento => %d\n", menor);

    }
}
