package br.lista3.questao9e10.classes;

public class Aluno {
    private String nome;
    private int primeiraNota;
    private int segundaNota;

    private double media;
    private String situacao;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equalsIgnoreCase("fim")) {
            this.nome = nome;
        } else {
            this.nome = null;
        }
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        if (primeiraNota >= 0) {
            this.primeiraNota = primeiraNota;
        } else {
            this.primeiraNota = Integer.parseInt(null);
        }
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        if (primeiraNota >= 0) {
            this.segundaNota = segundaNota;
        } else {
            this.segundaNota = Integer.parseInt(null);
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
