package br.lista3.extra.questao9;

import java.util.Scanner;

public class Main {
    //9 -Faça programa que leia uma matriz 3 x 6 com valores reais.
    // (a)Imprima a soma de todos os elementos das colunas ímpares.
    // (b) Imprima a média aritmética dos elementos da segunda e quarta colunas.
    // (c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
    // (d) Imprima a matriz modificada
    public static void pegarValores(int matriz[][]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = j + 1;
            }
        }
    }

    public static int somaColImpar(int[][] matriz) {
        int aux = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j % 2 != 0) {
                    aux += matriz[i][j];
                }
            }
        }
        return aux;
    }

    public static double mediaCol2e4(int[][] matriz) {
        double acumulador = 0;
        double med = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 2 || j == 4) {
                    acumulador += matriz[i][j];
                }
            }
        }
        med = acumulador / 6;
        return med;
    }

    public static int[][] substituir6porSoma1e2(int[][] matriz) {
        int mat[][] = new int[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5) {
                    mat[i][5] = matriz[i][1] + matriz[i][2];
                } else {
                    mat[i][j] = matriz[i][j];
                }
            }
        }
        return mat;
    }

        public static void main (String[]args){

            int A[][] = new int[3][6];
            pegarValores(A);
            System.out.println("matriz inicial:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }
            System.out.printf("(a)Imprima a soma de todos os elementos das colunas ímpares = %s\n", somaColImpar(A));
            System.out.printf("(b) Imprima a média aritmética dos elementos da segunda e quarta colunas = %f\n", mediaCol2e4(A));
            System.out.print("(c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2\n");
            A = substituir6porSoma1e2(A);
            System.out.println("(d) Imprima a matriz modificada");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }

        }
    }
