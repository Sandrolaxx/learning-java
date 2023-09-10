package com.aktie.basics.operators;

public class Opertators {
    public static void main(String[] args) {
        int valorInteiro = 10;
        System.out.println(valorInteiro);
        
        int soma = 4 + valorInteiro;
        int sub = 4 - valorInteiro;
        int mult = 2 * valorInteiro;
        int div = valorInteiro / 2;
        int resto = valorInteiro % 2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Sub: " + sub);
        System.out.println("Mul: " + mult);
        System.out.println("Div: " + div);
        System.out.println("Resto: " + resto);

        System.out.println(++valorInteiro);
        System.out.println(--valorInteiro);

        System.out.println(!(valorInteiro == 10));

        System.out.println(valorInteiro != 10);
        System.out.println(valorInteiro >= 10);

        if (valorInteiro == 10 || valorInteiro < 5) {
            System.out.println("É verdadeiro.");
        }
        
        String valorIgual = valorInteiro == 10 ? "Verdade" : "Falso";

        System.out.println(valorIgual);
    }   
}
