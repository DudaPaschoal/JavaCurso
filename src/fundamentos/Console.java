package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("Dia\n");
        System.out.println("Bom");
        System.out.println("dia! ");
        System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4 , 5);
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "Duda");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.printf("%s %s tem %d anos .%n", nome, sobrenome, idade);

        entrada.close();
    }
}
