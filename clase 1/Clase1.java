import java.util.Arrays;

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




    }
}