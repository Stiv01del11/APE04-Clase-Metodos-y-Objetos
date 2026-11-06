public class Ejercicio9 {

    // Método que recibe un valor primitivo y modifica su copia local
    public void incrementar(int n) {
        n = n + 5;
        System.out.println("Valor dentro del método (modificado): " + n);
    }

    // Método principal para ejecutar y probar el comportamiento
    public static void main(String[] args) {
        Main9 programa = new Main9();
        
        int numero = 10;
        System.out.println("Valor antes de llamar al método: " + numero);
        
        programa.incrementar(numero);
        
        // El valor original en el main no cambia debido al paso por valor
        System.out.println("Valor después de ejecutar el método: " + numero);
    }
}
