import java.util.Arrays;

public class EjecutarEstudiante {
    public static void main(String[] args){

        // creación de los objetos
        Estudiante objEst1 = new Estudiante(909876, "juanito", "perez", "ingenieria");
        Estudiante objEst2 = new Estudiante(456098, "Anita", "cano", "ingenieria");
        Estudiante objEst3 = new Estudiante(235621, "Mercedes", "De Jesus", "ingenieria");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println("------------------------------------");

        // crear arreglo de objetos
        Estudiante[] est = new Estudiante[5];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        System.out.println(Arrays.toString(est));

        // forma 2
        est[3] = new Estudiante(506070, "byron " , "beltran", "psicologia");
        est[4] = new Estudiante(304050, "antonio " , "buitrago", "derecho");

        System.out.println(Arrays.toString(est));

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");

        for(Estudiante e: est){
            System.out.println(e);
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");

        for(int i = 0; i < est.length; i++){
            System.out.println(est[i]);
        }

        // matricular cursos (¡esto iba dentro del main!)
        objEst1.matricularCursos(909876, new String[]{"Programación", "Cálculo"});
        objEst2.matricularCursos(456098, new String[]{"Programación", "Estadística"});
        objEst3.matricularCursos(235621, new String[]{"Programación"});
        est[3].matricularCursos(506070, new String[]{"Psicología Clínica"});
        est[4].matricularCursos(304050, new String[]{"Derecho Penal", "Ética"});

        System.out.println("--------- Lista de Estudiantes ---------");
        for(Estudiante e : est){
            System.out.println(e);
        }

        System.out.println("--------- Estadísticas ---------");
        Estudiante.contarPorFacultad(est);
        Estudiante.contarPorCurso(est);
    }
}
