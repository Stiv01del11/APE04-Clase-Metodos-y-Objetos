public class Ejercicio11 {

    // Método que valida si la edad se encuentra dentro de un rango lógico permitido
    public boolean verificarEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return false;
        } else {
            return true;
        }
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Main11 validador = new Main11();
        
        // Prueba con una edad inválida
        boolean resultado1 = validador.verificarEdad(130);
        System.out.println("¿La edad es válida?: " + resultado1);
        
        System.out.println("-------------------");
        
        // Prueba con una edad válida
        boolean resultado2 = validador.verificarEdad(20);
        System.out.println("¿La edad es válida?: " + resultado2);
    }
}
