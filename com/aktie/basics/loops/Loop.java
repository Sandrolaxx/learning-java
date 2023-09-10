package com.aktie.basics.loops;

public class Loop {
    
    public static void main(String[] args) {
        
        int[] randomNumbers = new int[] { 34, 2, 23, 54, 45, 65 };
        int counter = 6;

        while (counter < randomNumbers.length) {
            System.out.println("Entrou");
            System.out.println(randomNumbers[counter]);
            
            counter++;
        }
        
        do {
            System.out.println("Entrou Do while");
            
            System.out.println(randomNumbers[counter - 1]);
        } while (counter < randomNumbers.length);

        for (int i = 0; i < randomNumbers.length; i++) {
            if (i == 2) {
                continue;
            }

            System.out.println(i);
        }
        
        // for (int element : randomNumbers) {
        //     System.out.println(element);
        // }

    }

}
