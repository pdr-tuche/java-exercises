package br.lista3.questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char letra[][] = new char [4][4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a letra da posição [%d][%d]\n",i,j);
                char aux = input.next().charAt(0);
                letra[i][j] = aux;
            }
            System.out.println();
        }

        for (int i =0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.printf("%c ", letra[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
