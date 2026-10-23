package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        double resultado = (Math.sqrt(var1) + var2) / var3;
        boolean expresion1 = resultado == var2;
        boolean expresion2 = var4 > var5;
        boolean resultadoFinal = expresion1 && expresion2;
        System.out.println("La expresion 1 es:" + expresion1);
        System.out.println("La expresion 2 es:" + expresion2);
        System.out.println("Resultado final:" + resultadoFinal);
    }
}
