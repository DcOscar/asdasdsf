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
/**
 * 
 * @author Oscar
 */
public class MenuCambiarContraseña extends Ventana {
    private JLabel textoUsuario, textoContraseña, textoNuevaContraseña, textoEncabezado;
    private  JPasswordField contraseñAntigua, nuevaContraseña;
    private JTextField nombreUsuario;
    private JButton botonAceptar,botonCancelar;
    public MenuCambiarContraseña(){
    super("SIVU",500,400);
    generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarTextoVentana();
        generarCamposTexto();
        generarBotones();
        repaint();
            }
private void generarTextoVentana(){
super.generarJLabel(this.textoUsuario, "Nombre de usuario:", 20, 100, 150, 20);
super.generarJLabel(this.textoContraseña, "Contraseña antigua:", 20, 150, 150, 20);
super.generarJLabel(this.textoNuevaContraseña, "Nueva contraseña:", 20, 200, 150,20 );
super.generarJLabelEncabezado(this.textoEncabezado, "Cambiar contraseña", 20,20,250,20);
}
private void generarCamposTexto(){
this.nombreUsuario= super.generarJTextField(200,100,150,20);
this.add(this.nombreUsuario);
this.contraseñAntigua= super.generarJPasswordField(200,150,150,20);
this.add(this.contraseñAntigua);
this.nuevaContraseña=super.generarJPasswordField(200,200,150,20);
this.add(this.nuevaContraseña);
}
private void generarBotones(){
this.botonAceptar=super.generarBoton("Aceptar", 300,300,150,20);
this.add(this.botonAceptar);
this.botonAceptar.addActionListener(this);
this.botonCancelar=super.generarBoton("Cancelar",50,300,150,20);
this.add(this.botonCancelar);
this.botonCancelar.addActionListener(this);
}
@Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
