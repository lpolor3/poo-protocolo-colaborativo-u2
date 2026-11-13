package taller8;

public class Vehiculo {
    // 1. Atributos de la clase base
    protected String marca;
    protected int velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // 3. Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
