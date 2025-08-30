public class EjecutarLibrosAvanzado {

    // Método para filtrar libros por precio mayor a un valor dado
    public static Libro[] filtrarPorPrecio(Libro[] libros, double valorMinimo) {
        // Contar cuántos libros cumplen la condición
        int contador = 0;
        for (Libro libro : libros) {
            if (libro.getPrecio() > valorMinimo) {
                contador++;
            }
        }

        // Crear arreglo para los libros filtrados
        Libro[] filtrados = new Libro[contador];
        int indice = 0;
        for (Libro libro : libros) {
            if (libro.getPrecio() > valorMinimo) {
                filtrados[indice++] = libro;
            }
        }

        return filtrados;
    }

    // Método para ordenar libros por precio usando burbuja
    public static void ordenarPorPrecio(Libro[] libros) {
        int n = libros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) {
                    // Intercambiar
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear e inicializar arreglo de libros
        Libro[] biblioteca = new Libro[5];
        biblioteca[0] = new Libro("Nueve años de soledad", "Dario gomez", 45.50);
        biblioteca[1] = new Libro("El Principito", "Antoine de Saint-Exupéry", 30.00);
        biblioteca[2] = new Libro("1984", "George Orwell", 40.75);
        biblioteca[3] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 50.00);
        biblioteca[4] = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 42.30);

        // 🔹 Filtrar libros con precio mayor a 40
        System.out.println("Libros con precio mayor a 40:");
        Libro[] filtrados = filtrarPorPrecio(biblioteca, 40.0);
        for (Libro libro : filtrados) {
            System.out.println(libro);
        }

        // 🔹 Ordenar los libros por precio de menor a mayor
        ordenarPorPrecio(biblioteca);
        System.out.println("\nLibros ordenados por precio (menor a mayor):");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}
