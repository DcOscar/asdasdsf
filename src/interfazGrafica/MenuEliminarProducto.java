/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfazGrafica;
import ventana.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.InternationalFormatter;
/**
 * 
 * @author Oscar
 */
public class MenuEliminarProducto extends Ventana {
private JPasswordField contraseña;
private JTextField nombreProducto, codigoProducto;
private JButton botonBorrarProducto, botonCancelar,botonProductosSimilares;
private JLabel textoEncabezado, textoNombreProducto,textoCodigoProducto,textoContraseña;
public MenuEliminarProducto(){
super("SIVU",500,400);
generarElementosVentana();

}
private void generarElementosVentana(){
generarBotones();
generarCamposTexto();
generarLabels();
repaint();
}

private void generarBotones(){
this.botonBorrarProducto=super.generarBoton("Eliminar producto", 250, 320, 200, 20);
this.add(this.botonBorrarProducto);
this.botonBorrarProducto.addActionListener(this);
this.botonProductosSimilares=super.generarBoton("Ver posibles productos", 100, 120, 250, 20);
this.add(this.botonProductosSimilares);
this.botonProductosSimilares.addActionListener(this);
this.botonCancelar=super.generarBoton("Cancelar", 50, 320, 150, 20);
this.add(this.botonCancelar);
this.botonCancelar.addActionListener(this);

}

private void generarCamposTexto(){
this.nombreProducto= super.generarJTextField(250, 80, 150, 20);
this.add(this.nombreProducto);
 InternationalFormatter formato = super.generarFormato(1);
 this.contraseña=super.generarJPasswordField(250, 230, 150, 20);
this.add(this.contraseña);
this.codigoProducto= super.generarJTextField(250,180,150,20);
this.add(codigoProducto);
}
private void generarLabels(){
super.generarJLabelEncabezado(this.textoEncabezado, "Eliminar producto", 20, 20, 250, 20);
super.generarJLabel(this.textoNombreProducto, "Nombre producto:", 20, 80, 200, 20);
super.generarJLabel(this.textoCodigoProducto, "Codigo producto:", 20, 180, 200, 20);
super.generarJLabel(this.textoContraseña, "Contraseña Administrador:", 20, 230, 200, 20);
}
}
