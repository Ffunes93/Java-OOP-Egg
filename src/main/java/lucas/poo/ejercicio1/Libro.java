package lucas.poo.ejercicio1;

public class Libro {
    private String isbn;
    private String title;
    private String author;
    private int pages;

    public Libro(String isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Libro() {

    }

    public void setLibro(String isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void getLibro() {
        System.out.println(this.isbn);
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.pages);
    }
}
