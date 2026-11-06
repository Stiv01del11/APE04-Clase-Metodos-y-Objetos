public class Ejercicio10 {

    // Método que recibe tres notas, calcula su promedio y retorna un double
    public double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3.0;
        return promedio;
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Main10 calculadora = new Main10();
        
        // Prueba del método con notas de ejemplo
        double resultado = calculadora.calcularPromedio(8.5, 9.0, 7.8);
        System.out.println("El promedio final es: " + resultado);
    }
}
