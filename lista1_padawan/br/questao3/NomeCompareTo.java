package br.questao3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */

// - Utilizando o método compareTo() encontre o menor nome (mais próximo da letra A) num grupo de 5 nomes.
public class NomeCompareTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(5); //lista dos nomes
        ArrayList<Integer> listaTamanhos = new ArrayList<>(5); //lista do tamanho dos nomes
        String menorNome;
        int guardarIndice = 0;
        int menorTamanhoTemp = 0;

        //criando as listas
        for (int i = 0; i < 5; i++) {
            String aux = input.nextLine();
            lista.add(aux);

            int tamanhoDaString = lista.get(i).compareTo(""); //utilizando compareTo com parametro vazio para ser retornado o tamanho real da string (numero de caracteres)
            listaTamanhos.add(tamanhoDaString);
        }

        //procurando o indice da menor palavra
        for (int i = 0; i < listaTamanhos.size(); i++) {
            menorTamanhoTemp = Collections.min(listaTamanhos); // este é o menor valor da lista
            if(listaTamanhos.get(i) == menorTamanhoTemp){ // a condição permite percorrer o ArrayList e guardar seu indice
                guardarIndice = i;
            }
        }
        menorNome = lista.get(guardarIndice); //com o indice da lista de tamanhos, referencio ele na lista de nomes visto que a lista de tamanho possui os mesmos indices da lista de nomes.

        //exibindo resultado final.
        System.out.println("menor nome é "+ menorNome + " que retornou -> " + listaTamanhos.get(guardarIndice));
    }
}
