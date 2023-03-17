
package Examen71;
enum rango{ALVIA,RENFE,TANGO}
public class Pilotos extends Personal{
    
    private double sueldo;
    private boolean internacionales;
    private rango rango;
    
    Pilotos(String nombre,String dni,String apellidos,String mail,double sueldo,boolean internacionales,rango rango){
        super(nombre,dni,apellidos,mail);
        this.internacionales=internacionales;
        this.rango=rango;
        this.sueldo=sueldo;
    }
    
    
    //set

    public void setRango(rango rango) {
        this.rango = rango;
    }

    public void setInternacionales(boolean internacionales) {
        this.internacionales = internacionales;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos);
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni); 
    }
    
    //get

    public double getSueldo() {
        return sueldo;
    }

    public rango getRango() {
        return rango;
    }
    
    public boolean getInternacionales(){
        return internacionales;
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }

    @Override
    public String getMail() {
        return super.getMail();
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getApellidos() {
        return super.getApellidos(); 
    }
            
    
    
    
}
