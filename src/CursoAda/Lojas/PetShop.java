package CursoAda.Lojas;

import CursoAda.Animais.Animal;
import CursoAda.Animais.Cachorro;
import CursoAda.Animais.Gato;

public class PetShop {

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");

    }
    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudade");
    }
}
