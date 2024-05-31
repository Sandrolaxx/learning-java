package com.aktie.midlevel;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    
    public static void main(String[] args) {
        
        Set<String> nomes = new HashSet<>();

        nomes.add("Gabriel");
        nomes.add("Sandro");
        nomes.add("José");
        nomes.add("Sandro");
        nomes.add("Bartimeu");

        nomes.removeIf(nome -> nome.contains("a"));

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
