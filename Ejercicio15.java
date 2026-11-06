public class Ejercicio15 {

    // Definición de la clase Rectangulo con atributos y métodos solicitados
    public static class Rectangulo {
        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        // Método para calcular el área (retorna double)
        public double calcularArea() {
            return base * altura;
        }

        // Método para calcular el perímetro (retorna double)
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }

        // Método para verificar si es un cuadrado (retorna boolean)
        public boolean esCuadrado() {
            return base == altura;
        }

        // Método para obtener la descripción textual (retorna String)
        public String obtenerDescripcion() {
            return "Rectángulo de " + base + " x " + altura;
        }

        // Método para mostrar todos los resultados (retorna void)
        public void mostrar() {
            System.out.println("--- " + obtenerDescripcion() + " ---");
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
            System.out.println("¿Es cuadrado?: " + esCuadrado());
        }
    }

    // Método principal para probar la clase Rectangulo
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        Rectangulo r2 = new Rectangulo(5.0, 5.0);

        r1.mostrar();
        System.out.println();
        r2.mostrar();
    }
}
