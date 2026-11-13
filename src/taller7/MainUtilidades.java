package taller7;

public class MainUtilidades {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMOSTRACIÓN - TALLER 7 (UTILIDADES)  ");
        System.out.println("==========================================");

        Utilidades utils = new Utilidades();
        double num1 = 20.0;
        double num2 = 4.0;

        // 2. Acceder a los métodos públicos y validar su funcionamiento
        System.out.println("Número 1: " + num1 + " | Número 2: " + num2);
        System.out.println("Suma: " + utils.sumar(num1, num2));
        System.out.println("Resta: " + utils.restar(num1, num2));
        System.out.println("Multiplicación: " + utils.multiplicar(num1, num2));
        System.out.println("División: " + utils.dividir(num1, num2));

        // Probando validación de división por cero
        System.out.println("\nIntentando dividir entre cero:");
        utils.dividir(num1, 0.0);
    }
}
