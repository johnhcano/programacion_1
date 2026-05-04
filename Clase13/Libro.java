package Clase13;

public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private int paginas;

    //Constructor de la clase
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }

}
