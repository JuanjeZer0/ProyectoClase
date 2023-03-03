
package ikea1;

public class Electrodomestico extends ProductoHogar {
    
    private String eficenciaEnergetica;
    
    Electrodomestico(String nombre,String descripcion,double precio,String tipoMaterial,String eficenciaEnergetica){
        super(nombre,descripcion,precio,tipoMaterial);
        this.eficenciaEnergetica=eficenciaEnergetica;
    }

    public String getEficenciaEnergetica() {
        return eficenciaEnergetica;
    }

    public void setEficenciaEnergetica(String eficenciaEnergetica) {
        this.eficenciaEnergetica = eficenciaEnergetica;
    }
    
    
    
}
