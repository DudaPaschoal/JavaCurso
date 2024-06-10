package Controle;

import java.util.Scanner;

public class problemasteste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int X  = A + B;
        System.out.println(" X = " + X);

        entrada.close();
        String nome = "Duda";
        System.out.println("Olá, " + nome);

        for (int i = 0; i <= 10; i+=2)  {
            System.out.println(i);
        }
    }
}
