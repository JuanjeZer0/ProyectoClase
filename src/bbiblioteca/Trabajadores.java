
package bbiblioteca;

public class Trabajadores {
  String nombre;
  private double sueldo;
  private String DNI;
  private boolean trabajaFindes;
  
  Trabajadores (String nombre, String DNI, double sueldo, boolean trabajaFindes) {
    this.trabajaFindes = trabajaFindes;
    this.DNI=DNI;
    this.sueldo=sueldo;
    this.trabajaFindes=trabajaFindes;
    
  }
}
