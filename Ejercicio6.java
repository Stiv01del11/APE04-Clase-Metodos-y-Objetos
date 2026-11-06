public class Ejercicio6 {

    // Método corregido declarando tipo de retorno double y agregando sentencia return
    public double calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("El área es: " + area);
        return area;
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Main6 ejer = new Main6();
        
        // Prueba del método con datos de ejemplo
        double resultado = ejer.calcularArea(5.5, 4.0);
        System.out.println("Resultado retornado: " + resultado);
    }
}
