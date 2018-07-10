
package tiendadefrutas;


public class Frutas {
    
    private int precio;
    private String nombre;
    private String Codigo;
    

    public Frutas(int precio, String nombre, String Codigo) {
        this.precio = precio;
        this.nombre = nombre;
        this.Codigo = Codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
