package br.lista3.questao7;

import java.util.Scanner;

public class Main {
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

    public static void mostrarValores(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
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

    public static void main(String[] args) throws InterruptedException {
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int resultado[][] = new int[3][3];

        System.out.println("digite os valores da matriz 1");
        Thread.sleep(500);
        pegarValores(mat1);

        System.out.println("digite os valores da matriz 2");
        Thread.sleep(500);
        pegarValores(mat2);

        resultado = somaDeMatrizes(mat1, mat2);
        mostrarValores(resultado);
    }
}
