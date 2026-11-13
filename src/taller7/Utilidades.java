package taller7;

public class Utilidades {

    // 1. Método público para sumar
    public double sumar(double a, double b) {
        return a + b;
    }

    // 1. Método público para restar
    public double restar(double a, double b) {
        return a - b;
    }

    // 1. Método público para multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // 1. Método público para dividir con validación de división por cero
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0.0;
        }
    }
}
