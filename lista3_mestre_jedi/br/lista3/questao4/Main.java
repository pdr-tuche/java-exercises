package br.lista3.questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aux = input.nextInt();
            lista.add(aux);
        }

        for (Integer elem :
                lista) {
            if (elem < 0){
                elem = 0;
            }
            System.out.println(elem);
        }
    }
}
