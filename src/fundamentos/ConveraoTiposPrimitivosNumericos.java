package fundamentos;

public class ConveraoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; //implícita
        System.out.println(a);

        float b = (float) 1.12345; //explícita (Cast)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);
        }
        }


