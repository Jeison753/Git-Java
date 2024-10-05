
package pruebas.persona;


public class Per {

    
    public static void main(String[] args) {
         Persona persona = new Persona ("Pablo",18,"Masculino");
         System.out.println("nombre:" + persona.getnombre());
         System.out.println("edad:" + persona.getedad());
         System.out.println("genero:" + persona.getgenero());
    }
    
}
