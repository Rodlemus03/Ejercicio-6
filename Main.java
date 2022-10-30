import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        //Objetos
        Cliente cliente=new Cliente(null, null, null, null);
        Carrito carrito=new Carrito(null, 0, null, 0);
        Sucursal sucursal=new Sucursal(null, null,null);
        Scanner teclado=new Scanner(System.in);
        ArrayList<Articulo> listaArticulosTemporal=new ArrayList<Articulo>();
        //Menu
            //Cliente
        String nombreCliente,nitCliente,telefonoCliente;
        System.out.println("\n______________________________________________________________________________________________________________________________");

        System.out.println("Ingresa el nombre del cliente");
        nombreCliente=teclado.next();
        System.out.println("Ingresa el nit: ");
        nitCliente=teclado.next();
        System.out.println("Ingresa el numero de telefono ");
        telefonoCliente=teclado.next();
        cliente.setNombre(nombreCliente);
        cliente.setNit(nitCliente);
        cliente.setTelefono(telefonoCliente);
        
        //Sucursal
        String nombreSucursal,direccionSucursal,paisSucursal;
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("Ingresa el nombre de la sucursal ");
        nombreSucursal=teclado.next();
        System.out.println("Ingresa la direccion de la sucursal");
        direccionSucursal=teclado.next();
        System.out.println("Ingresa el pais de la sucursal ");
        paisSucursal=teclado.next();
        sucursal.setNombre(nombreSucursal);
        sucursal.setDireccion(direccionSucursal);
        sucursal.setPais(paisSucursal);
        carrito.setCliente(telefonoCliente);
        
        //Menu de compras
        int seleccion=0;
        while(seleccion!=3){
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("1. Comprar articulos ");
            System.out.println("2. Ver carrito ");
            System.out.println("3. Finalizar compra ");
            System.out.println("Ingresa tu eleccion-----> ");
            seleccion=teclado.nextInt();
            if(seleccion==1){
                //Mostrar lista productos
                int eleccionArticulo=0;
                Articulo articulo=new Articulo(nombreSucursal, seleccion, seleccion, direccionSucursal, false);
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("1. Smartphone");
                System.out.println("\t\t Llamadas, fotografias, navegar, videos, portable");
                System.out.println("\n2. Telefono celular");
                System.out.println("\t\t Llamadas, portable");
                System.out.println("\n3. Telefono fijo");
                System.out.println("\t\t Llamadas");
                System.out.println("\n4. Camara fotografica");
                System.out.println("\t\t fotografias, reproducir videos, portable ");
                System.out.println("\n5. Computador personal desktop");
                System.out.println("\t\t Navegar internet, reproducir videos, ejecutar videojuegos");
                System.out.println("\n6. Computador personal laptop");
                System.out.println("\t\t Navegar internet, ejecutar videojuegos, reproducir videos, portable");
                System.out.println("\n7. Smart tv");
                System.out.println("\t\t Navegar por internet, reproducir videos");
                System.out.println("\n8. Tablets");
                System.out.println("\t\t Tomar fotografias, navegar internet,reproducir videos");
                System.out.println("\n9. Smart watch");
                System.out.println("\t\t Tomar fotografias, hacer llamada, portable");

                eleccionArticulo=teclado.nextInt();
                if(eleccionArticulo==1){
                    //Caracteristicas unicas
                    articulo.setNombre("SmartPhone");
                    articulo.setMarca("Iphone");
                    articulo.setPortable(true);
                    articulo.setPrecio(1000);
                    articulo.setStock(15);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.llamada());
                    System.out.println(articulo.fotografia());
                    System.out.println(articulo.NavegarInternet());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==2){
                    //Caracteristicas unicas
                    articulo.setNombre("Celular");
                    articulo.setMarca("Xiaomi");
                    articulo.setPortable(true);
                    articulo.setPrecio(800);
                    articulo.setStock(20);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.llamada());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==3){
                    //Caracteristicas unicas
                    articulo.setNombre("telefonoFijo");
                    articulo.setMarca("Nokia");
                    articulo.setPortable(false);
                    articulo.setPrecio(600);
                    articulo.setStock(20);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.llamada());
                    System.out.println("Portable: "+articulo.portable());
                    carrito.agregarArticulo(articulo);
                    listaArticulosTemporal.add(articulo);
                }else if(eleccionArticulo==4){
                    //Caracteristicas unicas
                    articulo.setNombre("Camara Fotografica");
                    articulo.setMarca("Sony");
                    articulo.setPortable(true);
                    articulo.setPrecio(1700);
                    articulo.setStock(23);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.fotografia());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==5){
                    //Caracteristicas unicas
                    articulo.setNombre("Desktop");
                    articulo.setMarca("Omen");
                    articulo.setPortable(false);
                    articulo.setPrecio(15000);
                    articulo.setStock(4);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.NavegarInternet());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println(articulo.ejecutarVideoJuegos());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==6){
                    //Caracteristicas unicas
                    articulo.setNombre("Laptop");
                    articulo.setMarca("HP");
                    articulo.setPortable(true);
                    articulo.setPrecio(8000);
                    articulo.setStock(13);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.NavegarInternet());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println(articulo.ejecutarVideoJuegos());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==7){
                    //Caracteristicas unicas
                    articulo.setNombre("Smart tv");
                    articulo.setMarca("Samsung");
                    articulo.setPortable(false);
                    articulo.setPrecio(3275);
                    articulo.setStock(16);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.NavegarInternet());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==8){
                    //Caracteristicas unicas
                    articulo.setNombre("Tablet");
                    articulo.setMarca("Vaio");
                    articulo.setPortable(true);
                    articulo.setPrecio(1650);
                    articulo.setStock(17);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.fotografia());
                    System.out.println(articulo.NavegarInternet());
                    System.out.println(articulo.reproducirVideo());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else if(eleccionArticulo==9){
                    //Caracteristicas unicas
                    articulo.setNombre("Smartwatch");
                    articulo.setMarca("Lenovo");
                    articulo.setPortable(true);
                    articulo.setPrecio(2000);
                    articulo.setStock(26);
                    //Prueba funcionalidades
                    System.out.println("PROBANDO FUNCIONALIDADES");
                    System.out.println(articulo.llamada());
                    System.out.println(articulo.fotografia());
                    System.out.println("Portable: "+articulo.portable());
                    listaArticulosTemporal.add(articulo);
                    carrito.agregarArticulo(articulo);
                }else{
                    System.out.println("Ingresa un valor correcto ");
                }
               
                
            }else if(seleccion==2){
                carrito.setProductos(listaArticulosTemporal);
                if(listaArticulosTemporal.size()==00){
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("El carrito esta vacio");
                }else{

            System.out.println("\n______________________________________________________________________________________________________________________________");
                    //Normal
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("__________ CARRITO _____________");
            carrito.listarCarrito();
        
                    
                }
            }else if(seleccion==3){
                if(listaArticulosTemporal.size()==0){
            System.out.println("\n______________________________________________________________________________________________________________________________");
            System.out.println("No se realizo ninguna compra ");
                }else{
                    System.out.println("\n______________________________________________________________________________________________________________________________");

                    carrito.setProductos(listaArticulosTemporal);
                    System.out.println("\n\n\n\n");
                    System.out.println("######################### FACTURA #######################");
                    System.out.println("____________Datos del cliente______________");
                    System.out.println(cliente.toString());
                    System.out.println("____________Datos de la compra_____________");
                    carrito.listarCarrito();
                    Archivo clientes1=new Archivo("./registro_clientes.csv","nombre,nit,telefono");
                    String linea="";
                    linea+=cliente.getNombre()+",";
                    linea+=cliente.getNit()+",";
                    linea+=cliente.getTelefono();
                    clientes1.escribirArchivo(linea);
                    Archivo compras1=new Archivo("./registro_compras.csv","nombre,marca,precio,cliente");
                    for(int i=0;i<listaArticulosTemporal.size();i++){
                        compras1.escribirArchivo(listaArticulosTemporal.get(i).toString()+","+cliente.getNombre());
                    }







                }
                
            }else{
                System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
