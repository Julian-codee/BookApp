import java.util.Date;

public class Main {
    public static void main(String[] args) {

        interfaceDao libroDAO = new interfaceDao();

        // Agregar libros

        libroDAO.agregarLibro(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", new Date(2003)));
        libroDAO.agregarLibro(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", new Date(2022)));

        // Obtener libro

        Libro libro = libroDAO.obtenerLibro(2);
        System.out.println("Libro encontrado: " + libro);

        // Listar todos los libros

        System.out.println("Todos los libros:");
        for (Libro l : libroDAO.obtenerAllLibros()) {
            System.out.println(l);
        }

        // Actualizar libro

        libroDAO.actualizarLibros(new Libro(1901, "Cien años de soledad", "Gabriel García Márquez", new Date(1990)));
        System.out.println("Libro actualizado: " + libroDAO.obtenerLibro(1));

        // Eliminar libro

        libroDAO.eliminarLibro(1);
        System.out.println("Libros encontrados después de la eliminación:");
        for (Libro l : libroDAO.obtenerAllLibros()) {
            System.out.println(l);
        }
    }
}