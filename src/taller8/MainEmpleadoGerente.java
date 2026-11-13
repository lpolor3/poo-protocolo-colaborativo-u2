package taller8;

public class MainEmpleadoGerente {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 8 (EMPLEADO/GERENTE)");
        System.out.println("==========================================");

        // 4. Instanciando un objeto de Empleado y uno de Gerente
        Empleado emp = new Empleado("Ana Martínez", 2800000.0);
        Gerente ger = new Gerente("Carlos Gómez", 5500000.0, "Tecnología e Innovación");

        System.out.println("--- Detalles del Empleado ---");
        emp.mostrarDetalles();

        System.out.println("\n--- Detalles del Gerente ---");
        ger.mostrarDetalles();
    }
}
