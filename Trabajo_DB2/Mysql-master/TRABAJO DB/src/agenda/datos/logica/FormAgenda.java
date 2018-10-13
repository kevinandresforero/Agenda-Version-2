/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.datos.logica;

import agenda.datos.DBContactos;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class FormAgenda implements ActionListener{
    JFrame frame;
    JPanel panel;
    JMenuBar menuBar;
    JMenu menu, subMenu;
    JMenuItem meniItem;
    JScrollPane scrollPanel;
    DefaultTableModel modeloTabla;
    JTable tablaContactos;
    JTabbedPane pestana;
    Container panelInformacion, panelCitas;
    JLabel labelId, labelNombre, labelApellido, labelTelefonoDomicilio,
            labeltelefonoOficina, labelDireccionDomicilio, labelDireccionOficina,
            labelCelular, labelCorreo;
    JTextField textId, textNombre, textApellido, textTelefonoDomicilio, 
               textTelefonoOficina, textDireccionDomicilio, textDireccionOficina,
               textCelular, textCorreo ;
    
    
    JButton botonNuevoContacto, botonGuardarContacto, botonEditarContacto, 
            BotonBorrarContacto ;
    
    DBContactos dbc = new DBContactos();
    Contacto[] contactos;
    int estado = 0;
    int fila;
    public FormAgenda() {
        initComponents();
    }

    private void initComponents() {
        frame = new JFrame("Agenda Contactos");
        
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Opcines");
        menuBar.add(menu);
        JMenuItem MenuItem = new JMenuItem("Acerca de ...");
        MenuItem.addActionListener(this);
        menu.add(MenuItem);
        
        panelInformacion = new JPanel(null);
        panelInformacion.setLayout(null);
        panelCitas = new JPanel(null);
        panelCitas.setLayout(null);
        pestana = new JTabbedPane();
        pestana.addTab("Información de contacto", panelInformacion);
        pestana.addTab("Citas", panelCitas);
        
        int y = 5;
        int x = 10;
        int labelAncho = 150;
        int labelAlto = 20;
        int textAncho = 200;
        int textAlto = 20;
        labelId = new JLabel("Id");
        labelId.setBounds(x, y, 20, 20);
        panelInformacion.add(labelId);
            
        textId = new JTextField();
        textId.setBounds(x+30, y, 50, 20);
        panelInformacion.add(textId);
        
        y += 30;
        labelNombre =   new JLabel("Nombre",SwingConstants.RIGHT);
        labelNombre.setBounds(x, y, labelAncho, labelAlto);
        panelInformacion.add(textNombre);
        
        textNombre = new JTextField();
        textNombre.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textNombre);
        
        labelApellido = new JLabel("Apellido",SwingConstants.RIGHT);
        labelApellido.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelApellido);
        
        textApellido = new JTextField();
        textApellido.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textApellido);
        
        
        y+=30;
        labelTelefonoDomicilio = new JLabel("Telefono Domicilio",SwingConstants.RIGHT);
        labelTelefonoDomicilio.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelTelefonoDomicilio);
        
        textTelefonoDomicilio = new JTextField();
        textTelefonoDomicilio.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textTelefonoDomicilio);
        
        labeltelefonoOficina = new JLabel("Telefono Oficina",SwingConstants.RIGHT);
        labeltelefonoOficina.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labeltelefonoOficina);
        
        textTelefonoOficina = new JTextField();
        textTelefonoOficina.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textTelefonoOficina);
        
        y+=30;
        labelDireccionDomicilio = new JLabel("Dirreción Domicilio",SwingConstants.RIGHT);
        labelDireccionDomicilio.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelDireccionDomicilio);
        
        textDireccionDomicilio = new JTextField();
        textDireccionDomicilio.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textDireccionDomicilio);
        
        labelDireccionOficina = new JLabel("Dirección Oficina",SwingConstants.RIGHT);
        labelDireccionOficina.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelDireccionOficina);
        
        textDireccionOficina = new JTextField();
        textDireccionOficina.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textDireccionOficina);
        
        y+=30;
        labelCelular = new JLabel("Celular",SwingConstants.RIGHT);
        labelCelular.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelCelular);
        
        textCelular = new JTextField();
        textCelular.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textCelular);
        
        labelCorreo = new JLabel("Correo",SwingConstants.RIGHT);
        labelCorreo.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelCorreo);
        
        textCorreo = new JTextField();
        textCorreo.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textCorreo);
        
        y+=60;
        botonNuevoContacto = new JButton("Nuevo Contacto");
        botonNuevoContacto.setBounds(x,y,labelAncho,50);
        panelInformacion.add(botonNuevoContacto);
        botonNuevoContacto.addActionListener(this);
        
        botonGuardarContacto = new JButton("Guardar Contacto");
        botonGuardarContacto.setBounds(x+200,y,labelAncho,50);
        panelInformacion.add(botonGuardarContacto);
        botonGuardarContacto.addActionListener(this);
        
        botonEditarContacto = new JButton("Editar Contacto");
        botonEditarContacto.setBounds(x+400,y,labelAncho,50);
        panelInformacion.add(botonEditarContacto);
        botonEditarContacto.addActionListener(this);
        
        BotonBorrarContacto = new JButton("Borrar Contacto");
        BotonBorrarContacto.setBounds(x+600,y,labelAncho,50);
        panelInformacion.add(BotonBorrarContacto);
        BotonBorrarContacto.addActionListener(this);
        contactos = dbc.getContactos();
        
        Object[][] data = new Object[contactos.length][5];
        for (int c=0;c<contactos.length;c++){
            data[c][0]=contactos[c].getId();
            data[c][1]=contactos[c].getNombre();
            data[c][2]=contactos[c].getApellido();
            data[c][3]=contactos[c].getCelular();
            data[c][4]=contactos[c].getCorreo(); 
        }
        
        String[] columNames = {"id","nombres","apellidos","celular","correo"};
        
        modeloTabla= new DefaultTableModel(data, columNames);
        
        tablaContactos = new JTable(modeloTabla);
        tablaContactos.setPreferredScrollableViewportSize(new Dimension(500, 150));
        
        scrollPanel = new JScrollPane(tablaContactos);
        
        tablaContactos.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                fila = tablaContactos.rowAtPoint(e.getPoint());
                int columna = tablaContactos.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)){
                    textId.setText(String.valueOf(tablaContactos.getValueAt(fila,0)));
                    for (Contacto contacto : contactos) {
                        if (String.valueOf(contacto.getId()).equals(String.
                                valueOf(tablaContactos.getValueAt(fila, 0)))) {
                            textNombre.setText(contacto.getNombre());
                            textApellido.setText(contacto.getApellido());
                            textTelefonoDomicilio.setText(contacto.getTelefonoDomicilio());
                            textTelefonoOficina.setText(contacto.getTelefonoOficina());
                            textDireccionDomicilio.setText(contacto.getDireccionResidencia());
                            textDireccionOficina.setText(contacto.getDireccionTrabajo());
                            textCelular.setText(contacto.getCelular());
                            textCorreo.setText(contacto.getCorreo());
                        }
                    }
                    estado = 2;
                    alterarEstado();
                }
            }
        });
        frame.getContentPane().add(scrollPanel,BorderLayout.NORTH);
        frame.getContentPane().add(pestana,BorderLayout.CENTER);
        frame.pack();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setResizable(false);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setVisible(true);
        alterarEstado();
    }
    
        public void alterarEstado(){
                    switch(this.estado){
            case 0://estado por defecto 
                botonNuevoContacto.setEnabled(true);
                BotonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(false);
                textId.setEditable(false);
                textNombre.setEditable(false);
                textApellido.setEditable(false);
                textTelefonoDomicilio.setEditable(false);
                textTelefonoOficina.setEditable(false);
                textDireccionDomicilio.setEditable(false);
                textDireccionOficina.setEditable(false);
                textCorreo.setEditable(false);
                textCelular.setEditable(false);
                break;
            case 1://estado para un nuevo contacto
                botonNuevoContacto.setEnabled(false);
                BotonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(true);
                textId.setEditable(false);
                textNombre.setEditable(true);
                textApellido.setEditable(true);
                textTelefonoDomicilio.setEditable(true);
                textTelefonoOficina.setEditable(true);
                textDireccionDomicilio.setEditable(true);
                textDireccionOficina.setEditable(true);
                textCorreo.setEditable(true);
                textCelular.setEditable(true);
                break;
            case 2://estado de carga de un contacto
                botonNuevoContacto.setEnabled(false);
                BotonBorrarContacto.setEnabled(true);
                botonEditarContacto.setEnabled(true);
                botonGuardarContacto.setEnabled(false);
                textId.setEditable(false);
                textNombre.setEditable(false);
                textApellido.setEditable(false);
                textTelefonoDomicilio.setEditable(false);
                textTelefonoOficina.setEditable(false);
                textDireccionDomicilio.setEditable(false);
                textDireccionOficina.setEditable(false);
                textCorreo.setEditable(false);
                textCelular.setEditable(false);
                break;
            case 3://estado para editar un contacto
                botonNuevoContacto.setEnabled(false);
                BotonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(true);
                textId.setEditable(false);
                textNombre.setEditable(true);
                textApellido.setEditable(true);
                textTelefonoDomicilio.setEditable(true);
                textTelefonoOficina.setEditable(true);
                textDireccionDomicilio.setEditable(true);
                textDireccionOficina.setEditable(true);
                textCorreo.setEditable(true);
                textCelular.setEditable(true);
                break;
        }
    }
        
    public void limpiarCampos(){
        textId.setText("");
        textNombre.setText("");
        textApellido.setText("");
        textTelefonoDomicilio.setText("");
        textTelefonoOficina.setText("");
        textDireccionDomicilio.setText("");
        textDireccionOficina.setText("");
        textCorreo.setText("");
        textCelular.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        System.out.println(accion);
        if(accion.equals("Salir")){
            System.exit(-1);
        }
        if(accion.equals("Acerca de ...")){
        DialogAcerca a = new DialogAcerca(null,false);
        a.setVisible(true);
        }
                if(accion.equals("Nuevo Contacto")){
            limpiarCampos();
            this.estado=1;
        }
        if(accion.equals("Editar Contacto")){
            this.estado=3;
        }
        if(accion.equals("Guardar Contacto")){
            if(this.estado==1){
                Contacto c = new Contacto();
                c.setNombre(textNombre.getText());
                c.setApellido(textApellido.getText());
                c.setTelefonoDomicilio(textTelefonoDomicilio.getText());
                c.setTelefonoOficina(textTelefonoOficina.getText());
                c.setDireccionResidencia(textDireccionDomicilio.getText());
                c.setDireccionTrabajo(textDireccionOficina.getText());
                c.setCorreo(textCorreo.getText());
                c.setCelular(textCelular.getText());                
                int r = dbc.insertarContacto(c);
                if(r>0){
                    Object[] newRow={r,c.getNombre(),c.getApellido(),c.getCelular(),c.getCorreo()};
                    modeloTabla.addRow(newRow);
                    JOptionPane.showMessageDialog(null, "Contacto agregado");
                }
            }else if(this.estado==3){
                                Contacto c = new Contacto();
                c.setId(Integer.parseInt(textId.getText(),10));
                c.setNombre(textNombre.getText());
                c.setApellido(textApellido.getText());
                c.setTelefonoDomicilio(textTelefonoDomicilio.getText());
                c.setTelefonoOficina(textTelefonoOficina.getText());
                c.setDireccionResidencia(textDireccionDomicilio.getText());
                c.setDireccionTrabajo(textDireccionOficina.getText());
                c.setCorreo(textCorreo.getText());
                c.setCelular(textCelular.getText());
                int r = dbc.actualizarContacto(c);
                if(r>0){
                    modeloTabla.setValueAt(c.getNombre(), fila, 1);
                    modeloTabla.setValueAt(c.getApellido(), fila, 2);
                    modeloTabla.setValueAt(c.getCelular(), fila, 3);
                    modeloTabla.setValueAt(c.getCorreo(), fila, 4);
                    JOptionPane.showMessageDialog(null, "Contacto actualizado");
                }
            }
            contactos = dbc.getContactos();
            limpiarCampos();
            this.estado=0;
            
        }
                if(accion.equals("Borrar Contacto")){
            Contacto c = new Contacto();
            c.setId(Integer.parseInt(textId.getText(),10));
            int r = dbc.borrarContacto(c);
            if(r>0){
                modeloTabla.removeRow(fila);
                JOptionPane.showMessageDialog(null, "Contacto borrado");
                limpiarCampos();
            }
            contactos = dbc.getContactos();
            this.estado=0;         
        }
        alterarEstado();
    }
}


    
    
