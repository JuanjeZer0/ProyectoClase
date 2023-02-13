
package empresaMensajeria;

public class EmpresaMensajeria {
    /*
    Nombre
Lista de paquetes
Lista de repartidores
    */
    
    private String nombre;
    private String listaPaquetes;
    private String listaRepartidores;
    
    EmpresaMensajeria(String nombre,String listaPaquetes,String listaEntregados){
        this.nombre=nombre;
        this.listaPaquetes=listaPaquetes;
        this.listaRepartidores=listaRepartidores;
        
    }
    
    public String getnombre(){return nombre;}
    
    public void setnombre(){this.nombre=nombre;}
    
    public String getlistaPaquetes(){return listaPaquetes;}
    
    public void setlistaPaquetes(){this.listaPaquetes=listaPaquetes;}
    
    public String getlistaRepartidores(){return listaRepartidores;}
    
    public void setlistaRepartidores(){this.listaRepartidores=listaRepartidores;}
    
    //métodos
    
    
    
    
    
    
}
