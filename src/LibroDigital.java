public class LibroDigital extends Libro{
    private double tamanio;

    public LibroDigital() {
    }

    public LibroDigital(String titulo, String autor, double precio, double tamanio) {
        super(titulo, autor, precio);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Libro" +
                "\nTitulo: " + titulo + '\'' +
                "\nAutor: " + autor + '\'' +
                "\nPrecio:" + precio +"LibroDigital{" +
                "\nTamanio: " + tamanio + "\n";
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Precio : $" + precio + " Tamanio de archivo: " + tamanio);
    }
}
