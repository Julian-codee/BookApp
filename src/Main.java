import java.util.Date;

public class Main {
    public static void main(String[] args) {

        interfaceDao libroDAO = new interfaceDao();

        // Agregar libros

        libroDAO.agregarLibro(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", new Date(2003)));
        libroDAO.agregarLibro(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", new Date(2022)));
        libroDAO.agregarLibro(new Libro(3, "La granja del borrego", "Carlos Alberto", new Date(1933)));
        libroDAO.agregarLibro(new Libro(4, "Psicologia Oscura", "Stafen", new Date(2021)));

        // Listar todos los libros

        System.out.println("\nTodos los libros: \n");
        for (Libro l : libroDAO.obtenerAllLibros()) {
            System.out.println(l);
        }


        // Obtener libro

        Libro libro = libroDAO.obtenerLibro(2);
        System.out.println("\nLibro encontrado: " + libro);

        // Actualizar libro

        libroDAO.actualizarLibros(new Libro(1, "El principito", "Gabriel", new Date(1990)));

        // Eliminar libro

        libroDAO.eliminarLibro(1);
        System.out.println("Libros encontrados después de la eliminación:");
        for (Libro l : libroDAO.obtenerAllLibros()) {
            System.out.println(l);
        }
    }
}