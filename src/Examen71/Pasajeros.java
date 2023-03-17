
package Examen71;

public class Pasajeros extends Personal{
    
    private int numeroDNI;
    
    Pasajeros(String nombre,String apellidos,String dni,String mail,int numeroDNI){
        super(nombre,apellidos,dni,mail);
        this.numeroDNI=numeroDNI;
    }
    
    //set

    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
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
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail); 
    }
    
    //get

    public int getNumeroDNI() {
        return numeroDNI;
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
    public String getApellidos() {
        return super.getApellidos(); 
    }

    @Override
    public String getDni() {
        return super.getDni(); 
    }
    
    
    //toString
    @Override
    public String toString(){
        return "El nombre del pasajero es: "+super.getNombre()+" ,con DNI: "+super.getDni()+" ,con apellidos "+super.getApellidos()+" y mail: "+super.getMail();
    }
    
    //equals
   @Override
    public boolean equals(Object otro){
        boolean res = false;
        
        Pasajeros otro=(Pasajeros)otro;
        
        if(this.getNombre()==otro.getNombre() && this.numeroDNI==otro.getNumeroDNI() && this.getApellidos()==otro.getApellidos()){
            res = true;
        }
        return res;
    }
    
}
