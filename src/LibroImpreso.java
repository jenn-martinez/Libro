public class LibroImpreso extends Libro{
    private double peso;

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, double precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Libro" +
                "\nTitulo: " + titulo + '\'' +
                "\nAutor: " + autor + '\'' +
                "\nPrecio:" + precio +
                "\nPeso: " + peso + "\n"
                ;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Precio : $" + precio + " Peso: " + peso);
    }
}
