package Classe;

import javax.xml.crypto.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;
          a++;
          b--;

        System.out.println(a + " " + b);


    }
}
