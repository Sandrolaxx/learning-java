package com.aktie.poo;

public class Main {
    
    public static void main(String[] args) {
        
        Ninja primeiroNinja = new Ninja();
        Ninja segundoNinja = new Ninja();

        primeiroNinja.nome = "Naruto";
        primeiroNinja.idade= 16;
        primeiroNinja.aldeia="Folha";
        primeiroNinja.equipamento="Shuriken";
        primeiroNinja.cla="Uzumaki";
        primeiroNinja.nomeJutso="Rasengan";

        segundoNinja.nome="Sasuke";
        segundoNinja.idade= 16;
        segundoNinja.aldeia="Folha";
        segundoNinja.equipamento="Espada";
        segundoNinja.cla="Uchiha";
        segundoNinja.nomeJutso = "Chidori";
        
        primeiroNinja.apresentarse();
        segundoNinja.apresentarse();

        System.out.println("----------");
        
        primeiroNinja.realizarJutso();
        segundoNinja.realizarJutso();
    }

}
