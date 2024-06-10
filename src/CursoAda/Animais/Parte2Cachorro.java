package CursoAda.Animais;

import CursoAda.Lojas.PetShop;

public class Parte2Cachorro {
    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro("Rex", "Branco", 10, 10.5, "nada");

        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, "nada" );

        Gato gato1 = new Gato("Felix", "Preto", 7, 5.5, "nada");
        Animal gato2 = new Gato("Felix", "Preto", 7, 5.5, "nada");
        Animal gato4 = new Passaro("Felix", "Preto", 7, 5.5, "nada");

        Passaro passaro1 = new Passaro("Fenix", "Azul", 5, 0.5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        PetShop petShop = new PetShop();

        petShop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petShop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petShop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}
