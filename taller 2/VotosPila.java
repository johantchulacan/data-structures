import java.util.Stack;

public class VotosPila {
    public static int getVoteCount(int upvotes, int downvotes) {
        Stack<Integer> pila = new Stack<>();

        // Apilar valores
        pila.push(upvotes);
        pila.push(downvotes);

        // Desapilar para operar
        int negativos = pila.pop();
        int positivos = pila.pop();

        return positivos - negativos;
    }

    public static void main(String[] args) {
        System.out.println(getVoteCount(13, 0));    // ➞ 13
        System.out.println(getVoteCount(2, 33));    // ➞ -31
        System.out.println(getVoteCount(132, 132));// ➞ 0
    }
}