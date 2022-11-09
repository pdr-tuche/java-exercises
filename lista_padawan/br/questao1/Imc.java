package br.questao1;

import java.util.Scanner;

/**
 * Created by Pedro Neves on 24 setembro, 2022.
 * Follow @pdr-tuche on GitHub.
 */
//1 - O índice de massa corpórea (IMC) de um indivíduo é obtido dividindo-se o seu peso (em Kg) pelo quadrado da
//        altura (em metros). Assim, por exemplo, uma pessoa de 1,67m e pesando 55kg tem IMC igual a 19,73. Escreva um
//        programa que solicite ao usuário o seu peso em kg e sua altura em metros e, a partir deles, calcule o índice de
//        massa corpórea e apresente o resultado de acordo com a situação abaixo.
//        IMC Situação
//        < 18,5 Magro
//        18,5 – 24,9 Normal
//        25,0 – 29,9 Sobrepeso
//        30,0 – 34,9 Obeso
//        35,0 – 39,9 Obesidade mórbida
public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = input.nextDouble();
        double peso = input.nextDouble();

        double imc = peso / (altura*altura);

        if(imc < 18.5){
            System.out.println("Seu "+imc+ "Magro");
        }else if(imc > 18.5 && imc <24.9) {
            System.out.println("Seu " + imc + "é Normal");
        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println("Seu " + imc + "é Sobrepeso");
        } else if (imc > 30.0 && imc < 34.9) {
            System.out.println("Seu "+imc+ " Obeso");
        }else if(imc > 35.0 && imc <35.9){
            System.out.println("Seu "+imc+ "Obesidade mórbida");
        }else {
            System.out.println("Seu "+imc+ "Procure um médico imediatamente \uD83D\uDC7A");
        }
    }
}
