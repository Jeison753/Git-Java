

package pruebas.hipermercado;


import java.util.ArrayList;

class Hipermercado {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private ArrayList<String> productos;

    public Hipermercado(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.productos = new ArrayList<>();
    }


    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles en " + nombre + ":");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Informacion del Hipermercado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }

   public boolean seleccionarProducto(String producto) {
        return productos.contains(producto);
    }
}
