package taller7;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 7 (CUENTA BANCARIA)");
        System.out.println("==========================================");

        CuentaBancaria miCuenta = new CuentaBancaria("987654321", 2500000.0, "Corriente");

        // Acceso permitido: 'tipoCuenta' es pública
        System.out.println("Acceso directo a tipoCuenta (público): " + miCuenta.tipoCuenta);

        // Uso de métodos get y set públicos para el saldo
        System.out.println("Saldo inicial obtenido con get: $" + miCuenta.getSaldo());

        miCuenta.setSaldo(3100000.0);
        System.out.println("Saldo actualizado con set: $" + miCuenta.getSaldo());

        // Mostrar detalles completos mediante el método público
        System.out.println("\n--- Detalles de la Cuenta ---");
        miCuenta.mostrarDetalles();

        /*
         * 3. OBSERVACIÓN DE ERROR DE COMPILACIÓN:
         * Si intentas descomentar la siguiente línea, Java arrojará un error de compilación
         * porque 'numeroCuenta' es private y no se puede acceder directamente desde fuera de su clase:
         *
         * System.out.println(miCuenta.numeroCuenta); // Error: numeroCuenta has private access
         */
        System.out.println("\n[Nota]: Intentar acceder a miCuenta.numeroCuenta directamente genera error de compilación por seguridad (private).");
    }
}