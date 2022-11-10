package br.lista3.questao9e10.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController extends Aluno {
    private ArrayList<Aluno> turma = new ArrayList<>();
    private double mediaTurma;

    public AlunoController() {
    }

    public double getMediaTurma() {
        return mediaTurma;
    }

    public void setMediaTurma(double mediaTurma) {
        this.mediaTurma = mediaTurma;
    }

    public boolean pegarDados() {
        Scanner input = new Scanner(System.in);
        String aux;
        int auxN1, auxN2;

        System.out.println("Digite o nome do aluno:");
        aux = input.nextLine();
        if (aux.equalsIgnoreCase("fim")) {
            return true;
        } else {
            Aluno a = new Aluno();
            a.setNome(aux);

            System.out.println("Digite a primeira nota:");
            auxN1 = input.nextInt();
            a.setPrimeiraNota(auxN1);

            System.out.println("Digite a segunda nota:");
            auxN2 = input.nextInt();
            a.setSegundaNota(auxN2);

            adicionarAlunoNaTurma(a);
            obterMediaAluno(a);
            aprovacao(a);
        }
        return false;
    }

    public void adicionarAlunoNaTurma(Aluno a) {
        this.turma.add(a);
    }

    public void mostrarTurma() {
        for (Aluno elem :
                this.turma) {
            System.out.printf("""
                    Aluno: %s
                    Primeira Nota: %f
                    Segunda Nota: %f
                    Media: %f
                    %s
                    --- --- --- ---
                    """, elem.getNome(), elem.getPrimeiraNota(), elem.getSegundaNota(), elem.getMedia(), elem.getSituacao());
        }
    }

    public void obterMediaAluno(Aluno a) {
        double media = (a.getPrimeiraNota() + a.getSegundaNota()) / 2;
        a.setMedia(media);
    }

    public double mediaTurma() {
        double acumulador = 0;
        double media;
        for (Aluno elem :
                this.turma) {
            acumulador += elem.getMedia();
        }

        media = acumulador / this.turma.size();
        return media;
    }

    public void mostrarMediaTurma() {
        System.out.printf("A media de notas da turma é de: %f", getMediaTurma());
        System.out.printf("Total de %s alunos aprovados.", quantidadeAprovados());
    }

    public void aprovacao(Aluno a) {
        if (a.getMedia() >= 60.0) {
            a.setSituacao("Aprovado");
        } else {
            a.setSituacao("Reprovado");
        }
    }

    public int quantidadeAprovados() {
        int count = 0;
        for (Aluno elem :
                this.turma) {
            if (elem.getSituacao().equals("Aprovado")) {
                count++;
            }
        }
        return count;
    }
}
