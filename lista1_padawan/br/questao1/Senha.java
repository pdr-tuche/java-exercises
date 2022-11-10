package br.questao1;


import java.util.Scanner;

/**
 * Created by Pedro Neves on 24 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */

/*
        2 - Faça um programa que peça ao usuário para cadastrar uma senha. Na sequência, deve pedir ao usuário que
        digite dois números inteiros e calcular a divisão do primeiro pelo segundo. O programa deve solicitar ao usuário
        a senha e, caso esteja correta, mostrar o resultado da divisão. Caso a senha esteja incorreta, mostrar uma
        mensagem de erro e encerrar o aplicativo (sem mostrar o resultado da divisão). OBS: Para encerrar seu aplicativo,
        utilize o método System.exit(0).
 */
public class Senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a senha: ");
        String senha = input.next();

        System.out.println("agora digite dois numeros");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        //conferindo senha
        System.out.println("digite a senha para ver a resposta");
        String aux = input.next();

        double resultado = n1 / n2;
        if (senha.equals(aux)) {
            System.out.println(resultado);
        } else {
            System.out.println("Não consegue ne moises");
            System.exit(0);
        }

    }
}
