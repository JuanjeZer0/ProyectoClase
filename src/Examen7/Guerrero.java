
package Examen7;

public class Guerrero {
        
    private String nombre;
    private int puntosVida;
    private int fuerza;
    private int armadura;
    private String arma;
    
    Guerrero(String nombre,int puntosVida, int fuerza,int armadura,String arma){
        this.arma=arma;
        this.armadura=armadura;
        this.fuerza=fuerza;
        this.nombre=nombre;
        this.puntosVida=puntosVida;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public void atacar(){
        System.out.println("El guerrero "+this.getNombre()+" está atacando");
    }
    
    public void defender(){
        System.out.println("El guerrero "+this.getNombre()+" está defendiendo");
    }

      
    
}
