import java.util.*;

public class SociedadSecreta {
    public static String societyName(String[] nombres) {
        Queue<String> cola = new LinkedList<>();

        // Encolar todos los nombres
        for (String n : nombres) cola.add(n);

        List<Character> iniciales = new ArrayList<>();

        // Desencolar y obtener inicial
        while (!cola.isEmpty()) {
            String nombre = cola.poll();
            iniciales.add(Character.toUpperCase(nombre.charAt(0)));
        }

        // Ordenar las iniciales
        Collections.sort(iniciales);

        // Construir resultado
        StringBuilder resultado = new StringBuilder();
        for (char c : iniciales) resultado.append(c);

        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(societyName(new String[]{"Adam", "Sarah", "Malcolm"})); 
        // AMS

        System.out.println(societyName(new String[]{"Harry", "Newt", "Luna", "Cho"})); 
        // CHLN

        System.out.println(societyName(new String[]{"Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"})); 
        // CJMPRR
    }
}
