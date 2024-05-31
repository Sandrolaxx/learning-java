package com.aktie.samples;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] vetor = new int[] { 7, 2, 6, 4, 8, 5, 1, 3 };

        System.out.println("\nArray antes da ordenação:");
        Arrays.stream(vetor).forEach(num -> System.out.print(num + " "));

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("\n\nArray após a ordenação:");
        Arrays.stream(vetor).forEach(num -> System.out.print(num + " "));
    }

    public static void quickSort(int[] vetor, int menorIndice, int maiorIndice) {
        if (menorIndice < maiorIndice) {
            int indicePivo = particionar(vetor, menorIndice, maiorIndice);

            quickSort(vetor, menorIndice, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, maiorIndice);
        }
    }

    public static int particionar(int[] vetor, int menorIndice, int maiorIndice) {
        int valorPivo = vetor[maiorIndice];
        int ponteiroEsquerda = menorIndice - 1;

        for (int ponteiroDireita = menorIndice; ponteiroDireita < maiorIndice; ponteiroDireita++) {
            if (vetor[ponteiroDireita] <= valorPivo) {
                ponteiroEsquerda++;

                swap(vetor, ponteiroEsquerda, ponteiroDireita);
            }
        }

        swap(vetor, ponteiroEsquerda + 1, maiorIndice);

        return ponteiroEsquerda + 1;
    }

    public static void swap(int[] vetor, int ponteiroEsquerda, int ponteiroDireita) {
        int vetorTemp = vetor[ponteiroEsquerda];

        vetor[ponteiroEsquerda] = vetor[ponteiroDireita];
        vetor[ponteiroDireita] = vetorTemp;
    }

}
