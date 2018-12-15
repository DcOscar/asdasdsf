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
public class MenuVenta extends Ventana{
JTextField nombreProducto,codigoProducto;
JFormattedTextField cantidadProductos;
JComboBox categorias;
JButton botonAceptar,botonCancelar,botonProductosActuales,botonProductosSimilares;
JLabel textoEncabezado, textoNombreProducto,textoCodigo,textoCantidad;
public MenuVenta(){
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
this.botonAceptar=super.generarBoton("Aceptar", 300, 320, 150, 20);
this.add(this.botonAceptar);
this.botonAceptar.addActionListener(this);
this.botonProductosSimilares=super.generarBoton("Ver posibles productos", 100, 120, 250, 20);
this.add(this.botonProductosSimilares);
this.botonProductosSimilares.addActionListener(this);
this.botonCancelar=super.generarBoton("Cancelar", 50, 320, 150, 20);
this.add(this.botonCancelar);
this.botonCancelar.addActionListener(this);
this.botonProductosActuales=super.generarBoton("Ver Venta", 100, 265, 250, 20);
this.add(this.botonProductosActuales);
this.botonProductosActuales.addActionListener(this);
}

private void generarCamposTexto(){
this.nombreProducto= super.generarJTextField(250, 80, 150, 20);
this.add(this.nombreProducto);
 InternationalFormatter formato = super.generarFormato(1);
 this.cantidadProductos=super.generarJFormattedTextField(formato, 250, 230, 150, 20);
this.add(this.cantidadProductos);
this.codigoProducto= super.generarJTextField(250,180,150,20);
this.add(codigoProducto);
}
private void generarLabels(){
super.generarJLabelEncabezado(this.textoEncabezado, "Venta", 20, 20, 250, 20);
super.generarJLabel(this.textoNombreProducto, "Nombre producto:", 20, 80, 200, 20);
super.generarJLabel(this.textoCodigo, "Codigo producto:", 20, 180, 200, 20);
super.generarJLabel(this.textoCantidad, "Cantidad:", 20, 230, 200, 20);
}
}

