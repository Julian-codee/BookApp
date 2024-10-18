import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class interfaceDao implements libroDAO {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        for (Libro libro : libros){
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerAllLibros() {
        return libros;
    }

    @Override
    public void actualizarLibros(Libro libro) {
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getId() == libro.getId()){
                System.out.println("Libro Actualizado: " + libro);
                return;
            }
        }
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
        System.out.println("Libro eliminado con ID: " + id);
    }
}
