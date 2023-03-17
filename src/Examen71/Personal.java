
package Examen71;

public class Personal {
    
    private String nombre;
    private String dni;
    private String apellidos;
    private String mail;
    
    Personal(String nombre,String mail,String dni,String apellidos){
        this.apellidos=apellidos;
        this.dni=dni;
        this.mail=mail;
        this.nombre=nombre;
        
    }
    
    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //get

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMail() {
        return mail;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    
    
    
}
