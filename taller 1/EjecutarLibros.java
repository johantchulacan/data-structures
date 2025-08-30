public class EjecutarLibros {
    public static void main(String[] args) {
        // Crear arreglo de 5 libros
        Libro[] biblioteca = new Libro[5];

        // Inicializar los libros
        biblioteca[0] = new Libro("Nueve Años de Soledad", "Dario gomez", 45.50);
        biblioteca[1] = new Libro("El Principito", "Antoine de Saint-Exupéry", 30.00);
        biblioteca[2] = new Libro("1984", "George Orwell", 40.75);
        biblioteca[3] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 50.00);
        biblioteca[4] = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 42.30);

        // Calcular precio total
        double totalPrecio = 0;

        // Recorrer el arreglo e imprimir cada libro usando toString()
        for (Libro libro : biblioteca) {
            System.out.println(libro); 
            totalPrecio += libro.getPrecio();
        }

        System.out.println("\nPrecio total de todos los libros: $" + totalPrecio);
    }
}