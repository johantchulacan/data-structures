import java.util.*;

public class CuatroLetras {
    public static List<String> isFourLetters(String[] palabras) {
        Stack<String> pila = new Stack<>();
        List<String> resultado = new ArrayList<>();

        // Apilar todas las palabras
        for (String p : palabras) pila.push(p);

        // Desapilar y filtrar
        while (!pila.isEmpty()) {
            String actual = pila.pop();
            if (actual.length() <= 4) {
                resultado.add(actual);
            }
        }

        // Como al desapilar queda en orden inverso, lo reordenamos
        Collections.reverse(resultado);

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(isFourLetters(new String[]{"Tomate", "Papa", "Par"})); 
        // [Papa]

        System.out.println(isFourLetters(new String[]{"Canguro", "Oso", "Zorro"})); 
        // [Oso]

        System.out.println(isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"})); 
        // [Ryan, Matt]
    }
}
