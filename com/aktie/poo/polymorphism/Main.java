package com.aktie.poo.polymorphism;

import com.aktie.poo.heritage.AlunoNinja;

public class Main {

    public static void main(String[] args) {

        AlunoNinja alunoNinja = new AlunoNinja(
                "Naruto", 16, "Folha", "Shuriken", "Uzumaki",
                "Rasengan", "Time 1", "Kakashi");
        Hokage hokage = new Hokage("Naruto", 30, "Folha",
                "Uzumaki", "Shuriken", "Rasegan", 4);

        alunoNinja.realizarInvocacao();
        hokage.realizarInvocacao();

    }

}
