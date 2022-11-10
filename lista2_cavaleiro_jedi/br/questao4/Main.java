package br.questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Boolean flag = true;
        do {
            int aux = input.nextInt();
            if (aux != 0) {
                lista.add(aux);
            } else {
                flag = false;
            }
        } while (flag);

        int count = 0;
        for (Integer elem :
                lista) {
            if (elem == 2) {
                count++;
            }
        }

        System.out.println("existem "+count+" numeros iguais a 2");
    }
}
