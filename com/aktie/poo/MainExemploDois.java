package com.aktie.poo;

public class MainExemploDois {
    
    public static void main(String[] args) {
        
        Ninja primeiroNinja = new Ninja("Naruto", 16, "Folha", "Shuriken", "Uzumaki", "Rasengan");

        System.out.println(primeiroNinja.toString());
        
        primeiroNinja.realizarAniversario();
        
        System.out.println(primeiroNinja.toString());

    }

}
