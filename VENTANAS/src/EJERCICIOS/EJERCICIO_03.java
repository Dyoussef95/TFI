/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package EJERCICIOS;

//-- IMPORTAMOS LIBRERIAS QUE UTILIZAREMOS

import javax.swing.*;
import java.awt.*;

public class EJERCICIO_03 extends JFrame
{
    public JLabel INDIQUE_NOMBRE;
    public JTextField MI_NOMBRE;

    public EJERCICIO_03()
    {
        //-- CONFIGURAMOS LA VENTANA

        super("MI NOMBRE...");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-- LE AGREGAMOS UN DISTRIBUIDOR DE COMPONENTES

        FlowLayout DISTRIBUIDOR = new FlowLayout();
        this.setLayout(DISTRIBUIDOR);

        //-- AGREGAMOS TODOS LOS COMPONENTES

        this.INDIQUE_NOMBRE = new JLabel("ESCRIBA SU NOMBRE : ");
        this.add(this.INDIQUE_NOMBRE);

        this.MI_NOMBRE = new JTextField("SU NOMBRE AQUI...¡¡");
        this.add(this.MI_NOMBRE);
    }

    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_03 MI_INTERFAZ = new EJERCICIO_03();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}

