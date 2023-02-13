
package bbiblioteca;

public class TestBiblioteca {

    private static Bibliotecario biblioteca;
  public static void main(String[] args) {
    Biblioteca bibliotecario = new Bibliotecario("Nombre Bibliotecario", "12345678A", 2000, false);
    Libro libro = new Libro("0000", "Poeta en NY", "Poesía", 15, biblioteca);
    
    System.out.println("El código ISBN del libro " + libro.titulo + " es 0000: " + libro.ISBN);
  }
}

