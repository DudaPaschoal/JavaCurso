package Classe;

import java.awt.geom.Area;

public class AreaCirc {
    double raio;
    static  final double pi = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;

    }
    double area(){
        return pi * Math.pow(raio, 2);
    }
}
