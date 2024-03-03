package com.aktie.poo.heritage;

import com.aktie.poo.Ninja;

public class AlunoNinja extends Ninja {
    
    public AlunoNinja(String nome, int idade, String aldeia, String cla, String equipamento,
        String nomeJutso, String nomeTime, String nomeProfessor) {
		super(nome, idade, aldeia, cla, equipamento, nomeJutso);
		
        this.nomeProfessor = nomeProfessor;
        this.nomeTime = nomeTime;
	}

	private String nomeTime;
    
    private String nomeProfessor;

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    @Override
    public void apresentarse() {
        System.out
                .println("Olá meu nome é " + getNome() + " sou do cla " + getCla() + " e meu time é " + this.nomeTime);
    }
    
    @Override
    public void realizarInvocacao() {
        System.out.println("Realizando invocação de um doguinho🐶");
    }

}
