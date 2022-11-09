package br.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a idade do atleta");

        int age = input.nextInt();

        String categoria;
        if(age >=5 && age <=10){
            categoria = "Infantil";
        } else if (age >= 11 && age <= 15) {
            categoria = "Juvenil";
        } else if (age >= 16 && age <= 20) {
            categoria = "Junior";
        } else if (age >= 21 && age <= 25) {
            categoria = "Profissional";
        }else{
            categoria = "Desconhecida";
        }

        System.out.print("Sua categoria é "+categoria);
    }
}
