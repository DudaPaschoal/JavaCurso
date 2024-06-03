package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom Dia X";
        s = s.toUpperCase();

        s = s.replace("X", "Senhora" );
        s = s.concat("!!!!");
        System.out.println(s);
        System.out.println("Leo".toUpperCase());

        String y = "Bom Dia X"
                .replace("X","Gui")
                .toUpperCase();
        System.out.println(y);

        //Tipo primitivo nao tem o operador "."


    }
}
