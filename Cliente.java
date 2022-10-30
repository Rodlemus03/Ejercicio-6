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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrito getCarrito() {
        return this.carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nit='" + getNit() + "'" +
            ", telefono='" + getTelefono() + "'" +
            "}";
    }

}
