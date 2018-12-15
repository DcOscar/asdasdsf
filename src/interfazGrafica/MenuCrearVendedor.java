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
public class MenuCrearVendedor extends Ventana {

    private JTextField nombreUsuario;
    private JPasswordField contraseña, confirmarContraseña;
    private JButton botonAceptar, botonCancelar;
    private JLabel textoEncabezado, textoNombreUsuario, textoContraseña, textoConfirmarContraseña;

    public MenuCrearVendedor() {
        super("SIVU", 500, 400);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarBotones();
        generarCamposTexto();
        generarLabels();
        repaint();
    }

    private void generarBotones() {
        this.botonAceptar = super.generarBoton("Aceptar", 300, 300, 150, 20);
        this.add(this.botonAceptar);
        this.botonAceptar.addActionListener(this);

        this.botonCancelar = super.generarBoton("Cancelar", 50, 300, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }

    private void generarCamposTexto() {
        this.nombreUsuario = super.generarJTextField(250, 100, 190, 20);
        this.add(this.nombreUsuario);
        this.contraseña = super.generarJPasswordField(250, 170, 190, 20);
        this.add(this.contraseña);
        this.confirmarContraseña = super.generarJPasswordField(250, 240, 190, 20);
        this.add(this.confirmarContraseña);
    }

    private void generarLabels() {
        super.generarJLabelEncabezado(this.textoEncabezado, "Crear Vendedor", 20, 20, 250, 40);
        super.generarJLabel(this.textoNombreUsuario, "Nombre de Usuario:", 20, 100, 200, 20);
        super.generarJLabel(this.textoContraseña, "Contraseña:", 20, 170, 200, 20);
        super.generarJLabel(this.textoConfirmarContraseña, "Confirmar contraseña:", 20, 240, 200, 20);
    }
}
