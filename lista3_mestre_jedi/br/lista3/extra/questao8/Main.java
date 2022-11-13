package br.lista3.extra.questao8;

import java.util.Scanner;

public class Main {
    //Faça um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule C = A ∗B
    public static void pegarValores(int matriz[][]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero da posição [%d][%d]\n", i, j);
                int aux = input.nextInt();
                matriz[i][j] = aux;
            }
            System.out.println();
        }
    }

    public static int[][] somaDeMatrizes(int mat1[][], int mat2[][]) {
        int res[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int aux = mat1[i][j] + mat2[i][j];
                res[i][j] = aux;
            }
        }
        return res;
    }

    public static void mostrarValores(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];

        pegarValores(A);
        pegarValores(B);

        System.out.println("Valores de A");
        mostrarValores(A);
        System.out.println("valores de B");
        mostrarValores(B);

        System.out.println("Resultado soma");
        mostrarValores(somaDeMatrizes(A,B));

    }
}
