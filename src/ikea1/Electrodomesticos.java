
package ikea1;
enum eficencia{A, B, C, D, E, F}
public class Electrodomesticos {
    // tiene un nombre, una descripción, un precio y una eficiencia energética (A, B, C, D, E, F). 
    
    private String nombre;
    private String descricion;
    private double precio;
    private eficencia eficencia;
    
    Electrodomesticos(String nombre,String descripcion,double precio,eficencia eficencia){
        this.descricion=descripcion;
        this.nombre=nombre;
        this.precio=precio;
        this.eficencia=eficencia;
    }

    public eficencia getEficencia() {
        return eficencia;
    }

    public void setEficencia(eficencia eficencia) {
        this.eficencia = eficencia;
    }
    
      public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
