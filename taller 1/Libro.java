public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Precio: $" + precio;
    }

     // Método para actualizar el precio
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Método para obtener el precio
    public double getPrecio() {
        return precio;
    }
}

