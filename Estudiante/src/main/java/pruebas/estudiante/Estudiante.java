

package pruebas.estudiante;


public class Estudiante {

    private String nombre;
    private String matricula;
    private double nota;

    public Estudiante(String nombre, String matricula, double nota) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
}
    
    public void aprobar(double nota) {
        if (nota >= 5) {
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has reprobado");
        }
    }
    
    public void mostrarInformacion(){
     System.out.println("nombre:" + nombre);
     System.out.println("matricula:" + matricula);
     System.out.println("nota:" + nota);
    }
}
