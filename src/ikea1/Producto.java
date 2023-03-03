
package ikea1;

public abstract class Producto {
    // nombre, descripción y precio
    
    private String nombre;
    private String descricion;
    private double precio;
    
    Producto(String nombre,String descripcion,double precio){
        this.descricion=descripcion;
        this.nombre=nombre;
        this.precio=precio;
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
