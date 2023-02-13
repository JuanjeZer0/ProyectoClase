
package bbiblioteca;

public class Limpiador {
  int diasTrabajo;
    private final double sueldo;
    private final String DNI;
    private final String nombre;
  
  Limpiador(String nombre, String DNI, double sueldo, int diasTrabajo) {
   
    this.nombre=nombre;
    this.DNI=DNI;
    this.sueldo=sueldo;
    this.diasTrabajo = diasTrabajo;
    
  }
}


