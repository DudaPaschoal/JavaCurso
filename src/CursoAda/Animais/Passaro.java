package CursoAda.Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;


    public Passaro(String nome, String cor, int Altura, double peso, String estadoDeEspirito) {
        super(nome, cor, Altura, peso, estadoDeEspirito);
        numeroDePassaros ++;
    }

    @Override
    public void soar() {
        System.out.println("PiuPiu");
    }
}
