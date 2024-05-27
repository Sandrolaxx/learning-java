package src.com.aktietech.samples;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] vetor = { 12, 4, 1, 7 };

        System.out.println("Array antes da ordenação:");
        Arrays.stream(vetor).forEach(num -> System.out.print(num + " "));

        mergeSort(vetor, 0, vetor.length - 1);

        System.out.println("\n\nArray após a ordenação:");
        Arrays.stream(vetor).forEach(num -> System.out.print(num + " "));
    }

    public static void mergeSort(int[] vetor, int indiceEsquerda, int indiceDireita) {
        if (indiceEsquerda < indiceDireita) {
            int indiceMeio = (indiceEsquerda + indiceDireita) / 2;

            mergeSort(vetor, indiceEsquerda, indiceMeio);
            mergeSort(vetor, indiceMeio + 1, indiceDireita);

            merge(vetor, indiceEsquerda, indiceMeio, indiceDireita);
        }
    }

    public static void merge(int[] vetor, int indiceEsquerda, int indiceMeio, int indiceDireita) {
        int tamanhoVetorEsquerda = indiceMeio - indiceEsquerda + 1;
        int tamanhoVetorDireita = indiceDireita - indiceMeio;

        int[] vetorEsquerda = new int[tamanhoVetorEsquerda];
        int[] vetorDireita = new int[tamanhoVetorDireita];

        // adicionando itens do vetor no dois arrays
        for (int i = 0; i < tamanhoVetorEsquerda; i++) {
            vetorEsquerda[i] = vetor[indiceEsquerda + i];
        }

        for (int j = 0; j < tamanhoVetorDireita; j++) {
            vetorDireita[j] = vetor[indiceMeio + 1 + j];
        }

        int indiceAuxE = 0;
        int indiceAuxD = 0;
        int indiceVetor = indiceEsquerda;

        System.out.print("\n[");
        Arrays.stream(vetorEsquerda).forEach(num -> System.out.print(num + " "));
        System.out.print("]\n[");
        Arrays.stream(vetorDireita).forEach(num -> System.out.print(num + " "));
        System.out.println("]");

        // iterações abaixo ordenam o vetor
        while (indiceAuxE < tamanhoVetorEsquerda && indiceAuxD < tamanhoVetorDireita) {
            boolean valorEsquerdaMenorDireita = vetorEsquerda[indiceAuxE] <= vetorDireita[indiceAuxD];

            if (valorEsquerdaMenorDireita) {
                vetor[indiceVetor] = vetorEsquerda[indiceAuxE];
                indiceAuxE++;
            } else {
                vetor[indiceVetor] = vetorDireita[indiceAuxD];
                indiceAuxD++;
            }

            indiceVetor++;
        }

        // termina a leitura das posições faltantes
        while (indiceAuxE < tamanhoVetorEsquerda) {
            vetor[indiceVetor] = vetorEsquerda[indiceAuxE];

            indiceAuxE++;
            indiceVetor++;
        }

        while (indiceAuxD < tamanhoVetorDireita) {
            vetor[indiceVetor] = vetorDireita[indiceAuxD];

            indiceAuxD++;
            indiceVetor++;
        }
    }

}
