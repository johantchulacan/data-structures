import java.util.Stack;

public class VotosPila {
    public static int getVoteCount(int upvotes, int downvotes) {
        Stack<Integer> pila = new Stack<>();

        // Apilar primero los votos negativos y luego los positivos
        pila.push(downvotes); // parte inferior
        pila.push(upvotes);   // parte superior

        // Recuperamos los votos de la pila
        int positivos = pila.pop(); // último en entrar → upvotes
        int negativos = pila.pop(); // ahora → downvotes


        return positivos - negativos;
    }

    public static void main(String[] args) {
        System.out.println("Resultado 1: " + getVoteCount(13, 0));     // ➞ 13
        System.out.println("Resultado 2: " + getVoteCount(2, 33));     // ➞ -31
        System.out.println("Resultado 3: " + getVoteCount(132, 132));  // ➞ 0
    }
}