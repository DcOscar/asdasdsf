/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfazGrafica;
/**
 * 
 * @author Oscar
 */
import ventana.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Bienvenida extends Ventana {
private JLabel textoBienvenida, textoSubtitulo;
private JButton botonAdministrador, botonVendedor, botonSalir;

public Bienvenida(){
super("SIVU",500,400);
inicializarVentana();

}
private void inicializarVentana(){
generarBotonAdministrador();
generarBotonVendedor();
 generarLabelBienvenida();
  generarLabelSubtitulo();
}
private void generarBotonAdministrador(){
this.botonAdministrador= super.generarBoton("Administrador", 50, 270, 150, 20);
this.add(this.botonAdministrador);
this.botonAdministrador.addActionListener(this);

}
private void generarBotonVendedor(){
this.botonVendedor= super.generarBoton("Vendedor", 285, 270, 150, 20);
this.add(this.botonVendedor);
this.botonVendedor.addActionListener(this);

}

private void generarLabelBienvenida(){
super.generarJLabelEncabezado(this.textoBienvenida, "Bienvenidos a S.I.V.U", 135, 20, 300, 50);

}
private void generarLabelSubtitulo(){
super.generarJLabel(this.textoSubtitulo, "Indique con que tipo de usuario ingresará:", 50, 100, 400, 50);

}

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
