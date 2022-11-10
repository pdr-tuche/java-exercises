package br.lista3.questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        int contadorPar = 0, contadorImpar = 0;

        for (int i = 0; i < 3; i++) {
            int aux = input.nextInt();
            if (aux % 2 == 0) {
                par.add(aux);
                contadorPar++;
            } else {
                impar.add(aux);
                contadorImpar++;
            }
        }

        System.out.printf("existem %d numeros pares\n", contadorPar);
        System.out.printf("existem %d numeros impares\n", contadorImpar);
        System.out.println("PARES");
        for (Integer num :
                par) {
            System.out.println(num);
        }

        System.out.println("IMPARES");
        for (Integer num :
                impar) {
            System.out.println(num);
        }
    }
}
