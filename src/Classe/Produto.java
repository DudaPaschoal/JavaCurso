package Classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;

    }

    public Produto(String notebook, double v) {
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
