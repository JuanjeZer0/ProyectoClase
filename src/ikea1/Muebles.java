
package ikea1;
enum material{MADERA,METAL,PLASTICO}
public class Muebles {
    //nombre, una descripción, un precio y un tipo de material (madera, metal, plástico, etc.).
    
    private String nombre;
    private String descripcion;
    private double precio;
    private material material;
    
    Muebles(String nombre,String descripcion,double precio,material material){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.material=material;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public material getMaterial() {
        return material;
    }

    public void setMaterial(material material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
            
            
}
