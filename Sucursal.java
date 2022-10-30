public class Sucursal {
    String nombre;
    String direccion;
    String pais;

    public Sucursal(String nombre, String direccion,String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais=pais;
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
     * @return String
     */
    public String getDireccion() {
        return this.direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return String
     */
    public String getPais() {
        return this.pais;
    }

    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }



    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            "}";
    }

}
