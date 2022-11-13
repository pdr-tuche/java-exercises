package br.lista3.extra.questao7;

import java.util.Scanner;

public class Main {
    //Faça um programa para ler os elementos de uma matriz 5 x 5.
    // Em seguida, receba do usuário um valor X. O programa deverá fazer a busca desse valor na matriz e,
    // ao final, escrever a localização do elemento (mostrar a linha e coluna).
    // Caso não encontre, deve mostra ruma mensagem de “não encontrado

    public static int[][] preencher(int matriz[][]) {
        int mat[][] = matriz;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = j + 1;
            }
            System.out.println();
        }
        return mat;
    }

    public static void mostrar(int matriz[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void pesquisarEMostrar(int matriz[][], int valor) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valor) {
                    System.out.printf("O numero %s aparece em:\n", valor);
                    System.out.printf("Linha: %s\n", i + 1);
                    System.out.printf("Coluna: %s\n", j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int valor;

        matriz = preencher(matriz);

        Scanner input = new Scanner(System.in);
        valor = input.nextInt();

        mostrar(matriz);
        pesquisarEMostrar(matriz, valor);
    }
}
