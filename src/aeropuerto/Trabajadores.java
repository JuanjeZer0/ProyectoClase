
package aeropuerto;

public class Trabajadores extends Persona {
    
    private double sueldo;
    
    Trabajadores(String nombre, String apellidos, String dni, String email, double sueldo) {
    super(nombre, apellidos, dni, email);
    this.sueldo = sueldo;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }
}


