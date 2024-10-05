
package pruebas.turismo;


import java.util.ArrayList;


class Turismo {
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private ArrayList<String> tours;

    public Turismo(String nombre, String direccion, int telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tours = new ArrayList<>();
    }

    public void agregarTour(String tour) {
        tours.add(tour);
    }

    public void mostrarTours() {
        System.out.println("Tours disponibles en " + nombre + ":");
        for (String tour : tours) {
            System.out.println("- " + tour);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Informacion de la Empresa:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }
    public boolean seleccionarTour(String tour) {
        return tours.contains(tour);
    }
}


