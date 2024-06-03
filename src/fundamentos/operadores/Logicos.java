package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 ||condicao2 );
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        //Tabela verdade E
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //Tabela verdade Ou Or
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //Tabela verdade XOR ou exclusivo
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);


        //Tabela verdade not
        System.out.println(!true);
        System.out.println(!false);


    }
}
