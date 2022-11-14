package br.lista3.extra.questao10;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    //10 –Faça  um  programa  para  sortear  5  números  diferentes  entre  1  e  10.
    // Armazene  os  valores  sorteados  num vetor de 5 posições e, em seguida, exiba-os.
    // Atenção: os valores armazenados não podem se repetir.

    public static void main(String[] args) {
        Random gerador = new Random();
        ArrayList<Integer> vet = new ArrayList<>();
        int aux;
        int count = 0;

       do {
           aux = gerador.nextInt(10);
           if (!vet.contains(aux)) {
               vet.add(aux);
               count++;
           }
       }while (count < 5);


        for (Integer elem :
                vet) {
            System.out.println(elem);
        }

    }
}
