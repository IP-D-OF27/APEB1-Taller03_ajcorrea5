package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        double resultado1 = ((Math.sqrt(var1) + var2) / var3);
        boolean comparacion1 = resultado1 == var2;
        boolean comparacion2 = var4 > var5;
        double resultado2 = var6 / var7;
        double resultado3 = Math.sqrt(var6);
        boolean comparacion3 = resultado2 >= resultado3;
        boolean resultadoFinal = comparacion1 || comparacion2 && comparacion3;
        System.out.println("Resultado de la primera comparacion:" + comparacion1);
        System.out.println("Resultado de la segunda comparacion:" + comparacion2);
        System.out.println("Resultado de la tercera comparacion:" + comparacion3 );
        System.out.println("Resultado final:" + resultadoFinal);
    }
}
