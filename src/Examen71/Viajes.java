
package Examen71;

public class Viajes {
    
    private String ciudadOrigen;
    private String ciudadDestino;
    private String piloto;
    private listaPasajeros[] listaPasajeros;
    private double duracion;
    
    Viajes(String ciudadOrigen,String ciudadDestino,String piloto,listaPasajeros[] listaPasajeros,double duracion){
        this.ciudadDestino=ciudadDestino;
        this.ciudadOrigen=ciudadOrigen;
        this.duracion=duracion;
        this.listaPasajeros=listaPasajeros;
        this.piloto=piloto;
        
    }
    
    //set 

    public void setListaPasajeros(listaPasajeros[] listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    //get

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public listaPasajeros[] getListaPasajeros() {
        return listaPasajeros;
    }

    public String getPiloto() {
        return piloto;
    }
    
    
    
}
