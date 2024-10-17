import java.util.ArrayList;
import java.util.List;

public class interfaceDao implements libroDAO {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        for (Libro libro : libros){
            if(libro.getId() == id);
        }
        return null;
    }

    @Override
    public List<Libro> obtenerAllLibros() {
        return new ArrayList<>(libros);
    }

    @Override
    public void actualizarLibros(Libro libro) {
        Libro libro1 = obtenerLibro(libro.getId());
        if(libro1 != null){
            libro1 = libro;
        }
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }
}
