public class Cliente {
    String nombre;
    Carrito carrito;
    String nit;
    String telefono;


    public Cliente(String nombre, Carrito carrito, String nit, String telefono) {
        this.nombre = nombre;
        this.carrito = carrito;
        this.nit = nit;
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return Carrito
     */
    public Carrito getCarrito() {
        return this.carrito;
    }

    
    /** 
     * @param carrito
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    
    /** 
     * @return String
     */
    public String getNit() {
        return this.nit;
    }

    
    /** 
     * @param nit
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    
    /** 
     * @return String
     */
    public String getTelefono() {
        return this.telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nit='" + getNit() + "'" +
            ", telefono='" + getTelefono() + "'" +
            "}";
    }

}
