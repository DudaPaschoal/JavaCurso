package fundamentos;

public class temperatura {
    public static void main(String[] args) {
        //( F - 32) * 5/9 = C
        double F = 102.00; //Fahrenheit
        final double x = 32;
        final double y = 5.0/9.0;
        double C = (F-x) * y; //Celsius
        System.out.println("O resultado é " + C + "C°" );
    }
}
