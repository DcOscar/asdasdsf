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

public class MenuAdministrador extends Ventana {

    private JButton botonCrearVendedor, botonAgregarProducto, botonRemoverProducto;
    private JButton botonMostrarInventario, botonEditarStockProducto, botonEditarPrecioProducto, botonEstadisticaVendedores, botonCerrarSesion;
    private JLabel textoEncabezado1, textoEncabezado2, textoSubtitulo;

    public MenuAdministrador() {
        super("SIVU", 500, 400);
        inicializarVentana();

    }

    private void inicializarVentana() {
              generarBotonCrearVendedor();
        generarBotonAgregarProducto();
        generarBotonQuitarProducto();
        generarBotonMostrarInventario();
        generarBotonEditarStockProducto();
        generarBotonEditarPrecioProducto();
        generarBotonEstadisticaVendedores();
        generarBotonCerrarSesion();
        generarLabelEncabezado();
        generarLabelSubtitulo();
        repaint();

    }

 

    private void generarBotonCrearVendedor() {
        this.botonCrearVendedor = super.generarBoton("Crear usuario Vendedor", 30, 120, 300, 20);
        this.add(this.botonCrearVendedor);
        this.botonCrearVendedor.addActionListener(this);

    }

    private void generarBotonAgregarProducto() {
        this.botonAgregarProducto = super.generarBoton("Agregar nuevo producto", 30, 150, 300, 20);
        this.add(this.botonAgregarProducto);
        this.botonAgregarProducto.addActionListener(this);

    }

    private void generarBotonQuitarProducto() {
        this.botonRemoverProducto = super.generarBoton("Descontinuar producto", 30, 180, 300, 20);
        this.add(this.botonRemoverProducto);
        this.botonRemoverProducto.addActionListener(this);

    }

    private void generarBotonMostrarInventario() {
        this.botonMostrarInventario = super.generarBoton("Mostrar inventario", 30, 210, 300, 20);
        this.add(this.botonMostrarInventario);
        this.botonMostrarInventario.addActionListener(this);

    }

    private void generarBotonEditarStockProducto() {
        this.botonEditarStockProducto = super.generarBoton("Editar stock de producto", 30, 240, 300, 20);
        this.add(this.botonEditarStockProducto);
        this.botonEditarStockProducto.addActionListener(this);
    }

    private void generarBotonEditarPrecioProducto() {
        this.botonEditarPrecioProducto = super.generarBoton("Editar precio unitario de producto", 30, 270, 300, 20);
        this.add(this.botonEditarPrecioProducto);
        this.botonEditarPrecioProducto.addActionListener(this);

    }

    private void generarBotonCerrarSesion() {
        this.botonCerrarSesion = super.generarBoton("Cerrar Sesión", 300, 330, 150, 20);
        this.add(this.botonCerrarSesion);
        this.botonCerrarSesion.addActionListener(this);

    }

    private void generarBotonEstadisticaVendedores() {
        this.botonEstadisticaVendedores = super.generarBoton("Estadística vendedores", 30, 300, 300, 20);
        this.add(this.botonEstadisticaVendedores);
        this.botonEstadisticaVendedores.addActionListener(this);

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
