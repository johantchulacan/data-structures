import java.util.LinkedList;
import java.util.Queue;

public class NumeroTelefonico {
    public static String formatPhoneNumber(int[] numeros) {
        Queue<Integer> cola = new LinkedList<>();

        // Encolar todos los dígitos
        for (int n : numeros) cola.add(n);

        // Extraer en orden
        String area = "" + cola.poll() + cola.poll() + cola.poll();
        String primera = "" + cola.poll() + cola.poll() + cola.poll();
        String segunda = "" + cola.poll() + cola.poll() + cola.poll() + cola.poll();

        return "(" + area + ") " + primera + "-" + segunda;
    }

    public static void main(String[] args) {
        System.out.println(formatPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        // (123) 456-7890

        System.out.println(formatPhoneNumber(new int[]{5,1,9,5,5,5,4,4,6,8}));
        // (519) 555-4468

        System.out.println(formatPhoneNumber(new int[]{3,4,5,5,0,1,2,5,2,7}));
        // (345) 501-2527
    }
}
