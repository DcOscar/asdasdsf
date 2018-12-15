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
public class MenuAgregarProducto extends Ventana {
JTextField nombreProducto;
JFormattedTextField precioProducto;
JComboBox categorias;
JButton botonAceptar,botonCancelar,botonAñadirCategoria;
JLabel textoEncabezado, textoNombreProducto, textoPrecio;
public MenuAgregarProducto(){
super("SIVU",500,400);
generarElementosVentana();
}

private void generarElementosVentana(){
generarCategorias();
generarBotones();
generarCamposTexto();
generarLabels();
repaint();
}
private void generarCategorias(){
this.categorias= new JComboBox();
this.categorias.addItem("Elije una categoria");
this.categorias.setBounds(50, 100, 120, 20);
this.add(this.categorias);
}
private void generarBotones(){
this.botonAceptar=super.generarBoton("Aceptar", 300, 300, 150, 20);
this.add(this.botonAceptar);
this.botonAceptar.addActionListener(this);
this.botonAñadirCategoria=super.generarBoton("Agregar nueva categoria", 200, 100, 250, 20);
this.add(this.botonAñadirCategoria);
this.botonAñadirCategoria.addActionListener(this);
this.botonCancelar=super.generarBoton("Cancelar", 50, 300, 150, 20);
this.add(this.botonCancelar);
this.botonCancelar.addActionListener(this);
}

private void generarCamposTexto(){
this.nombreProducto= super.generarJTextField(200, 150, 150, 20);
this.add(this.nombreProducto);
 InternationalFormatter formato = super.generarFormato(1);
 this.precioProducto=super.generarJFormattedTextField(formato, 200, 200, 150, 20);
this.add(this.precioProducto);
}
private void generarLabels(){
super.generarJLabelEncabezado(this.textoEncabezado, "Agregar producto", 20, 20, 250, 40);
super.generarJLabel(this.textoNombreProducto, "Nombre producto:", 20, 150, 150, 20);
super.generarJLabel(this.textoPrecio, "Precio unitario:", 20, 200, 150, 20);
}
}