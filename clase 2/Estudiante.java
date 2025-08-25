import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    //atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    private String facultad;
    private List<String> cursos;

    //constructor de la clase
    public Estudiante(int id, String nombre, String apellido, String facultad){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();

    }


    public int getId() { return id; }
    public String getFacultad() { return facultad; }
    public List<String> getCursos() { return cursos; }

    // implementar el método +matricularCursos(id:int, cursos[]:String):void
    public void matricularCursos(int id, String[] cursos){
        if (this.id != id){
            System.out.println("El id " + id + " no corresponde a este estudiante (" + this.id + ").");
            return;
        }
        for (String c : cursos) {
            this.cursos.add(c);
        }
        System.out.println("Estudiante " + this.id + " matriculó: " + this.cursos);
    }


    //implementar un método que permita saber cuántos estudiantes hay en cada facultad

    public static void contarPorFacultad(Estudiante[] estudiantes){
        java.util.Map<String, Integer> conteo = new java.util.HashMap<>();
        for(Estudiante e : estudiantes){
            if(e != null){
                conteo.put(e.getFacultad(), conteo.getOrDefault(e.getFacultad(), 0) + 1);
            }
        }
        System.out.println("Cantidad de estudiantes por facultad: " + conteo);
    }

    //implementar un método que permita saber cuantos estudiantes hay en cada curso.

    public static void contarPorCurso(Estudiante[] estudiantes){
        java.util.Map<String, Integer> conteo = new java.util.HashMap<>();
        for(Estudiante e : estudiantes){
            if(e != null){
                for(String c : e.getCursos()){
                    conteo.put(c, conteo.getOrDefault(c, 0) + 1);
                }
            }
        }
        System.out.println("Cantidad de estudiantes por curso: " + conteo);
    }

    
    public String toString(){
    return "Estudiante { " +
           "id=" + id +
           ", nombre='" + nombre + '\'' +
           ", apellido='" + apellido + '\'' +
           ", facultad='" + facultad + '\'' +
           ", cursos=" + cursos +
           " }";

    }


    
}
