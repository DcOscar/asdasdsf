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

public class MenuVendedorIniciarDia extends Ventana {

    private JButton botonVenta, botonInventario, botonEstadistica, botonIniciarDia, botonCerrarSesion;
    private JLabel textoEncabezado1, textoEncabezado2, textoSubtitulo;

    public MenuVendedorIniciarDia() {
        super("SIVU", 500, 400);
        inicializarVentana();

    }

    private void inicializarVentana() {
        generarBotonCrearVenta();
        generarBotonInventario();
        generarBotonEstadistica();
        generarBotonIniciarDia();
        generarBotonCerrarSesion();
        generarLabelEncabezado();
        generarLabelSubtitulo();
        repaint();

    }

    private void generarBotonCrearVenta() {
        this.botonVenta = super.generarBoton("Realizar venta", 30, 120, 300, 20);
        this.add(this.botonVenta);
        this.botonVenta.addActionListener(this);

    }

    private void generarBotonInventario() {
        this.botonInventario = super.generarBoton("Mostrar inventario", 30, 160, 300, 20);
        this.add(this.botonInventario);
        this.botonInventario.addActionListener(this);

    }

    private void generarBotonEstadistica() {
        this.botonEstadistica = super.generarBoton("Estadística", 30, 200, 300, 20);
        this.add(this.botonEstadistica);
        this.botonEstadistica.addActionListener(this);

    }

    private void generarBotonIniciarDia() {
        this.botonIniciarDia = super.generarBoton("Iniciar Día", 30, 240, 300, 20);
        this.add(this.botonIniciarDia);
        this.botonIniciarDia.addActionListener(this);

    }

    private void generarBotonCerrarSesion() {
        this.botonCerrarSesion = super.generarBoton("Cerrar Sesión", 300, 330, 150, 20);
        this.add(this.botonCerrarSesion);
        this.botonCerrarSesion.addActionListener(this);
    }

    private void generarLabelEncabezado() {
        super.generarJLabelEncabezado(this.textoEncabezado1, "Bienvenidos al Sistema de inventario", 50, 20, 400, 20);
        super.generarJLabelEncabezado(this.textoEncabezado2, "y Ventas automatizado S.I.V.U", 50, 40, 400, 20);

    }

    private void generarLabelSubtitulo() {
        super.generarJLabel(this.textoSubtitulo, "Seleccione que acción desea realizar:", 50, 70, 400, 40);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}