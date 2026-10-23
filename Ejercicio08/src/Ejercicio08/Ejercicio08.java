package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        double resultado1 = ((var1 * var2) + var3 - (var4 / var5) + Math.pow(var6, var5));
        boolean comparacion1 = resultado1 >= var7;
        int resultado2 = var8 - var8 + var9;
        boolean comparacion2 = var8 >= resultado2;
        boolean resultadoFinal = comparacion1 || comparacion2;
        System.out.println("Resultado de la primera comparacion:" + comparacion1);
        System.out.println("Resultado de la segunda comparacion:" + comparacion2);
        System.out.println("Resultado final:" + resultadoFinal);
        
    }
}
