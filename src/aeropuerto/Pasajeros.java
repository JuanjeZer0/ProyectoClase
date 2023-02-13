
package aeropuerto;

public class Pasajeros {
    
    private double numeroPasaporte;
    
    Pasajeros(String nombre, String apellidos, String dni, String email,double numeroPasaporte){
    super(nombre, apellidos, dni, email);
    this.numeroPasaporte=numeroPasaporte;
    }
    
    public void setnumeroPasaporte(){this.numeroPasaporte=numeroPasaporte;}
    public double getnumeropasaporte(){return numeroPasaporte;}
    
}
