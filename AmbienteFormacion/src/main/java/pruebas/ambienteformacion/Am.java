
package pruebas.ambienteformacion;


public class Am {

   public static void main(String[] args) {
        AmbienteFormacion Am1 = new AmbienteFormacion ("Alejandro", "De la Hoz", 19, "Maculino", 123456);
        AmbienteFormacion Am2 = new AmbienteFormacion ("Juan", "Carrillo", 18, "Maculino", 654321);
        AmbienteFormacion Am3 = new AmbienteFormacion ("Lesly", "Tatiana", 18, "Femenino", 365829);
        AmbienteFormacion Am4 = new AmbienteFormacion ("Alejandro", "Clavijo", 18, "Masculino", 567890);
        AmbienteFormacion Am5 = new AmbienteFormacion ("Abad", "Yusseff", 18, "Masculino", 102938);
        AmbienteFormacion Am6 = new AmbienteFormacion ("Brayan", "Estiven", 17, "Masculino", 592610);
        Am1.mostrarDatos();
        System.out.println();
        Am2.mostrarDatos();
        System.out.println();
        Am3.mostrarDatos();
        System.out.println();
        Am4.mostrarDatos();
        System.out.println();
        Am5.mostrarDatos();
        System.out.println();
        Am6.mostrarDatos();
   }
}
