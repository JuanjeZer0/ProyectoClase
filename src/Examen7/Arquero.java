
package Examen7;

public class Arquero extends Personaje{
        
    private int punteria;
    private String arco;
    
    
    Arquero(String nombre,int puntosVida,int fuerza,int punteria,String arco){
        super(nombre,puntosVida,fuerza);
        this.arco=arco;
        this.punteria=punteria;
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
    @Override
    public int getpuntosVida() {
        return super.getpuntosVida();
    }
    @Override
    public void setpuntosVida(int puntosVida) {
        super.setpuntosVida(puntosVida);
    }
    @Override
    public int getfuerza() {
        return super.getfuerza();
    }
    @Override
    public void setfuerza(int fuerza) {
        this.setfuerza(fuerza);
    }
    @Override
    public String getnombre() {
        return super.getnombre();
    }
    @Override
    public void setnombre(String nombre) {
        this.setnombre(nombre);
    }
    
    @Override
    public void atacar(){
        System.out.println("El arquero "+this.getnombre()+" está atacando");
    }
    @Override
    public void defender(){
        System.out.println("El arquero "+this.getnombre()+" está defendiendo");
    }
    
}
