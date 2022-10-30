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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean isPortable() {
        return this.portable;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

 

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
    @Override
    public String llamada(){
        return "Realizando llamada..";
    }
    @Override
    public String fotografia(){
        return "Click tomando foto..";
    }
    @Override
    public String reproducirVideo(){
        return "Video corriendo...";
    }
    @Override
    public String NavegarInternet(){
        return "Google chrome buscando...";
    }
    @Override
    public boolean portable(){
        return true;
    }
    @Override
    public String ejecutarVideoJuegos(){
        return "Iniciando juego!";
    }

    

}