package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();
        if (media <= 10.0 && media >= 7.0 ) {
            System.out.println("Aprovado! Parabéns! ");
            System.out.println("Você está de férias!");}

        if (media < 7 && media >= 4.5) {
            System.out.println("Recuperação! ");
        }

        if (media < 4.5 && media >= 0 )
            System.out.println("Reprovado.");


        entrada.close();
    }
}