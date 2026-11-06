public class Ejercicio16 {

    // Definición de la clase Producto
    public static class Producto {
        String nombre;
        double precio;
        int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        // Método para reducir el stock si hay disponibilidad suficiente[cite: 7]
        public void reducirStock(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
            } else {
                System.out.println("Stock insuficiente.");
            }
        }

        // Método para mostrar los datos del producto
        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock disponible: " + stock);
        }
    }

    // Definición de la clase Venta que recibe un objeto Producto como parámetro[cite: 7]
    public static class Venta {
        int cantidad;

        public Venta(int cantidad) {
            this.cantidad = cantidad;
        }

        // Método aplicar que recibe Producto como parámetro, reduce stock y muestra el total[cite: 7]
        public void aplicar(Producto producto) {
            System.out.println("--- Procesando venta de " + cantidad + " unidad(es) de " + producto.nombre + " ---");
            if (cantidad <= producto.stock) {
                double totalPagar = cantidad * producto.precio;
                producto.reducirStock(cantidad);
                System.out.println("Total a pagar: $" + totalPagar);
            } else {
                System.out.println("No se pudo completar la venta.");
                producto.reducirStock(cantidad); // Esto disparará el mensaje de stock insuficiente
            }
            producto.mostrarProducto();
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Producto prod = new Producto("Laptop Gamer", 1200.0, 10);
        prod.mostrarProducto();
        System.out.println();

        Venta venta1 = new Venta(3);
        venta1.aplicar(prod);

        Venta venta2 = new Venta(15); // Prueba de stock insuficiente
        venta2.aplicar(prod);
    }
}
