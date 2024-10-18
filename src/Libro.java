import java.util.Date;

public class Libro {
    private int id;
    private String title;
    private String author;
    private Date yearPublication;

    //Constructor de la clase

    public Libro(int id, String title, String auhtor, Date yearPublication){
        this.id = id;
        this.title = title;
        this.author = auhtor;
        this.yearPublication = yearPublication;
    }

    //Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(Date yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Libro{ " +
                "id=" + id +
                ", titulo='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", Año Publicacion=" + yearPublication +
                '}';
    }
}
