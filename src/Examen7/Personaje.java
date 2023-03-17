
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

    public void setpuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getpuntosVida() {
        return puntosVida;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getfuerza() {
        return fuerza;
    }

    
    
    public void atacar(){
        System.out.println("El personaje "+this.getnombre()+" está atacando");
    }
    
    public void defender(){
        System.out.println("El personaje"+this.getnombre()+" está defendiendo");
    }
            
    
}
