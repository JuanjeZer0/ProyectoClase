
package hospital2;

public class TrabajadorHospital {
    private String nombre;
    private int id;
    private double sueldo;

    TrabajadorHospital(String nombre,int id,double sueldo){
        this.nombre=nombre;
        this.id=id;
        this.sueldo=sueldo;
    }
    public void setnomre(String nombre){this.nombre=nombre;}
    public String getnombre(){return nombre;}
    
    public void setid(int id){this.id=id;}
    public int getid(){return id;}
    
    public void setsueldo(double sueldo){this.sueldo=sueldo;}
    public double getsueldo(){return sueldo;}
    
    
    
}
