public class Ejercicio14 {

    // Definición de la clase Autor
    public static class Autor {
        String nombre;
        String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }

    // Definición de la clase Libro que contiene un objeto Autor como atributo
    public static class Libro {
        String titulo;
        int anio;
        Autor autor; // Objeto como atributo

        public Libro(String titulo, int anio, Autor autor) {
            this.titulo = titulo;
            this.anio = anio;
            this.autor = autor;
        }

        // Método para mostrar la información del libro y su autor
        public void mostrarInformacion() {
            System.out.println("Título: " + titulo + " | Año: " + anio + " | Autor: " + autor.nombre + " (" + autor.nacionalidad + ")");
        }
    }

    // Método principal para crear y probar las instancias requeridas
    public static void main(String[] args) {
        // Creación de objetos Autor
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("George Orwell", "Británica");

        // Creación de objetos Libro pasando el objeto Autor como atributo
        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("1984", 1949, autor2);

        // Invocación del método para mostrar la información
        System.out.println("=== INFORMACIÓN DE LIBROS ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
