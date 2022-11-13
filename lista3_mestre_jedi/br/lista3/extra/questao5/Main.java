package br.lista3.extra.questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> repetidos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int aux = input.nextInt();
            lista.add(aux);
        }


        //verificando iguais

        boolean repetiu = false;
        System.out.println("numeros repetidos :");
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).equals(lista.get(i))) {
                    repetiu = true;

                    repetidos.add(lista.get(j));

                }
            }
        }
        if (!repetiu) {
            System.out.println("nenhum numero repetiu");
        } else {
            for (Integer elem :
                    repetidos) {
                System.out.println(elem);
            }
        }
    }
}
