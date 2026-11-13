package taller8;

public class MainVehiculo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 8 (HERENCIA)    ");
        System.out.println("==========================================");

        // Instanciando un objeto de la clase derivada Coche
        Coche miCoche = new Coche("Toyota", 180, 4);

        System.out.println("Información detallada del coche:");
        miCoche.mostrarInformacion();
    }
}
