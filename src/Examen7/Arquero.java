
package Examen7;

public class Arquero {
        
    private String nombre;
    private int puntosVida;
    private int fuerza;
    private int punteria;
    private String arco;
    
    
    Arquero(String nombre,int puntosVida,int fuerza,int punteria,String arco){
        this.arco=arco;
        this.fuerza=fuerza;
        this.punteria=punteria;
        this.nombre=nombre;
        this.puntosVida=puntosVida;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void atacar(){
        System.out.println("El arquero "+this.getNombre()+" está atacando");
    }
    
    public void defender(){
        System.out.println("El arquero "+this.getNombre()+" está defendiendo");
    }
    
}
