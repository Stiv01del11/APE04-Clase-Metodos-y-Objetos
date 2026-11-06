public class Ejercicio18 {

    // Definición de la clase Usuario
    public static class Usuario {
        String nombre;
        String cedula;

        public Usuario(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }

        public void mostrarUsuario() {
            System.out.println("Usuario: " + nombre + " (Cédula: " + cedula + ")");
        }
    }

    // Definición de la clase Libro con estado de disponibilidad
    public static class Libro {
        String titulo;
        boolean disponible;

        public Libro(String titulo, boolean disponible) {
            this.titulo = titulo;
            this.disponible = disponible;
        }

        // Método para intentar prestar el libro
        public boolean prestar() {
            if (disponible) {
                disponible = false;
                return true;
            }
            return false;
        }

        // Método para devolver el libro
        public void devolver() {
            disponible = true;
        }

        public void mostrarLibro() {
            System.out.println("Libro: " + titulo + " | Disponible: " + (disponible ? "Sí" : "No"));
        }
    }

    // Definición de la clase Prestamo que colabora con Usuario y Libro
    public static class Prestamo {
        Usuario usuario;
        Libro libro;

        public Prestamo(Usuario usuario, Libro libro) {
            this.usuario = usuario;
            this.libro = libro;
        }

        // Método registrar que intenta prestar el libro y muestra mensajes según el resultado
        public void registrar() {
            System.out.println("--- Intentando registrar préstamo ---");
            usuario.mostrarUsuario();
            System.out.println("Solicitando el libro: " + libro.titulo);
            
            boolean exito = libro.prestar();
            if (exito) {
                System.out.println("¡Préstamo registrado exitosamente a nombre de " + usuario.nombre + "!");
            } else {
                System.out.println("Préstamo denegado: El libro \"" + libro.titulo + "\" ya no se encuentra disponible.");
            }
            System.out.println();
        }
    }

    // Método principal para probar el sistema de biblioteca con dos usuarios pidiendo el mismo libro
    public static void main(String[] args) {
        // Crear un libro disponible
        Libro libro1 = new Libro("Algoritmos y Estructuras de Datos", true);
        
        // Crear dos usuarios
        Usuario user1 = new Usuario("Carlos Pérez", "1805938210");
        Usuario user2 = new Usuario("Ana Gómez", "1804129384");

        libro1.mostrarLibro();
        System.out.println();

        // Primer usuario intenta pedir el libro (Préstamo exitoso)
        Prestamo prestamo1 = new Prestamo(user1, libro1);
        prestamo1.registrar();

        // Segundo usuario intenta pedir el mismo libro (Debe fallar)
        Prestamo prestamo2 = new Prestamo(user2, libro1);
        prestamo2.registrar();
        
        // Estado final del libro
        libro1.mostrarLibro();
    }
}
