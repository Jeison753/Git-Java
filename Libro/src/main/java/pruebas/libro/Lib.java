
package pruebas.libro;


public class Lib {

   
public static void main(String[] args) {
        Libro lib = new Libro ("Cien años de muerte","Fernando Garcia", 100);
        lib.mostrarDatos();
        lib.leerPagina();
        lib.cerrarLibro();
    }
    
}
