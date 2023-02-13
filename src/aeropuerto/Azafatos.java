
package aeropuerto;

import java.util.List;

public class Azafatos extends Trabajadores{
    
    private double sueldo;
    private List<String> idiomas;
    
    Azafatos(double sueldo){this.sueldo=sueldo;}
    
    public void setsueldo(){this.sueldo=sueldo;}
    public double getsueldo(){return sueldo;}

    public void setidiomas(){this.idiomas=idiomas;}
    public List getidiomas(){return idiomas;}



}
