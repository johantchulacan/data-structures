public class EjecutarLibros1 {
    public static void main(String[] args) {
        // Crear e inicializar arreglo de libros
        Libro[] biblioteca = new Libro[5];
        biblioteca[0] = new Libro("Nueve años de soledad", "Dario gomez", 45.50);
        biblioteca[1] = new Libro("El Principito", "Antoine de Saint-Exupéry", 30.00);
        biblioteca[2] = new Libro("1984", "George Orwell", 40.75);
        biblioteca[3] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 50.00);
        biblioteca[4] = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 42.30);

        // Mostrar precios originales
        System.out.println("Precios originales:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }

        // 🔹 Actualizar el precio del libro "1984"
        for (Libro libro : biblioteca) {
            if (libro.toString().contains("1984")) { // Buscar libro por título
                libro.setPrecio(45.00); // Nuevo precio
                break;
            }
        }

        // Mostrar precios actualizados
        System.out.println("\nPrecios actualizados:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}
