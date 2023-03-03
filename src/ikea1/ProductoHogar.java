
package ikea1;

public abstract class ProductoHogar extends Producto{
    private String nombre;
    private String descricion;
    private double precio;
    private String tipoMaterial;
    
    ProductoHogar(String nombre,String descripcion,double precio,String tipoMaterial){
        super(nombre,descripcion,precio);
        this.tipoMaterial=tipoMaterial;
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

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    
    
    
}
