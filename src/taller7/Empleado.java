package taller7;

public class Empleado {
    // 1. La propiedad nombre debe ser pública según el enunciado
    public String nombre;

    // Propiedad salario encapsulada (buena práctica de POO)
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Usamos el set para aplicar la validación inicial
    }

    // 2. Método get público para salario
    public double getSalario() {
        return salario;
    }

    // 2. Método set público con validaciones
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo. Se asignará 0.0 por defecto.");
            this.salario = 0.0;
        }
    }
}