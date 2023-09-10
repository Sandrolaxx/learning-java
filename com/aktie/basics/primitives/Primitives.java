package com.aktie.basics.primitives;

public class Primitives {
    public static void main(String[] args) {
        byte valorUm = 1;
        byte valorSemInicializar;
        
        System.out.println(valorUm);
        // System.out.println(valorSemInicializar);
        
        short valorShortUm = 23232;
        System.out.println(valorShortUm);

        int valorIntUm = 232123212;
        System.out.println(valorIntUm);

        long valorLongUm = 232123212123123l;
        System.out.println(valorLongUm);
        
        float valorTaxaCartao = 2.69f;
        System.out.println(valorTaxaCartao);
        
        double valorTaxaCartaoDouble = 2.49;
        System.out.println(valorTaxaCartaoDouble);
        
        char letraA = 65;
        char letraB = 'B';

        System.out.println(letraA);
        System.out.println(letraB);
        
        boolean valorTrue = letraA == 'A';
        boolean valorFalse = letraA == 'B';
        
        System.out.println(valorTrue);
        System.out.println(valorFalse);
    }
}