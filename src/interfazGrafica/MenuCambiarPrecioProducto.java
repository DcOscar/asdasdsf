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
public class MenuCambiarPrecioProducto extends Ventana {
private JComboBox categorias;
private JLabel textoNombreProducto, textoCodigoProducto,textoPrecioProducto,textoEncabezado;
private JTextField codigoProducto, nombreProducto;
private JFormattedTextField precioProducto;
private JButton botonAceptar,botonCancelar,botonPosibleProducto;
public MenuCambiarPrecioProducto(){
super("SIVU",500,400);
generarElementosVentana();

}
private void generarElementosVentana(){
generarCamposTexto();
generarLabels();
generarBotones();
repaint();
}
private void generarCamposTexto(){
     InternationalFormatter formato = super.generarFormato(1);
 this.precioProducto=super.generarJFormattedTextField(formato, 250, 250, 150, 20);
this.add(this.precioProducto);
this.codigoProducto=super.generarJTextField(250,200,150,20);
this.add(this.codigoProducto);
this.nombreProducto=super.generarJTextField(250,100,150,20);
this.add(this.nombreProducto);
}
private void generarLabels(){
super.generarJLabelEncabezado(this.textoEncabezado, "Cambiar precio a producto", 20, 20, 300, 40);
super.generarJLabel(this.textoNombreProducto, "Nombre producto:", 20, 100, 200,20);
super.generarJLabel(this.textoCodigoProducto, "Código producto:", 20,200,200,20);
super.generarJLabel(this.textoPrecioProducto, "Nuevo precio producto:", 20,250,200,20);
}
private void generarBotones(){
this.botonAceptar=super.generarBoton("Aceptar", 280, 300, 150, 20);
this.add(this.botonAceptar);
this.botonAceptar.addActionListener(this);
this.botonCancelar=super.generarBoton("Cancelar", 50, 300, 150, 20);
this.add(this.botonCancelar);
this.botonCancelar.addActionListener(this);
this.botonPosibleProducto=super.generarBoton("Posibles productos", 150, 150, 200, 20);
this.add(this.botonPosibleProducto);
this.botonPosibleProducto.addActionListener(this);
}
}
