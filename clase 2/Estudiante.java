

public class Estudiante {
    //atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    private String facultad;

    //constructor de la clase
    public Estudiante(int id, String nombre, String apellido, String facultad){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;

    }


    public int getId() {
        return id;
    }

    public void matricularCursos(int id, String[] cursos){
        String cad = "";
        for(int i = 0; i < cursos.length; i++){
            cad += cursos[i] + " ";
        } 
        System.out.println("id:" + id + "Cursos matriculados: " + cad);
    }

    public String toString(){
        return "Estudiante { id: " + id + " Nombre: " + nombre + " Apellido: " + apellido + " Facultad: " + facultad + " }";
    }
}
