package br.lista3.extra.questao3;

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

        for (Integer elem :
                lista) {
            System.out.println(elem);
        }

        int maior=0;
        int indexMaior=0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior){
                maior = lista.get(i);
                indexMaior = i;
            }
        }

        System.out.printf("maior elemento => %s\n", maior);
        System.out.printf("indice => %s\n",indexMaior);


    }
}
