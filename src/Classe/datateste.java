package Classe;

public class datateste {
    int dia;
    int mes;
    int ano;
    datateste(int diaC, int mesC, int anoC){
        dia = diaC;
        mes = mesC;
        ano = anoC;

    }
    datateste(){

    }
   String obterDataFormatada(){
       return String.format("%d/%d/%d\n", dia, mes, ano);

    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
