package br.questao5;

import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */

//5 - Faça um programa para ler o número de gols marcados pelo Nacional de Patos e o número de gols marcados
//pelo Treze. Escrever o nome do time vencedor. Caso não haja vencedor, escrever EMPATE.
public class InvictoSoOBelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golsPatos = input.nextInt();
        int golsTreze = input.nextInt();

        if(golsPatos > golsTreze){
            System.out.println("Nacional de Patos venceu");
        } else if (golsTreze > golsPatos) {
            System.out.println("Treze venceu, mas nunca foi campeão invicto do paraibano.");
        }else{
            System.out.println("EMPATE");
        }
    }
}
