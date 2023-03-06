
package Examen7;

public class Mago {
    
    private String nombre;
    private int puntosVida;
    private int fuerza;
    private int magia;
    private String varita;
    
    
    Mago(String nombre,int puntosVida,int fuerza,int magia,String varita){
        this.fuerza=fuerza;
        this.magia=magia;
        this.puntosVida=puntosVida;
        this.nombre=nombre;
        this.varita=varita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }
    
    public void atacar(){
        System.out.println("El mago "+this.getNombre()+" está atacando");
    }
    
    public void defender(){
        System.out.println("El mago "+this.getNombre()+" está defendiendo");
    }
    
}
