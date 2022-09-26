package br.questao4;

import java.util.Scanner;

/**
 * Created by Pedro Neves on 25 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */

//4 - Faça um programa para verificar a validade de uma senha fornecida pelo usuário. Se o usuário digitar a senha
//‘123456’, escrever a mensagem ‘Acesso liberado’. Caso contrário, escrever ‘Acesso negado’;
public class ValidaSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = input.next();

        System.out.println((senha.equals("123456")) ? "Acesso negado" : "Acesso liberado");
    }
}
