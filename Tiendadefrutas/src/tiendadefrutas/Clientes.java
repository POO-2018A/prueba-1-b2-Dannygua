
package tiendadefrutas;

public class Clientes {
    
    private String nombre;
    private String cedula;
    private String frutaC;
    private int precioC;

    public Clientes(String nombre, String cedula, String frutaC, int precioC) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.frutaC = frutaC;
        this.precioC = precioC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getFrutaC() {
        return frutaC;
    }

    public void setFrutaC(String frutaC) {
        this.frutaC = frutaC;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }

    @Override
    public String toString() {
        return cedula;
    }
    
    

    
    
    
}
