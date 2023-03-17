
package Examen7;

public class Guerrero extends Personaje {

    private int armadura;
    private String arma;
    
    Guerrero(String nombre,int puntosVida, int fuerza,int armadura,String arma){
        super(nombre,puntosVida,fuerza);
        this.arma=arma;
        this.armadura=armadura;
       
    }
    @Override
    public int getpuntosVida() {
        return super.getpuntosVida();
    }
    @Override
    public void setpuntosVida(int puntosVida) {
        super.getpuntosVida();
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
    @Override
    public String getnombre() {
        return super.getnombre();
    }
    @Override
    public void setnombre(String nombre) {
        super.setnombre(nombre);
    }
    @Override
    public int getfuerza() {
        return super.getfuerza();
    }
    @Override
    public void setfuerza(int fuerza) {
        super.setfuerza(fuerza);
    }
    
    @Override
    public void atacar(){
        System.out.println("El guerrero "+this.getnombre()+" está atacando");
    }
    
    @Override
    public void defender(){
        System.out.println("El guerrero "+this.getnombre()+" está defendiendo");
    }

      
    
}
