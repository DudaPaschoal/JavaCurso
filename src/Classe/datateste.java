package Classe;

public class datateste {
    int dia;
    int mes;
    int ano;

   String obterDataFormatada(){
       return String.format("%d/%d/%d\n", dia, mes, ano);

    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
