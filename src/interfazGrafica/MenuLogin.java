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
public class MenuLogin extends Ventana {

    private JPasswordField contraseña;
    private JTextField nombreUsuario;
    private JLabel textoContraseña, textoEncabezado, textoUsuario;
    private JButton botonAceptar, botonCancelar;

    public MenuLogin() {
        super("SIVU", 500, 400);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarCamposTexto();
        generarBotones();
        generarTexto();
        repaint();

    }

    private void generarCamposTexto() {
        this.nombreUsuario = super.generarJTextField(200, 120, 150, 20);
        this.add(this.nombreUsuario);
        this.contraseña = super.generarJPasswordField(200, 200, 150, 20);
        this.add(this.contraseña);
    }

    private void generarBotones() {
        this.botonAceptar = super.generarBoton("Aceptar", 300, 300, 150, 20);
        this.add(this.botonAceptar);
        this.botonAceptar.addActionListener(this);
        this.botonCancelar = super.generarBoton("Cancelar", 50, 300, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }

    private void generarTexto() {
        super.generarJLabel(this.textoContraseña, "Contraseña:", 20, 200, 150, 20);
        super.generarJLabelEncabezado(this.textoEncabezado, "Inicio de sesión", 150, 20, 250, 20);
        super.generarJLabel(this.textoUsuario, "Usuario:", 20, 120, 150, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
