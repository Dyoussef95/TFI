/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EJERCICIOS;

//-- IMPORTAMOS LIBRERIAS QUE UTILIZAREMOS

import javax.swing.*;
import java.awt.*;
import javax.accessibility.AccessibleRole;

public class EJERCICIO_05 extends JFrame
{
    //-- DECLARAMOS VARIABLES SWING QUE UTILIZAREMOS

    public JTextArea MI_CAJA_TEXTO;
    public JLabel MI_TEXTO;
    public JComboBox LISTA_DESPLEGABLE;
    public JLayeredPane panel;

    public EJERCICIO_05()
    {
        //-- CONFIGURAMOS LA VENTANA

        super("MI AREA DE TEXTO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-- AGREGAMOS UN DISTRIBUIDOR DE COMPONENTES

        BorderLayout DISTRIBUCION = new BorderLayout();
        this.setLayout(DISTRIBUCION);

        //-- AGREGAMOS TODOS LOS COMPONENTES

        this.MI_TEXTO = new JLabel();
        this.MI_TEXTO.setText("ESCRIBA LO QUE SEA EN LA CAJA DE TEXTO");
        this.add(this.MI_TEXTO,BorderLayout.WEST);

        /*this.MI_CAJA_TEXTO = new JTextArea(10,20);
        this.add(MI_CAJA_TEXTO,BorderLayout.CENTER);*/
        this.panel = new JLayeredPane();
        panel.setBackground(Color.yellow);
        panel.setOpaque(true);
        this.add(panel,BorderLayout.CENTER);

        this.LISTA_DESPLEGABLE = new JComboBox();
        this.LISTA_DESPLEGABLE.addItem("BANDAS DE ROCK");
        this.LISTA_DESPLEGABLE.addItem("GUN'S ROSES");
        this.LISTA_DESPLEGABLE.addItem("PINK FLOYD");
        this.LISTA_DESPLEGABLE.addItem("METALLICA");
        this.add(this.LISTA_DESPLEGABLE,BorderLayout.EAST);
    }

    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_05 MI_INTERFAZ = new EJERCICIO_05();

        //-- EL METODO PACK SIRVE PARA DAR TAMAÑO A TODOS LOS COMPONENTES POR DEFECTO
        //-- O TAMBIEN SE LE PUEDE HACER CON MI_INTERFAZ.setSize(600,400) U OTRO TAMAÑO;

        MI_INTERFAZ.pack();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}
