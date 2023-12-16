package com.aktie.poo.class_objects;

public class MainExemploUm {
    
    public static void main(String[] args) {
        NinjaClass primeiroNinja = new NinjaClass();
        NinjaClass segundoNinja = new NinjaClass();

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
        
        // primeiroNinja.realizarJutso();
        // segundoNinja.realizarJutso();
    }

}
