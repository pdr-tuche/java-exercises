package br.lista3.extra.questao6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> vet = new ArrayList<>();
        int codigo;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            vet.add(input.nextInt());
        }

        System.out.println("digite o codigo");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                for (Integer elem :
                        vet) {
                    System.out.println(elem);
                }
                break;
            case 2:
                for (int i = 4; i >= 0; i--) {
                    System.out.println(vet.get(i));
                }
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }


    }
}
