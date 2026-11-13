package taller8;

// 2. Clase Coche que hereda de Vehiculo usando extends
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor que utiliza super para inicializar los atributos heredados
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    // 3. Método para mostrar la información específica del coche (incluyendo la heredada)
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutilizamos el método de la clase padre
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}
