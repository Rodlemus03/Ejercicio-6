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
    public void agregarArticulo(Articulo articulo){
       
        total+=articulo.getPrecio();
    }
    public void listarCarrito(){
        for(int i=0;i<productos.size();i++){
            System.out.println("********"+productos.get(i).getNombre());
        }
        System.out.println("Total: "+total);
    }
    
    
    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadProductos() {
        return this.cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public ArrayList<Articulo> getProductos() {
        return this.productos;
    }

    public void setProductos(ArrayList<Articulo> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

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
