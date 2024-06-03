package fundamentos.operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {
        //Trabalho na Terca V ou F televisao 32
        // Trabalho na quinta V ou F televisao 50

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou Tv de 50\" ? " + comprouTv50);
        System.out.println("Comprou Tv de 32\" ? " + comprouTv32);
        System.out.println("Comprou Sorvete ? " + comprouSorvete);

    }
}
