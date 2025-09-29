import java.util.Stack;

public class SegundoMayor {
    public static int secondLargest(int[] numeros) {
        Stack<Integer> pila = new Stack<>();

        // Apilar todos los números
        for (int n : numeros) pila.push(n);

        // Inicializar
        int mayor = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        // Procesar desapilando
        while (!pila.isEmpty()) {
            int actual = pila.pop();

            if (actual > mayor) {
                segundo = mayor;
                mayor = actual;
            } else if (actual > segundo && actual < mayor) {
                segundo = actual;
            }
        }

        return segundo;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{10, 40, 30, 20, 50}));  // 40
        System.out.println(secondLargest(new int[]{25, 143, 89, 13, 105})); // 105
        System.out.println(secondLargest(new int[]{54, 23, 11, 17, 10}));  // 23
    }
}
