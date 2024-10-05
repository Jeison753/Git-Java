package pruebas.transportes;

interface Transporte {
    double calcularCosto(double distancia, int pasajeros);
    double calcularTiempo(double distancia);
    void mostrarInfo();
}


class Transporte_Aereo implements Transporte {
    private double velocidad = 800;
    private double costoPorKm = 0.15; 

 
    @Override
    public double calcularCosto(double distancia, int pasajeros) {
        return distancia * costoPorKm * pasajeros;
    }

    @Override
    public double calcularTiempo(double distancia) {
        return distancia / velocidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Transporte Aereo seleccionado. Velocidad promedio: " + velocidad + " km/h.");
    }
}


class Transporte_Terrestre implements Transporte {
    private double velocidad = 100;
    private double costoPorKm = 0.05; 

    @Override
    public double calcularCosto(double distancia, int pasajeros) {
        return distancia * costoPorKm * pasajeros;
    }

    @Override
    public double calcularTiempo(double distancia) {
        return distancia / velocidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Transporte Terrestre seleccionado. Velocidad promedio: " + velocidad + " km/h.");
    }
}


class Transporte_Acuatico implements Transporte {
    private double velocidad = 40; 
    private double costoPorKm = 0.10; 

    @Override
    public double calcularCosto(double distancia, int pasajeros) {
        return distancia * costoPorKm * pasajeros;
    }

    @Override
    public double calcularTiempo(double distancia) {
        return distancia / velocidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Transporte Acuatico seleccionado. Velocidad promedio: " + velocidad + " km/h.");
    }
}
