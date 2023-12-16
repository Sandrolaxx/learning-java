package com.aktie.poo.class_objects;

public class NinjaClass {

    String nome;

    int idade;

    String aldeia;

    String cla;

    String equipamento;

    String nomeJutso;

    public void apresentarse() {
        System.out.println("Olá meu nome é " + nome + " sou do cla " + cla);
    }

    public void realizarJutso() {
        System.out.println(nome + " realizando jutso " + nomeJutso);
    }

    public void realizarAniversario() {
        this.idade = idade + 1;
    }

    @Override
    public String toString() {
        return "Ninja [nome=" + nome + ", idade=" + idade + ", aldeia=" + aldeia + ", cla=" + cla + ", equipamento="
                + equipamento + ", nomeJutso=" + nomeJutso + "]";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public String getCla() {
        return cla;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public String getNomeJutso() {
        return nomeJutso;
    }

}
