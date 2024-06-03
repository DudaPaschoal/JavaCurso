package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Ler num 1
        //Ler num 2
        //Pedir operacao + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.println("""
                Opções de cálculo disponíveis:
                Soma: +
                Subtração: -
                Divisão: /
                Multiplicação: *
                ------------------------------------
                Digite o símbolo de sua escolha:""");

        String simbol = entrada.next();
        System.out.println(simbol.equals("+") ? n1+n2 : simbol.equals("-") ? n1 - n2 : simbol.equals("*") ? n1*n2 : simbol.equals("/") ? n1/n2 : simbol.equals("%")? n1%n2 :  "Operação não Encontrada");

    }
    }

