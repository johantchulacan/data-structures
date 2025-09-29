import java.util.*;

public class GuerraNumeros {
    public static int warOfNumbers(int[] numeros) {
        Queue<Integer> cola = new LinkedList<>();

        // Encolar todos los números
        for (int n : numeros) cola.add(n);

        int sumaPares = 0;
        int sumaImpares = 0;

        // Procesar cola
        while (!cola.isEmpty()) {
            int actual = cola.poll();
            if (actual % 2 == 0) {
                sumaPares += actual;
            } else {
                sumaImpares += actual;
            }
        }

        return Math.abs(sumaPares - sumaImpares);
    }

    public static void main(String[] args) {
        System.out.println(warOfNumbers(new int[]{2, 8, 7, 5})); 
        // 2

        System.out.println(warOfNumbers(new int[]{12, 90, 75})); 
        // 27

        System.out.println(warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243})); 
        // 168
    }
}
