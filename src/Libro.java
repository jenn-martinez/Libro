public class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro" +
                "Titulo: " + titulo + '\'' +
                "Autor: " + autor + '\'' +
                "Precio:" + precio +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Precio : $" + precio);
    }
}
