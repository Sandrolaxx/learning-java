package com.aktie.poo;

public class Ninja {
    
    private String nome;

    private int idade;

    private String aldeia;

    private String cla;
    
    private String equipamento;

    private String nomeJutso;

    public Ninja(String nome, int idade, String aldeia, String cla, String equipamento, String nomeJutso) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.cla = cla;
        this.equipamento = equipamento;
        this.nomeJutso = nomeJutso;
    }

    public void apresentarse() {
        System.out.println("Olá meu nome é " + nome + " sou do cla " + cla);
    }

    public void realizarJutso() {
        System.out.println(nome + " realizando jutso " + nomeJutso);
    }

    public void realizarAniversario() {
        this.idade = idade + 1;
    }

    public void realizarInvocacao() {
        System.out.println("Realizar invocação de um animal...");
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
