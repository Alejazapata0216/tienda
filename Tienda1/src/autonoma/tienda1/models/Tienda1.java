/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.tienda1.models;

import java.util.ArrayList;

/**
 *
 * @ale-0324
 */
public class Tienda1 {
    //////// atributos//////
    
    private String nombre;
    private String direccion;
    private Inventario inventario;
    
    ///////constructor/////
    
    public Tienda1( String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.inventario= new Inventario();
    }
    ////// metodos de acceso////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return this.inventario.getProductos();
    
    }
    ////// metodo/////
    public String mostrarInventario(){
        return this.inventario.mostrarInventario();
    }
    /////CRUD de productos////////
    public boolean agregarProducto(Producto producto){
       return this.inventario.agregarProducto(producto);
    }
    public Producto buscarProducto(Producto producto){
        return this.inventario.buscarProducto(producto);
    }
     public Producto buscarProducto(long id){
       return this.inventario.buscarProducto(id);
    }
     
     public Producto buscarProducto(String nombre){
         return this.inventario.buscarProducto(nombre);
   }
    
   public Producto actualizarProducto(long id,Producto producto){
       return this.inventario.actualizarProducto(id,producto);
    }
     
    public Producto eliminarProducto(long id){
        return this.inventario.eliminarProducto(id);  
    }  
}
