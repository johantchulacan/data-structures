import java.util.Stack;

public class CuadradosCubos {
    public static boolean checkSquareAndCube(int[] numeros) {
        Stack<Integer> pila = new Stack<>();

        // Apilar
        for (int num : numeros) pila.push(num);

        // Desapilar en orden inverso
        int segundo = pila.pop(); // segundo número
        int primero = pila.pop(); // primer número

        // Raíz cuadrada y cúbica
        double raizCuadrada = Math.sqrt(primero);
        double raizCubica = Math.cbrt(segundo);

        // Comparar con tolerancia para evitar errores de punto flotante
        return Math.abs(raizCuadrada - raizCubica) < 1e-9;
    }

    public static void main(String[] args) {
        System.out.println(checkSquareAndCube(new int[]{4, 8}));   // true
        System.out.println(checkSquareAndCube(new int[]{16, 48})); // false
        System.out.println(checkSquareAndCube(new int[]{9, 27}));  // true
    }
}
