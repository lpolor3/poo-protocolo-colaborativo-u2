package taller7;

public class CuentaBancaria {
    // Propiedades privadas y públicas solicitadas
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta; // Propiedad pública

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo); // Validación mediante el método set
        this.tipoCuenta = tipoCuenta;
    }

    // 1. Métodos públicos get y set para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
            this.saldo = 0.0;
        }
    }

    // 2. Método público para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: [Protegida internamente]");
        System.out.println("Tipo de Cuenta (Público): " + tipoCuenta);
        System.out.println("Saldo Actual: $" + saldo);
    }
}