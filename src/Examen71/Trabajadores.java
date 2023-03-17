
package Examen71;

public class Trabajadores extends Personal{
    
    private double sueldo;
    
    Trabajadores(String nombre,String apellidos,String dni,String mail,double sueldo){
        super(nombre,apellidos,dni,mail);
        this.sueldo=sueldo;
    }
    
    //set

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos); 
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail); 
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni); 
    }
    
    //get

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }

    @Override
    public String getApellidos() {
        return super.getApellidos(); 
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getMail() {
        return super.getMail(); 
    }
    
    
    
}
