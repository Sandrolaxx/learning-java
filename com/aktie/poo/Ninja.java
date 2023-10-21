package com.aktie.poo;

public class Ninja {
    
    String nome;

    int idade;

    String aldeia;

    String cla;
    
    String equipamento;

    String nomeJutso;

    void apresentarse() {
        System.out.println("Olá meu nome é " + nome + " sou do cla " + cla);
    }

    void realizarJutso() {
        System.out.println(nome + " realizando jutso " + nomeJutso);
    }

}
