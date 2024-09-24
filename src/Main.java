import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<LibroDigital> listLibrosDigitales = new ArrayList<>();
        List<LibroImpreso> listLibrosImpresos = new ArrayList<>();
        //Libros impresos
        LibroImpreso li1 = new LibroImpreso();
        System.out.println("""
                Libro:
                Ingrese los datos del libro: """);
        System.out.println("Titulo: ");
        li1.setTitulo(teclado.nextLine());
        System.out.println("Autor: ");
        li1.setAutor(teclado.nextLine());
        System.out.println("Precio: ");
        li1.setPrecio(teclado.nextDouble());
        teclado.nextLine();
        System.out.println("Peso: ");
        li1.setPeso(teclado.nextDouble());
        teclado.nextLine();
        listLibrosImpresos.add(li1);
        LibroImpreso li2 = new LibroImpreso("El infierno de Dante","Dante Aligueri",25000,1.05);
        LibroImpreso li3 = new LibroImpreso("La familia Maldita","Carolina Arango",90000,2);
        LibroImpreso li4 = new LibroImpreso("Los Monstruos en Colombia Si Existen","Esteban Cruz Niño",50000,1.8);
        LibroImpreso li5 = new LibroImpreso("Lady Masacre","Mario Mendoza",60000,2.4);
        listLibrosImpresos.add(li2);
        listLibrosImpresos.add(li3);
        listLibrosImpresos.add(li4);
        listLibrosImpresos.add(li5);
        System.out.println("Libro Impresos: ");
        System.out.println(listLibrosImpresos.toString());

        //Libros digitales
        LibroDigital ld1 = new LibroDigital();
        System.out.println("""
                Libro:
                Ingrese los datos del libro: """);
        System.out.println("Titulo: ");
        ld1.setTitulo(teclado.nextLine());
        System.out.println("Autor: ");
        ld1.setAutor(teclado.nextLine());
        System.out.println("Precio: ");
        ld1.setPrecio(teclado.nextDouble());
        teclado.nextLine();
        System.out.println("Peso: ");
        ld1.setTamanio(teclado.nextDouble());
        teclado.nextLine();
        listLibrosDigitales.add(ld1);
        LibroDigital ld2 = new LibroDigital("El tunel","Ernesto Sabato",180000,0.4);
        LibroDigital ld3 = new LibroDigital();
        LibroDigital ld4 = new LibroDigital();
        LibroDigital ld5 = new LibroDigital();
        listLibrosDigitales.add(ld2);
        listLibrosDigitales.add(ld3);
        listLibrosDigitales.add(ld4);
        listLibrosDigitales.add(ld5);


    }
}
