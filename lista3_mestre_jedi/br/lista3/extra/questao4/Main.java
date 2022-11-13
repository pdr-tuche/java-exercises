package br.lista3.extra.questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>listaPares = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int tamanhoLista =0;

        do{
            int aux = input.nextInt();
            if(aux % 2 == 0){
                listaPares.add(aux);
                tamanhoLista++;
            }
        }while (tamanhoLista < 6);

        for (int i = 6; i >=0; i--) {
            System.out.println(listaPares.get(i));
        }
    }
}
