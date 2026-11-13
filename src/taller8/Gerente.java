package taller8;

// 2. Clase Gerente que hereda de Empleado usando extends
public class Gerente extends Empleado {
    private String departamento;

    // Constructor que utiliza super para inicializar los atributos heredados
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // 3. Sobrescritura (@Override) del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutilizamos la impresión de nombre y salario
        System.out.println("Departamento: " + departamento);
    }
}