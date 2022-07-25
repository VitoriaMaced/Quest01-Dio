package questao01Dio;

public class Calculadora {

    public static void soma(double nun1, double nun2){
        double resultado = nun1 + nun2;

        System.out.println( "A soma de " + nun1 +" mais "+ nun2 +" é " + resultado);

    }

    public static void subtracao(double nun1, double nun2){
        double resultado = nun1 - nun2;

        System.out.println( "A subtracao de " + nun1 +" mais "+ nun2 +" é " + resultado);

    }

    public static void multiplicacao(double nun1, double nun2){
        double resultado = nun1 * nun2;

        System.out.println( "A multiplicacao de " + nun1 +" mais "+ nun2 +" é " + resultado);

    }

    public static void divisao(double nun1, double nun2){
        double resultado = nun1 / nun2;

        System.out.println( "A divisao de " + nun1 +" mais "+ nun2 +" é " + resultado);

    }
}
