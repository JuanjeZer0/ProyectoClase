
package Examen7;

public class Personaje {
    
    private String nombre;
    private int puntosVida;
    private int fuerza;
    
    Personaje(String nombre,int puntosVida,int fuerza){
        this.fuerza=fuerza;
        this.nombre=nombre;
        this.puntosVida=puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    
    
    public void atacar(){
        System.out.println("El personaje "+this.getNombre()+" está atacando");
    }
    
    public void defender(){
        System.out.println("El personaje"+this.getNombre()+" está defendiendo");
    }
            
    
}
