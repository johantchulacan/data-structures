import java.util.Arrays;

public class EjecutarEstudiante {
    public static void main(String[] args){

        //creacion de los objetos
        Estudiante objEst1 = new Estudiante(909876, "juanito", "perez", "ingenieria");
        Estudiante objEst2 = new Estudiante(456098, "Anita", "cano", "ingenieria");
        Estudiante objEst3 = new Estudiante(235621, "Mercedes", "De Jesus", "ingenieria");


        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println("------------------------------------");
        //crear arreglo de objetos
        //int[] a = new int [5];
        Estudiante[] est = new Estudiante[5];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        System.out.println(Arrays.toString(est));

        //forma 2

        est[3] = new Estudiante(506070, "byron " , "beltran", "psicologia");
        est[4] = new Estudiante(304050, "antonio " , "buitrago", "derecho");

        System.out.println(Arrays.toString(est));
        for(Estudiante e: est){
            System.out.println(estudiante);
        }

    }
}
