package br.lista3.questao9e10;

import br.lista3.questao9e10.classes.AlunoController;

public class Main {
    public static void main(String[] args) {

        AlunoController aluno = new AlunoController();
        boolean flagFim;
        do {
            flagFim = aluno.pegarDados();
        } while (flagFim != true);

        aluno.mostrarTurma();
        aluno.setMediaTurma(aluno.mediaTurma(aluno.getTurma())); //passando o array de turmas para calcular a media da turma e depois passado para o set
        aluno.mostrarMediaTurma();


    }
}
