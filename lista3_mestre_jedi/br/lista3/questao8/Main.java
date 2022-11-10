package br.lista3.questao8;

import java.util.Scanner;

public class Main {
    public static void pegarValores(int matriz[][]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero da posição [%d][%d]\n", i, j);
                int aux = input.nextInt();
                matriz[i][j] = aux;
            }
            System.out.println();
        }
    }

    public static int acumula(int matriz[][]) {
        int acumulador =0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                acumulador += matriz[i][j];
            }
        }
        return acumulador;
    }

    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        int media;
        int acumulador;

        pegarValores(matriz);
        acumulador = acumula(matriz);
        media = acumulador / (matriz.length * 3);

        System.out.printf("a media é de :%d", media);

    }
}
