package com.aktie.basics.arrays;

public class Arrays {

    public static void main(String[] args) {

        // Vetores
        // Declaração
        int[] arrayExample;

        // Inicialização
        int[] primeiraForma = new int[5];
        System.out.println(primeiraForma[3]);
                                        // 0 , 1, 2
        int[] segundaForma = new int[] { 23, 43, 55 };
        System.out.println(segundaForma[0]);
        System.out.println(segundaForma[1]);

        // Matriz
        // Declaração
        int[][] matrizExample;

        // Inicialização
        int[][] primeiraFormaM = new int[2][10];
        int[][] segundaFormaFormaM = new int[][] { { 23, 34 }, { 34, 88 }, { 67, 89 } };

        System.out.println(segundaFormaFormaM[1][1]);

         
    }

}
