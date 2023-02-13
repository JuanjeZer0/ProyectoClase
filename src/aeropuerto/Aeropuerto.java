
package aeropuerto;

import java.util.List;

public class Aeropuerto {

       
    private String ciudadOrigen;
    private String ciudadDestino;
    private String piloto;
    private List<String> pasajeros;
    private double duracion;
    
    
     Aeropuerto(String ciudadOrigen,String ciudadDestino,String piloto,List pasajeros,double duracion){
         this.ciudadOrigen=ciudadOrigen;
         this.ciudadDestino=ciudadDestino;
         this.pasajeros=pasajeros;
         this.piloto=piloto;
         this.duracion=duracion;
     }
     
    public void setciudadOrigen(){this.ciudadOrigen=ciudadOrigen;}
    public String getciudadOrigen(){return ciudadOrigen;}
    
    public void setciudadDestino(){this.ciudadDestino=ciudadDestino;}
    public String getciudadDestino(){return ciudadDestino;}
   
    public void setpiloto(){this.piloto=piloto;}
    public String getnumeropasaporte(){return piloto;}
    
    public void setpasajeros(){this.pasajeros=pasajeros;}
    public List getpasajaeros(){return pasajeros;} 
    
    public void setduracion(){this.duracion=duracion;}
    public double getduracion(){return duracion;}
    
        
        
        
    
    
}
