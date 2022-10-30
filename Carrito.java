import java.util.ArrayList;
import java.util.Collections;
public class Carrito {
    String cliente;
    int cantidadProductos;
    ArrayList<Articulo> productos=new ArrayList<Articulo>();
    float total;


    public Carrito(String cliente, int cantidadProductos, ArrayList<Articulo> productos, float total) {
        this.cliente = cliente;
        this.cantidadProductos = cantidadProductos;
        this.productos = productos;
        this.total = total;
    }
    
    /** 
     * @param articulo
     */
    public void agregarArticulo(Articulo articulo){
       
        total+=articulo.getPrecio();
    }
    public void listarCarrito(){
        for(int i=0;i<productos.size();i++){
            System.out.println("********"+productos.get(i).getNombre());
        }
        System.out.println("Total: "+total);
    }
    
    
    
    /** 
     * @return String
     */
    public String getCliente() {
        return this.cliente;
    }

    
    /** 
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
    /** 
     * @return int
     */
    public int getCantidadProductos() {
        return this.cantidadProductos;
    }

    
    /** 
     * @param cantidadProductos
     */
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    
    /** 
     * @return ArrayList<Articulo>
     */
    public ArrayList<Articulo> getProductos() {
        return this.productos;
    }

    
    /** 
     * @param productos
     */
    public void setProductos(ArrayList<Articulo> productos) {
        this.productos = productos;
    }

    
    /** 
     * @return float
     */
    public float getTotal() {
        return this.total;
    }

    
    /** 
     * @param total
     */
    public void setTotal(float total) {
        this.total = total;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " cliente='" + getCliente() + "'" +
            ", cantidadProductos='" + getCantidadProductos() + "'" +
            ", productos='" + getProductos() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }

}
