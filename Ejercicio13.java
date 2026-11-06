public class Ejercicio13 {

    // Definición de la clase Producto requerida
    public static class Producto {
        String nombre;
        int stock;
        double precioUnitario;

        public double calcularValorTotal() {
            return stock * precioUnitario;
        }
    }

    // Método principal con las instrucciones solicitadas
    public static void main(String[] args) {
        // a. Instanciar un objeto de la clase Producto llamado p
        Producto p = new Producto();
        
        // b. Asignarle un stock = 10 y un precioUnitario = 25.5
        p.stock = 10;
        p.precioUnitario = 25.5;
        
        // c. Llamar al método calcularValorTotal(), guardar el resultado en totalInventario e imprimir
        double totalInventario = p.calcularValorTotal();
        System.out.println("El valor total del inventario es: " + totalInventario);
    }
}
