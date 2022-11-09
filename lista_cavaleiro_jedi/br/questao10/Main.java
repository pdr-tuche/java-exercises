package br.questao10;

import java.util.ArrayList;
import java.util.Scanner;

class Pessoa{
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private String sexo;
    private double altura;
}
public class Main {
    public static int contagemMasculino(ArrayList<Pessoa>p) {
        int contador = 0;
        for (Pessoa elem :
                p) {
            if (elem.getSexo().equalsIgnoreCase("M")) {
                contador++;
            }
        }
        return contador;
    }

    public static int contagemFeminino(ArrayList<Pessoa>p) {
        int contador = 0;
        for (Pessoa elem :
                p) {
            if (elem.getSexo().equalsIgnoreCase("F")) {
                contador++;
            }
        }
        return contador;
    }

    public static double maiorAltura(ArrayList<Pessoa>p) {
        double maior = 0;
        for (Pessoa elem :
                p) {
            if (elem.getAltura() > maior) {
                maior = elem.getAltura();
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sexoTemp;
        double alturaTemp;
        int quantidadeDeVezesRodadas =0;

        do {
            ArrayList<Pessoa> lista = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Pessoa pessoa = new Pessoa();
                System.out.println("digite o sexo da " + i + 1 + " pessoa: [M] / [F] ");
                sexoTemp = input.next();
                pessoa.setSexo(sexoTemp);

                System.out.println("digite a altura:");
                alturaTemp = input.nextDouble();
                pessoa.setAltura(alturaTemp);

                lista.add(pessoa);
            }

            System.out.println("Quantidade de Homens: " + contagemMasculino(lista));
            System.out.println("Quantidade de Mulheres: " + contagemFeminino(lista));
            System.out.println("Altura mais alta: " + maiorAltura(lista));

            quantidadeDeVezesRodadas++;
            System.out.println(quantidadeDeVezesRodadas);
        }while(quantidadeDeVezesRodadas < 10);
    }
}
