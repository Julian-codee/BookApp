import java.util.List;

    public interface libroDAO{
        void agregarLibro(Libro libro);
        Libro obtenerLibro(int id);
        List<Libro>obtenerAllLibros();
        void actualizarLibros(Libro libro);
        void eliminarLibro(int id);
    }
