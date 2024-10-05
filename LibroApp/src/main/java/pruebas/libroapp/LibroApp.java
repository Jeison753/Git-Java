

package pruebas.libroapp;


public class LibroApp {

    public static void main(String[] args) {
        // Crear un objeto Libro usando el constructor
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        
        // Mostrar información del libro
        libro1.mostrarInfo();
        
        // Cambiar el título del libro usando el setter
        libro1.setTitulo("Cien años de soledad (Edición especial)");
        
        // Mostrar la información actualizada
        System.out.println("\nInformación actualizada:");
        libro1.mostrarInfo();
        
        // Cambiar el autor y el año de publicación usando los setters
        libro1.setAutor("Gabo");
        libro1.setAnioPublicacion(1970);
        
        // Mostrar la información final
        System.out.println("\nInformación final:");
        libro1.mostrarInfo();
    }
}

// Clase Libro
class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getter para el título
    public String getTitulo() {
        return titulo;
    }

    // Setter para el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para el autor
    public String getAutor() {
        return autor;
    }

    // Setter para el autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter para el año de publicación
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter para el año de publicación
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}

