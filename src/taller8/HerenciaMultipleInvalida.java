package taller8;

/*
 * 1. ERROR DE COMPILACIÓN POR HERENCIA MÚLTIPLE:
 * Si intentas descomentar la siguiente línea, Java arrojará un error de compilación:
 * "syntax error on token ',', '{' expected"
 * Java NO permite heredar de múltiples clases al mismo tiempo con extends.
 */
// public class HerenciaMultipleInvalida extends ClaseA, ClaseB {
public class HerenciaMultipleInvalida {
    public static void mostrarError() {
        System.out.println("Java no permite herencia múltiple de clases (extends ClaseA, ClaseB genera error).");
    }
}