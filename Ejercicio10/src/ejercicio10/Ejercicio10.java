package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        double resultadoRaiz = Math.sqrt(var1) * var2;
        boolean comparacion1 = resultadoRaiz >= var3;
        int resultadoDivision = var2 / var4;
        boolean comparacion2 = resultadoDivision >= var5;
        boolean resultadoFinal = comparacion1 && (true) || (false) || comparacion2;
        System.out.println("Resultado de la primera comparacion:" + comparacion1);
        System.out.println("Resultado de la segunda comparacion:" + comparacion2);
        System.out.println("Resultado final:" + resultadoFinal);
    }
}
