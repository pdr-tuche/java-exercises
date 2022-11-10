package br.questao6;

import java.util.ArrayList;
import java.util.Scanner;

class Atleta{
    private String nome;
    private double distancia;
    private double tempo;
    private double velociadeMedia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getVelociadeMedia() {
        return velociadeMedia;
    }

    public void setVelociadeMedia(double velociadeMedia) {
        this.velociadeMedia = velociadeMedia;
    }

    public void calculaVelocidadeMedia(){
        setVelociadeMedia(this.distancia / this.tempo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double aux;
        String temp;
        String flag;
        ArrayList<Atleta>lista = new ArrayList<>();

        do {
            Atleta atleta = new Atleta();

            System.out.println("digite o nome do atleta");
            temp = input.nextLine();
            atleta.setNome(temp);

            System.out.println("digite a distancia percorrida");
            aux = input.nextDouble();
            atleta.setDistancia(aux);

            System.out.println("digite o tempo percorrido");
            aux = input.nextDouble();
            atleta.setTempo(aux);

            atleta.calculaVelocidadeMedia();

            lista.add(atleta);

            System.out.println("Deseja continuar a registrar? [sim] / [nao]");
            flag = input.next();
            input.nextLine();
        }while(flag.equalsIgnoreCase("sim"));

        for (Atleta elem :
                lista) {
            System.out.println("nome: "+elem.getNome());
            System.out.println("distancia: "+elem.getDistancia());
            System.out.println("tempo: "+elem.getTempo());
            System.out.println("velocidade media: "+elem.getVelociadeMedia());
            System.out.println("-- -- -- -- ");
        }
    }
}
