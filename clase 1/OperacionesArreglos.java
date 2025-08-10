import java.util.*;



public class OperacionesArreglos {

    //metodo para llenar un arreglo de enteros
    public int[] llenarArregloEnteros(int tam){

        Random rand =new Random();

        int [] numeros = new int [tam];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] =rand.nextInt(100 - 1) + 1; //numeros del 1 al 100

        }

        return numeros;
    }

    //sumar los elementos de un arreglo de enteros

    public int sumarElementos(int[] arreglo){
        int suma = 0;
        for (int num: arreglo ) {
            suma+= num;

        }
        return suma;
    }

    //obtener el promedio de un arreglo de enteros

    public double promedioElemnetos(int[] arreglo) {
        if(arreglo.length == 0) {
            return 0;
        }
        return (double) sumarElementos(arreglo) / arreglo.length;
    }
    //obtener los numeros repetidos de un arreglo de enteros

    public Set<Integer> obtenerRepetidos (int[] arreglo){
        Set<Integer> vistos = new HashSet <>();
        Set<Integer> repetidos =new HashSet <>();

        for (int num : arreglo) {
            if (!vistos.add (num)){
                repetidos.add(num);
            }
        }
        return repetidos;
    }

    //obtener el mayor y el menor de un arreglo de enteros

}