package Classe;

import javax.xml.crypto.Data;

public class data {
    public static void main(String[] args) {

        datateste d1 = new datateste();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;
        System.out.printf(d1.obterDataFormatada());

        var d2 = new datateste();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2020;
        System.out.printf(d2.obterDataFormatada());

    }
}
