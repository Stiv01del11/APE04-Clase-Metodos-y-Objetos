public class Ejercicio7 {

    // Método con tipo de retorno void que recibe parámetros y muestra el mensaje en consola
    public void mostrarBienvenida(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años. ¡Bienvenido al sistema!");
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Main7 bienvenida = new Main7();
        
        // Prueba del método con datos de ejemplo
        bienvenida.mostrarBienvenida("Carlos", 20);
    }
}
