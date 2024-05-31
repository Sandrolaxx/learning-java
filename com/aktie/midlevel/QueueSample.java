package com.aktie.midlevel;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    
    public static void main(String[] args) {
        
        Queue<String> filaPessoas = new LinkedList<>();
        
        filaPessoas.add("Sandro");
        filaPessoas.add("Marta");
        filaPessoas.add("Inter");
        filaPessoas.add("Maria");
        filaPessoas.add("Cleber");
        filaPessoas.add("Dudu");

        PriorityQueue<String> filaOrdenada = new PriorityQueue<>();
        filaOrdenada.addAll(filaPessoas);

        filaOrdenada.forEach(item -> System.out.println(item));

        System.out.println(filaPessoas.peek());
        
        filaPessoas.clear();
        
        System.out.println(filaPessoas);


    }

}
