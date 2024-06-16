package com.aktie.midlevel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {

    public static void main(String[] args) {

        Map<String, Integer> concessionaria = new HashMap<>();
        Map<String, Integer> concessionariaRespeitaInsercao = new LinkedHashMap<>();
        TreeMap<String, Integer> concessionariaOrdenada = new TreeMap<>();

        // Exemplo de HashMap
        concessionaria.put("BMW", 6);
        concessionaria.put("Fiat", 12);
        concessionaria.put("Audi", 2);
        concessionaria.put("Chevrolet", 10);
        concessionaria.put("BMW", 10);
        concessionaria.put(null, null);

        System.out.println(concessionaria.get("Fiat"));
        System.out.println(concessionaria.getOrDefault("Bulgatti", 0));
        System.out.println(concessionaria.containsKey("Bulgatti"));

        System.out.println("Exemplo HashMap----------------------");

        concessionaria.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
        });

        // Exemplo de HashMap
        concessionariaRespeitaInsercao.put("BMW", 6);
        concessionariaRespeitaInsercao.put("Fiat", 12);
        concessionariaRespeitaInsercao.put("Audi", 2);
        concessionariaRespeitaInsercao.put("Chevrolet", 10);

        System.out.println("Exemplo LinkedHashMap----------------------");

        concessionaria.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
        });

        // Exemplo de TreeMap
        concessionariaOrdenada.put("BMW", 6);
        concessionariaOrdenada.put("Fiat", 12);
        concessionariaOrdenada.put("Audi", 2);
        concessionariaOrdenada.put("Chevrolet", 10);

        System.out.println("Exemplo TreeMap----------------------");

        concessionaria.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
        });

        // Só existe em TreeMap
        System.out.println(concessionariaOrdenada.firstKey());
    }

}
