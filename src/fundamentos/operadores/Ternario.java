package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 3.7;
        String resultadoRecuperacao = media >= 5.0 ? "Recuperação" : "Reprovado";
        String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;

        System.out.println("O aluno está " + resultado);
    }
}
