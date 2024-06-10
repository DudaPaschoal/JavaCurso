package CursoAda.Animais;

public class Cachorro extends Animal{
    //Atributos
    static int numerodeCachorros;

    //Contrutores adicionados

    public Cachorro(String nome, String cor, int Altura, double peso, String estadoDeEspirito) {
        super(nome, cor, Altura, peso, estadoDeEspirito);
        numerodeCachorros++;
    }
    //Metodos

    public static int getNumerodeCachorros() {
        return numerodeCachorros;
    }

    public static void setNumerodeCachorros(int numerodeCachorros) {
        Cachorro.numerodeCachorros = numerodeCachorros;
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho" : this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir" : this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
        return this.estadoDeEspirito;

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AuAu");
    }
}
