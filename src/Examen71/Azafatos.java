
package Examen71;

public class Azafatos extends Personal{
    
    private double sueldo;
    private listaIdiomas[] listaIdiomas;
    
    Azafatos(String nombre,String apellidos,String dni,String mail,double sueldo,listaIdiomas[] listaIdiomas){
        super(nombre,apellidos,dni,mail);
        this.listaIdiomas=listaIdiomas;
        this.sueldo=sueldo;
    }
    
    //set

    public void setListaIdiomas(listaIdiomas[] listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
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

    public listaIdiomas[] getListaIdiomas() {
        return listaIdiomas;
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
    
    
    
}
