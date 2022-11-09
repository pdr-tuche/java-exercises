package br.questao9;

import java.util.ArrayList;
import java.util.Scanner;
class Pessoa{
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private double altura;
    private int idade;
}


public class Main {

    public static double calculaMediaAltura(ArrayList<Pessoa>p){
        double acumulador =0;
        double med;
        for (Pessoa elem :
                p) {
            if(elem.getIdade() >= 50) {
                acumulador += elem.getAltura();
            }
        }
        med = acumulador / p.size();
        return med;
    }

    public static void main(String[] args) {

        int age;
        double height;
        ArrayList<Pessoa>lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            Pessoa pessoa = new Pessoa();
            System.out.println("digite sua idade:");
            age = input.nextInt();
            if(age <= 0){
                break;
            }else{
                pessoa.setIdade(age);
                System.out.println("digite sua altura:");
                height = input.nextDouble();
                pessoa.setAltura(height);
                lista.add(pessoa);
            }
        }while(true);

        System.out.println("a media de altura das pessoas com mais de 50 anos é de: "+calculaMediaAltura(lista));

    }
}
