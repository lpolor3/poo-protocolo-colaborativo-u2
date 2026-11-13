package taller8;

public class HijoPrivado extends PadrePrivado {
    public void intentarAcceso() {
        /*
         * 2. ERROR DE COMPILACIÓN POR ACCESO A PRIVADOS:
         * Si intentas descomentar la línea de abajo, Java arrojará:
         * "secreto has private access in PadrePrivado"
         * Los atributos privados están encapsulados y las subclases no pueden verlos directamente.
         */
        // System.out.println(secreto);

        System.out.println("Error explicado: No se puede acceder a 'secreto' directamente porque es private.");
    }
}
