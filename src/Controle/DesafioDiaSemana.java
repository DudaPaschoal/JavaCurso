package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Dia da Semana: ");

        String dia = entrada.next();

        if (dia.equalsIgnoreCase("Domingo") ) {
            System.out.println("Dia 1");
        } else if (dia.equalsIgnoreCase ("Segunda") ) {
            System.out.println("Dia 2");
        } else if (dia.equalsIgnoreCase ("Terça"))  {
            System.out.println("Dia 3");
        } else if (dia.equalsIgnoreCase ("Quarta")) {
            System.out.println("Dia 4");
        } else if (dia.equalsIgnoreCase ("Quinta")) {
            System.out.println("Dia 5");
        } else if (dia.equalsIgnoreCase ("Sexta")) {
            System.out.println("Dia 6");
        } else if (dia.equalsIgnoreCase ("Sabádo")) {
            System.out.println("Dia 7");
        } else {
            System.out.println("Dia Inválido");
        }

        System.out.println("Fim!");
        entrada.close();
    }
}
