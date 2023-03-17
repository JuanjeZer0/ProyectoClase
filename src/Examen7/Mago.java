
package Examen7;

public class Mago extends Personaje{
    
    private int magia;
    private String varita;
    
    
    Mago(String nombre,int puntosVida,int fuerza,int magia,String varita){
        super(nombre,puntosVida,fuerza);
        this.magia=magia;
        this.varita=varita;
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
    public int getpuntosVida() {
        return super.getpuntosVida();
    }
    @Override
    public void setpuntosVida(int puntosVida) {
        super.setpuntosVida(puntosVida);
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }
    @Override
    public int getfuerza() {
        return super.getfuerza();
    }
    @Override
    public void setfuerza(int fuerza) {
        super.setfuerza(fuerza);
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }
    
    @Override
    public void atacar(){
        System.out.println("El mago "+this.getnombre()+" está atacando");
    }
    
    @Override
    public void defender(){
        System.out.println("El mago "+this.getnombre()+" está defendiendo");
    }
    
    //equals
    
    @Override
    public boolean equals(Object otro){
        boolean res = false;
        
        Mago otroMago= (Mago)otro;
        
        if(this.getpuntosVida()==otroMago.getpuntosVida() && this.getfuerza()==otroMago.getfuerza() && this.magia == otroMago.magia){   
            res = true;
        }
        return res;
    }
     
    //toString
    
    @Override
    public String toString(){
        return "Nombre: "+ this.getnombre();
    }
    
}
