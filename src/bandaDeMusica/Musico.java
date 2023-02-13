
package bandaDeMusica;

public class Musico {
    /*De cada músico o componente del grupo habrá que gestionar su nombre, dni
    , sueldo, instrumento que toca y si tiene disponibilidad entre semana.*/
    
    private String nombre;
    private String dni;
    private double sueldo;
    enum instrumento{GUITARRA,BAJO,BATERIA,PIANO,MICROFONO,ARMONICA};
    private instrumento instrumento;
    private boolean disponibilidad;
    
    
    Musico(){}
    
    Musico(String nombre,String dni,double sueldo,instrumento instrumento,boolean disponibilidad){
        this.nombre=nombre;
        this.dni=dni;
        this.sueldo=sueldo;
        this.instrumento=instrumento;
        this.disponibilidad=disponibilidad;
    }
    
    public void setnombre(){this.nombre=nombre;}
    public String getnombre(){return nombre;}
    
    public void setdni(){this.dni=dni;}
    public String getdni(){return dni;}
    
    public void setsueldo(){this.sueldo=sueldo;}
    public double sueldo(){return sueldo;}
    
    public void setinstrumento(){this.instrumento=instrumento;}
    public instrumento getinstrumento(){return instrumento;}
    
    public void setdisponibilidad(){this.disponibilidad=disponibilidad;}
    public boolean getdisponibilidad(){return disponibilidad;}
    
    
    
    
    
}
