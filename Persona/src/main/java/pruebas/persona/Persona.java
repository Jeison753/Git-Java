

package pruebas.persona;


public class Persona {
    
    public String nombre;
    public int edad;
    public String genero;
     
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    

    public int getedad() {
        return edad;
    }

 
    public void setedad(int edad) {
        this.edad = edad;
    }
    
       public String getgenero() {
        return genero;
    }

  
    public void setgenero(String genero) {
        this.genero = genero;
    }
    
}



