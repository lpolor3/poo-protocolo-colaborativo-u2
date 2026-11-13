package taller8;

public class MainUsoIncorrecto {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 8 (USO INCORRECTO)");
        System.out.println("==========================================");

        HerenciaMultipleInvalida.mostrarError();

        System.out.println("\n--- Probando restricciones de atributos privados ---");
        HijoPrivado hijo = new HijoPrivado();
        hijo.intentarAcceso();
    }
}
