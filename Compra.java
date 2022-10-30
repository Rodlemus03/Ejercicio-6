import java.util.ArrayList;

public class Compra {
    Cliente cliente;
    Sucursal sucursal;
    ArrayList<Articulo> productos=new ArrayList<Articulo>();
    float total;


    public Compra(Cliente cliente, Sucursal sucursal, ArrayList<Articulo> productos, float total) {
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.productos = productos;
        this.total = total;
    }

}
