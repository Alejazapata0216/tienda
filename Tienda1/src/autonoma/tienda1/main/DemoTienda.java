/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.tienda1.main;
import autonoma.tienda1.models.Tienda1;
import autonoma.tienda1.views.VentanaPrincipal;

/**
 *
 * @ale-0324
 */
public class DemoTienda {
    public static void main(String[]args){
        
        Tienda1 tienda= new Tienda1("Muebles Castro","calle 8#11-73");
        
        VentanaPrincipal ventana= new VentanaPrincipal(tienda);
        ventana.setVisible(true);
    }
}
