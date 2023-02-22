
package hospital1;

public class Trabajador {
    //trabajador tiene un nombre, un número de identificación y un sueldo
    
    private String nombre;
    private int id;
    private double sueldo;

    Trabajador(String nombre,int id,double sueldo){
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
    
    @Override
   public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(nombre).append(", ");
    sb.append("Id: ").append(id).append(", ");
    sb.append("Sueldo: ").append(sueldo);
    return sb.toString();
}

}

    

