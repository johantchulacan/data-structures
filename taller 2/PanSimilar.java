import java.util.Stack;

public class PanSimilar {
    public static boolean hasSameBread(String[] sandwich1, String[] sandwich2) {
        Stack<String> pila1 = new Stack<>();
        Stack<String> pila2 = new Stack<>();

        // Apilar los ingredientes de cada sandwich
        for (String ingrediente : sandwich1) pila1.push(ingrediente);
        for (String ingrediente : sandwich2) pila2.push(ingrediente);

        // Primer pan = el primer insertado (posición base del stack)
        String primerPan1 = sandwich1[0];
        String primerPan2 = sandwich2[0];

        // Último pan = el último desapilado
        String ultimoPan1 = pila1.pop();
        String ultimoPan2 = pila2.pop();

        return primerPan1.equals(primerPan2) && ultimoPan1.equals(ultimoPan2);
    }

    public static void main(String[] args) {
        System.out.println(hasSameBread(
            new String[]{"pan blanco", "lechuga", "pan blanco"},
            new String[]{"pan blanco", "tomate", "pan blanco"})); // true

        System.out.println(hasSameBread(
            new String[]{"pan integral", "pollo", "pan integral"},
            new String[]{"pan blanco", "pollo", "pan blanco"})); // false

        System.out.println(hasSameBread(
            new String[]{"tostada", "queso", "tostada"},
            new String[]{"pan integral", "queso", "tostada"})); // false
    }
}
