public class Ejercicio12{

    // Clase Producto con los espacios rellenados correctamente
    public static class Producto {
        String nombre;
        int stock;
        double precioUnitario;

        public double calcularValorTotal() {
            return stock * precioUnitario;
        }
    }

    // Método principal para ejecutar y probar el código
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Teclado Mecánico";
        producto1.stock = 10;
        producto1.precioUnitario = 45.99;

        double total = producto1.calcularValorTotal();
        System.out.println("El valor total del inventario es: " + total);
    }
}
