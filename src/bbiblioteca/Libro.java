
package bbiblioteca;

public class Libro {
  String ISBN;
  String titulo;
  String tematica;
  double precio;
  Biblioteca bibliotecario;
  
  Libro(String ISBN, String titulo, String tematica, double precio, Bibliotecario bibliotecario) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.tematica = tematica;
    this.precio = precio;
    this.bibliotecario = bibliotecario;
  }
}

