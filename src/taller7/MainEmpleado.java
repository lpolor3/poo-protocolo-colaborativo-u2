package taller7;

public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 7 (EMPLEADO)     ");
        System.out.println("==========================================");

        // 3. Crear objetos de la clase Empleado e interactuar con las propiedades
        Empleado emp1 = new Empleado("Carlos Pérez", 2500000.0);

        // Acceso directo a la propiedad pública 'nombre'
        System.out.println("Empleado 1 - Nombre (público): " + emp1.nombre);
        // Acceso a través del método get público para 'salario'
        System.out.println("Empleado 1 - Salario inicial: $" + emp1.getSalario());

        // Probando la validación del método set con un valor inválido (negativo)
        System.out.println("\nIntentando asignar un salario negativo...");
        emp1.setSalario(-500000.0);
        System.out.println("Salario después de intento inválido: $" + emp1.getSalario());

        // Asignando un salario válido
        emp1.setSalario(3200000.0);
        System.out.println("Salario actualizado correctamente: $" + emp1.getSalario());
    }
}