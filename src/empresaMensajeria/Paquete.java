
package empresaMensajeria;

public class Paquete {
/*Dirección de origen
Dirección de destino
Peso (en kg)
Costo de envío
Estado de entrega (por defecto "No entregado")
Identificador único
*/
    private String direccionOrigen;
    private String direccionDestino;
    private int peso;
    private double costoEnvio;
    private double costoEntrega;
    private int id;
    
    Paquete(String direccionOrigen,String direccionDestino,int peso,double costoEnvio,double costoEntrega,int id){
        this.direccionOrigen=direccionOrigen;
        this.direccionDestino=direccionDestino;
        this.peso=peso;
        this.costoEnvio=costoEnvio;
        this.costoEntrega=costoEntrega;
        this.id=id;
                
    }
    
    public void setdireccionOrigen(){this.direccionOrigen=direccionOrigen;}
    public String getdireccionOrigen(){return direccionOrigen;}
    
    public void setdireccionDestino(){this.direccionDestino=direccionDestino;}
    public String getdireccionDestino(){return direccionDestino;}
    
    public void setpeso(){this.peso=peso;}
    public int getpeso(){return peso;}
    
    public void setcostoEvio(){this.costoEnvio=costoEnvio;}
    public double getcostoEnvio(){return costoEnvio;}
    
    public void setcostoEntrega(){this.costoEntrega=costoEntrega;}
    public double getcostoEntrega(){return costoEntrega;}
    
    public void setid(){this.id=id;}
    public int getid(){return id;}
    
}