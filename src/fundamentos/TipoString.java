package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("Tarde"));
        System.out.println(s.equals("Boa Tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome);
        System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

    }
}
