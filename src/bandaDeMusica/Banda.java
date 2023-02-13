
package bandaDeMusica;

public class Banda {
    //La banda constará de un nombre, un año de fundación y un conjunto de músicos, que como hemos dicho, son 6.
    
    private String nombre;
    private int añoFundacion;
    private int conjuntoMusicos;
        
    Banda(){}
    
    Banda(String nombre,int añoFundacion,int cojuntoMusicos){
        this.nombre=nombre;
        this.añoFundacion=añoFundacion;
        this.conjuntoMusicos=conjuntoMusicos;
    }
    
    public void setnombre(){this.nombre=nombre;}
    public String getnombre(){return nombre;}
    
    public void setañoFundacion(){this.añoFundacion=añoFundacion;}
    public int getañoFundacion(){return añoFundacion;}
    
    public void setconjuntoMusicos(){this.conjuntoMusicos=conjuntoMusicos;}
    public int getconjuntoMusicos(){return conjuntoMusicos;}
    
    //métodos
    
    public void agregaMusico(){}
    
    public String getBajista(){
        return nombre;
    }
    
    
    public void MostrarDatos(String nombre,int añoFundacion,int conjuntoMusicos){
     
     System.out.println("EL nombre de la banda es "+nombre+",se fundó en "+añoFundacion+" y se compone de "+conjuntoMusicos+" de musicos");
     
    }
    
    
    
}
