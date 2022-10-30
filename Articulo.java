import java.util.Date;
public class Articulo implements Caracteristicas{
    private String nombre;
    private float precio;
    private int stock;
    private String marca;
    private Boolean portable;

    public Articulo(String nombre, float precio, int stock, String marca, Boolean portable) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
        this.portable = portable;
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
     * @return float
     */
    public float getPrecio() {
        return this.precio;
    }

    
    /** 
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    /** 
     * @return int
     */
    public int getStock() {
        return this.stock;
    }

    
    /** 
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    
    /** 
     * @return String
     */
    public String getMarca() {
        return this.marca;
    }

    
    /** 
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean isPortable() {
        return this.portable;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean getPortable() {
        return this.portable;
    }

    
    /** 
     * @param portable
     */
    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

 

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String cadenaCsv="";
        cadenaCsv+=getNombre()+","+getMarca()+","+getPrecio();
        /*
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", stock='" + getStock() + "'" +
            ", marca='" + getMarca() + "'" +
            ", portable='" + isPortable() + "'" +
            "}";
            */
            return cadenaCsv;
    }
    
    /** 
     * @return String
     */
    @Override
    public String llamada(){
        return "Realizando llamada..";
    }
    
    /** 
     * @return String
     */
    @Override
    public String fotografia(){
        return "Click tomando foto..";
    }
    
    /** 
     * @return String
     */
    @Override
    public String reproducirVideo(){
        return "Video corriendo...";
    }
    
    /** 
     * @return String
     */
    @Override
    public String NavegarInternet(){
        return "Google chrome buscando...";
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean portable(){
        return true;
    }
    
    /** 
     * @return String
     */
    @Override
    public String ejecutarVideoJuegos(){
        return "Iniciando juego!";
    }

    

}