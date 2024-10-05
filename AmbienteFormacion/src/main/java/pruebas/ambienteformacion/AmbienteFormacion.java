

package pruebas.ambienteformacion;


public class AmbienteFormacion {

   private String nombre;
   private String apellido;
   private int edad;
   private String genero;
   private int documento;
     
    public AmbienteFormacion(String nombre, String apellido, int edad, String genero, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
    }
    
    public void mostrarDatos(){
     System.out.println("nombre:" + nombre);
     System.out.println("apellido:" + apellido);
     System.out.println("edad:" + edad);
     System.out.println("genero:" + genero);
     System.out.println("documento:" + documento);
    }
}
