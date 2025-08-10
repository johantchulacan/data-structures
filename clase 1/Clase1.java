import java.util.Arrays;
import java.util.Set;

public class Clase1 {
    public static void main(String[] args) {
        System.out.println("estructura de datos");

        //arreglos o arrays o vectores

        //declaracion del arreglo. forma 1
        //int[] numeros;
        //numeros = new int [5];

        //declaracion del arreglo .forma 2
        //int [] numeros =new int [5]

        //Declaración e inicialización
        //int[] numeros = {10, 20, 30, 40, 50};

        OperacionesArreglos objArreglo = new OperacionesArreglos();

        int[] numeros = objArreglo.llenarArregloEnteros(5);
        System.out.println(Arrays.toString(numeros));

        int suma =objArreglo.sumarElementos(numeros);
        double promedio = objArreglo.promedioElemnetos(numeros);
        Set<Integer>repetidos =objArreglo.obtenerRepetidos(numeros);
        int[] mayorYMenor = objArreglo.obtenerMayorYMenor(numeros);

        System.out.println("suma de elementos: " + suma );
        System.out.println("promedio: " + promedio);
        System.out.println("numeros repetidos: " + repetidos);
        System.out.println("Mayor: " + mayorYMenor[0]);
        System.out.println("Menor: " + mayorYMenor[1]);


    }
}