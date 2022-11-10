package br.questao7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        int quantidade;
        int total=0;

        System.out.println("digite o codigo do produto:");
        codigo= input.nextInt();
        System.out.println("digite a quantidade de produtos:");
        quantidade=input.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Caderno - R$ 12,00");
                total += 12 * quantidade;
                break;
            case 2:
                System.out.println("Régua - R$ 2,50");
                total += 2.50 * quantidade;
                break;
            case 3:
                System.out.println("Borracha - R$ 0,25");
                total += 0.25 * quantidade;
                break;
            case 4:
                System.out.println("Mochila - R$ 50,00");
                total+= 50 * quantidade;
                break;
        }

        System.out.println("Total a pagar: R$ "+ total);
    }
}
