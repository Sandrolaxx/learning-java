package com.aktie.basics.controlstructures;

public class Control {

    public static void main(String[] args) {

        int tempoEstudo = 40;

        // if (tempoEstudo < 20) {
        // System.out.println("Vou aprender");
        // } else if(tempoEstudo > 20 && tempoEstudo < 50) {
        // System.out.println("Vou aprender mais rápido");
        // } else {
        // System.out.println("Não vou aprender");
        // }

        // String aprendizado = tempoEstudo > 30 ? "Vou aprender" : "Não vou";

        // System.out.println(aprendizado);

        switch (tempoEstudo) {
            case 20:
                System.out.println("Baixo");
                break;
            case 40:
                System.out.println("Médio");
                break;
            case 120:
                System.out.println("Alto");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }

}
