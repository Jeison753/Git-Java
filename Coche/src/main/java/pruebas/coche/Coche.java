package pruebas.coche;

public class Coche {

    private String marca;
    private String modelo;
    private int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void acelerar() {
     System.out.println("El coche esta acelerando");
    }
    
    public void frenar() {
     System.out.println("El coche esta frenando");
    }
    
    public void mostrarDatos(){
     System.out.println("marca:" + marca);
     System.out.println("modelo:" + modelo);
     System.out.println("año:" + año); 
    }
}
    

  

