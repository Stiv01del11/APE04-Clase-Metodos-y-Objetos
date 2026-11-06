public class Ejercicio8 {

    // Método donde x e y son los parámetros definidos
    public double multiplicar(double x, double y) {
        return x * y;
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Main8 miObjeto = new Main8();
        
        // 4.0 y 5.5 son los argumentos enviados al método
        double res = miObjeto.multiplicar(4.0, 5.5);
        System.out.println("El resultado de la multiplicación es: " + res);
    }
}
