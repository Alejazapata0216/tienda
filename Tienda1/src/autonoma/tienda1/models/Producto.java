/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.tienda1.models;

/**
 *
 * @ale-0324
 */
public class Producto {
    private static int contadorProducto=1;
    
    /////Atributos////
    private long id;
    private String nombre;
    private double precio;
    
    
    ///// Constructores/////
    public Producto(){
        this.id=Producto.contadorProducto;
        this.nombre= " ";
        this.precio=0;
        contadorProducto++;
    }

    public Producto( String nombre, double precio) {
        this.id= Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;
    }
    /////metodos de acceso////

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public static void setContadorProducto(int contadorProducto) {
        Producto.contadorProducto = contadorProducto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    ///// metodos///////
    @Override
    public String toString(){
       return "Producto " +id+ "\n"+
               "  Nombre: "+nombre+"\n"+
               "  Precio: "+precio+"\n";
    }
}
