
package aeropuerto;

public class Pilotos extends Persona{
    private enum rango{ALPHA,TANGO,ÁGUILA}
    private rango rango;
    private double sueldo;
    private boolean vuelos;
    
    
    Pilotos(String nombre, String apellidos, String dni, String email, double sueldo, rango rango, boolean vuelos){
    super(nombre, apellidos, dni, email);
    this.sueldo=sueldo;
    this.rango = rango;
    this.vuelos = vuelos;
    }
    
    public void setsueldo(){this.sueldo=sueldo;}
    public double getsueldo(){return sueldo;}
    
    public void setrango(){this.rango=rango;}
    public rango rango(){return rango;}
    
    public void setvuelos(){this.vuelos=vuelos;}
    public boolean getvuelos(){return vuelos;}
    
}