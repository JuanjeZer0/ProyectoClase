
package ikea1;

public class Mueble extends ProductoHogar {
    
    private String tipoMueble;
    
    Mueble(String nombre,String descripcion,double precio,String tipoMaterial,String tipoMueble){
        super(nombre,descripcion,precio,tipoMaterial);
        this.tipoMueble=tipoMueble;
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }
    
    
    
}
