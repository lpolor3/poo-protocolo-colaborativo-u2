package taller8;

// 2. Clase Estudiante que hereda de Persona usando extends
public class Estudiante extends Persona {
    private String matricula;

    // Constructor que utiliza super para inicializar atributos heredados
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    // 3. Método sobrescrito (@Override) para mostrar la información completa del estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutilizamos la lógica del padre
        System.out.println("Matrícula: " + matricula);
    }
}