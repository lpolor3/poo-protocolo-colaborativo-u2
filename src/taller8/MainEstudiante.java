package taller8;

public class MainEstudiante {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 8 (ESTUDIANTE)  ");
        System.out.println("==========================================");

        // Instanciando un objeto de la clase Estudiante
        Estudiante est = new Estudiante("Luis Pérez", 20, "2026-ING01");

        System.out.println("Datos del estudiante:");
        est.mostrarInformacion();
    }
}