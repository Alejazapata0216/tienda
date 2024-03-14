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
public class Inventario {
    //////// atributos////////
    private ArrayList<Producto>productos;

    ///////constructor/////
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    //////metodos de acceso////
    public ArrayList<Producto> getProductos(){    
        return productos;
    }

    //// metodo/////
    public String mostrarInventario() {
        String inventario="";
        for(int i=0;i<this.productos.size();i++){
            Producto p= this.productos.get(i);
            inventario +=p.toString()+"\n";
        }
        return inventario;
    }
    ////CRUD de Producto//////
     public boolean agregarProducto(Producto producto){
       return this.productos.add(producto);
    }
    public Producto buscarProducto(Producto producto){
        for(int i=0;i<this.productos.size();i++){
          Producto p= this.productos.get(i);
          if(p.equals(producto)){
          return p;
          
          }
        }
      return null;
    }
     public Producto buscarProducto(long id){
        for(int i=0;i<this.productos.size();i++){
          Producto p= this.productos.get(i);
          if(p.getId()== id){
          return p;
          }
        }
      return null;
    }
    public Producto buscarProducto(String nombre){
        for(int i=0;i<this.productos.size();i++){
          Producto p= this.productos.get(i);
          if(p.getNombre().equals(nombre)){
          return p;   
           }
        }
        return null;
   }
   private int buscarIndiceProducto(long id){
        for(int i=0;i<this.productos.size();i++){
          Producto p= this.productos.get(i);
          if(p.getId()==id){
          return i;   
           }
        }
        return -1;
   }
    
   public Producto actualizarProducto(long id,Producto producto){
        int index = this.buscarIndiceProducto(id);
        if(index>=0){
            return this.productos.set(index, producto);
        }else{
          return null;
        }
    }
     
    public Producto eliminarProducto(long id){
        int index = this.buscarIndiceProducto(id);
        if(index>=0){
            return this.productos.remove(index);
        }else{
          return null;
        }
    }
}
