/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.datos.logica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author kevin
 */
public class DialogAcerca extends JDialog{
    Container c;
    JLabel labelTitulo,labelImagen;
    TextArea textAcerca;
    
    public DialogAcerca(java.awt.Frame parent, boolean modal){
        super (parent, modal);
        initComponents();
    }

    private void initComponents() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        labelTitulo = new JLabel("Agenda Personal",SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Arial Black", 1, 20));
        labelTitulo.setBounds(10, 10, 280, 50);
        c.add(labelTitulo);
        labelImagen = new JLabel();
        labelImagen.setIcon(new ImageIcon(getClass().getClassLoader().
                            getResource("preloader.png")));
        labelImagen.setBounds(2, 2, 50, 80);
        c.add(labelImagen);
        textAcerca.setColumns(50);
        textAcerca.setRows(5);
        textAcerca.setText("Universidad Distrital\\nIngenieria de Sistemas\\nProgramación \n" +
                            "Orientada a Objetos\\n\\nEjemplo de acceso a datos");
        textAcerca.setBounds(70, 50, 220, 100);
        textAcerca.setEditable(false);
        c.add(textAcerca);
        
        pack();
        setSize(300,200);
        
    }
}
