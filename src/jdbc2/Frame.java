/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {

    private static ConnectionFactory sqlconnection = new MySQLConnectionFactory("localhost", "barcos", 3306, "root", "2399");
    private static List<Socio> socios = new ArrayList();

    public Frame() {
        initComponents();

        tablaSocios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (tablaSocios.getSelectedRow() > -1) {
                    campoIDSocio.setText(String.valueOf(tablaSocios.getValueAt(tablaSocios.getSelectedRow(), 0)));
                    campoDNISocio.setText(String.valueOf(tablaSocios.getValueAt(tablaSocios.getSelectedRow(), 1)));
                    campoNombreSocio.setText((String) tablaSocios.getValueAt(tablaSocios.getSelectedRow(), 2));
                    SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
                    try {
                        Socio socio = ((Socio) sociodao.find((int) tablaSocios.getValueAt(tablaSocios.getSelectedRow(), 0)));
                        actualizarTablaBarcos(socio);
                    } catch (Exception e) {
                    }

                }
            }
        });

        tablaBarcos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (tablaBarcos.getSelectedRow() > -1) {

                    campoMatriculaBarco.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 0)));
                    campoNombreBarco.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 1)));
                    campoIDDuenioBarco1.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 4)));
                    campoAmarreBarco.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 2)));
                    campoCuotaBarco.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 3)));
                    campoMatriculaSalida.setText(String.valueOf(tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 0)));
                    int numeroActual = -1;

                    try {
                        actualizarTablaSalidas((int) tablaBarcos.getValueAt(tablaBarcos.getSelectedRow(), 0));
                    } catch (Exception e) {
                    }
                }
            }
        });
        tablaSalidas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (tablaSalidas.getSelectedRow() > -1) {

                    campoHoraSalida.setText(String.valueOf(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 0)));
                    campoFechaSalida.setText(String.valueOf(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 1)));
                    campoDestinoSalida.setText(String.valueOf(tablaSalidas.getValueAt(tablaSalidas.getSelectedRow(), 2)));

                    try {
                        actualizarTablaSalidas((int) tablaBarcos.getValueAt(tablaSocios.getSelectedRow(), 0));
                    } catch (Exception e) {
                    }
                }
            }
        });

        actualizarTablaSocios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        campBuscaroIDSocio = new javax.swing.JTextField();
        botonBuscarSocio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBarcos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoIDSocio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        botonGuardarSocio = new javax.swing.JButton();
        campoNombreSocio = new javax.swing.JTextField();
        campoDNISocio = new javax.swing.JTextField();
        botonGuardarBarco = new javax.swing.JButton();
        campoCuotaBarco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoNombreBarco = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        campoAmarreBarco = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        campoDestinoSalida = new javax.swing.JTextField();
        campoFechaSalida = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        botonGuardarSalida = new javax.swing.JButton();
        campoHoraSalida = new javax.swing.JTextField();
        campoMatriculaSalida = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        campoMatriculaBarco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoIDDuenioBarco1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        campoNombreNuevoSocio = new javax.swing.JTextField();
        campoDNINuevoSocio = new javax.swing.JTextField();
        botonGuardarNuevoSocio = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoIDNuevoSocio = new javax.swing.JTextField();
        botonBorrarSeleccionado = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(campBuscaroIDSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 280, -1));

        botonBuscarSocio.setText("Buscar");
        botonBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSocioActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSocios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 98));

        tablaBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Amarre", "Cuota $", "ID Dueño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaBarcos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, 93));

        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora Salida", "Fecha Salida", "Destino", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaSalidas);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 450, 95));

        jLabel1.setText("Nuevo Socio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jLabel2.setText("Nuevo Socio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jLabel3.setText("Nuevo Socio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, 20));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, -1, -1));

        jLabel11.setText("Editar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel12.setText("ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        campoIDSocio.setEditable(false);
        jPanel1.add(campoIDSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, -1));

        jLabel13.setText("DNI");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel14.setText("Nombre");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        botonGuardarSocio.setText("Guardar");
        botonGuardarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarSocioActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        jPanel1.add(campoNombreSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 110, -1));
        jPanel1.add(campoDNISocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, -1));

        botonGuardarBarco.setText("Guardar");
        botonGuardarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarBarcoActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 30));
        jPanel1.add(campoCuotaBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 30));

        jLabel15.setText("ID Dueño");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        jLabel16.setText("Nombre");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));
        jPanel1.add(campoNombreBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 30));

        jLabel17.setText("Matricula");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jLabel18.setText("Editar");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jLabel19.setText("Amarre");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));
        jPanel1.add(campoAmarreBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 30));

        jLabel21.setText("Destino");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 30));
        jPanel1.add(campoDestinoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 110, 30));
        jPanel1.add(campoFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 110, 30));

        jLabel22.setText("Fecha Salida");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, 20));

        jLabel23.setText("Hora Salida");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 20));

        jLabel24.setText("Editar");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 30));

        botonGuardarSalida.setText("Guardar");
        botonGuardarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 80, 30));
        jPanel1.add(campoHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 110, 30));

        campoMatriculaSalida.setEditable(false);
        jPanel1.add(campoMatriculaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 110, 30));

        jLabel20.setText("Cuota");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        campoMatriculaBarco.setEditable(false);
        jPanel1.add(campoMatriculaBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, 30));

        jLabel4.setText("Matricula Barco");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        campoIDDuenioBarco1.setEditable(false);
        jPanel1.add(campoIDDuenioBarco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 30));

        jLabel6.setText("DNI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabel25.setText("Nombre");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(campoNombreNuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 160, -1));
        jPanel1.add(campoDNINuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 160, -1));

        botonGuardarNuevoSocio.setText("Guardar");
        botonGuardarNuevoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarNuevoSocioActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarNuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));
        jPanel1.add(campoIDNuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 160, -1));

        botonBorrarSeleccionado.setText("Borrar Seleccionado");
        botonBorrarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarSeleccionadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrarSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSocioActionPerformed
        DefaultTableModel tM = new DefaultTableModel();
        SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
        Integer id = 0;
        List<Socio> lista = new ArrayList();
        List<Socio> listaFiltrada = new ArrayList();

        DefaultTableModel dm = (DefaultTableModel) tablaSocios.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            dm.removeRow(i);

        }

        try {
            id = Integer.parseInt(campBuscaroIDSocio.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es un ID válido.");
        }
        try {
            if (sociodao.find(id) == null) {
                JOptionPane.showMessageDialog(null, "No existe un cliente con este ID.");
                actualizarTablaSocios();
                return;
            }
        } catch (Exception e) {
        }

        try {
            lista = sociodao.getAll();

            for (Socio socio : lista) {
                if (sociodao.find(id) != null && socio.getId() == id) {
                    listaFiltrada.add(socio);
                    break;
                }
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < listaFiltrada.size(); i++) {
            int idSocio = listaFiltrada.get(i).getId();
            String nombre = listaFiltrada.get(i).getNombre();
            int dni = listaFiltrada.get(i).getDNI();

            tM = (DefaultTableModel) tablaSocios.getModel();
            Object[] obj = {idSocio, dni, nombre};
            tM.addRow(obj);

        }


    }//GEN-LAST:event_botonBuscarSocioActionPerformed

    private void botonGuardarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarSocioActionPerformed
        if(tablaSocios.getSelectedRow()!=(-1)){
        try {
            Socio socio = new Socio(Integer.parseInt(campoIDSocio.getText()), (String) campoNombreSocio.getText(), Integer.parseInt(campoDNISocio.getText()));
            SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
            sociodao.update(socio);

            int numeroFila = -1;
            for (int i = 0; i < tablaSocios.getRowCount(); i++) {
                if ((int) tablaSocios.getValueAt(i, 0) == socio.getId()) {
                    numeroFila = i;
                    break;
                }
            }

            tablaSocios.setRowSelectionInterval(numeroFila, numeroFila);
            actualizarTablaSocios();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    }//GEN-LAST:event_botonGuardarSocioActionPerformed

    private void botonGuardarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarBarcoActionPerformed
        if(tablaBarcos.getSelectedRow()!=(-1)){
        try {
            Barco barco = new Barco(Integer.parseInt(campoMatriculaSalida.getText()),
                    (String) campoNombreBarco.getText(),
                    Integer.parseInt(campoAmarreBarco.getText()),
                    Float.parseFloat(campoCuotaBarco.getText()),
                    Integer.parseInt(campoMatriculaSalida.getText()));

            BarcoDAO barcodao = new BarcoDAOImp1(sqlconnection);
            barcodao.update(barco);
            actualizarTablaSocios();
            int numeroFila = 0;
            for (int i = 0; i < tablaSocios.getRowCount(); i++) {
                if ((int) tablaSocios.getValueAt(i, 0) == barco.getNumeroMatricula()) {
                    numeroFila = (int) tablaSocios.getValueAt(i, 0);
                    break;
                }
            }

            tablaSocios.setRowSelectionInterval(numeroFila, numeroFila);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    }//GEN-LAST:event_botonGuardarBarcoActionPerformed

    private void botonGuardarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarSalidaActionPerformed
        if(tablaSalidas.getSelectedRow()!=(-1)){
        try {
            Salida salida = new Salida((String) campoHoraSalida.getText(), (String) campoFechaSalida.getText(),
                    (String) campoDestinoSalida.getText(), Integer.parseInt(campoMatriculaSalida.getText()));
            SalidaDAO salidadao = new SalidaDAOImp1(sqlconnection);
            salidadao.update(salida);
            actualizarTablaSocios();

        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    }//GEN-LAST:event_botonGuardarSalidaActionPerformed

    private void botonGuardarNuevoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarNuevoSocioActionPerformed
        Socio socio = new Socio(Integer.parseInt(campoIDNuevoSocio.getText()), (String) campoNombreNuevoSocio.getText(), Integer.parseInt(campoDNINuevoSocio.getText()));
        SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
        
        try {
            if (sociodao.find(socio.getId()) == null) {
                sociodao.add(socio);
            }else{
              JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaSocios();

    }//GEN-LAST:event_botonGuardarNuevoSocioActionPerformed

    private void botonBorrarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarSeleccionadoActionPerformed
      if(tablaSocios.getSelectedRow()!=(-1)){
              Socio socio = new Socio(Integer.parseInt(campoIDSocio.getText()), (String) campoNombreSocio.getText(), 
                      Integer.parseInt(campoDNISocio.getText()));
        SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
        
        try {
            if (sociodao.find(socio.getId()) != null) {
                sociodao.delete(socio.getId());
            }else{
              JOptionPane.showMessageDialog(null, "Este usuario no existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaSocios();
      
      
      }
    }//GEN-LAST:event_botonBorrarSeleccionadoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Frame().setVisible(true);

            }
        });

    }

    public void actualizarTablaSocios() {

        DefaultTableModel tM = new DefaultTableModel();
        SocioDAO sociodao = new SocioDAOImp1(sqlconnection);
        JTable tabla = null;

        DefaultTableModel dm = (DefaultTableModel) tablaSocios.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            dm.removeRow(i);

        }

        try {
            List<Socio> lista = sociodao.getAll();

            for (int i = 0; i < lista.size(); i++) {

                tabla = tablaSocios;

                tM = (DefaultTableModel) tabla.getModel();
                Object[] obj = {lista.get(i).getId(), lista.get(i).getDNI(), lista.get(i).getNombre()};
                tM.addRow(obj);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void actualizarTablaBarcos(Socio socio) {
        DefaultTableModel tM = new DefaultTableModel();
        BarcoDAO barcodao = new BarcoDAOImp1(sqlconnection);

        // JTable tabla = null; 
        DefaultTableModel dm = (DefaultTableModel) tablaBarcos.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            dm.removeRow(i);

        }

        try {
            List<Barco> lista = barcodao.getAll();
            List<Barco> listaFiltrada = new ArrayList();

            for (Barco barco : lista) {
                if (barcodao.find(socio.getId()) != null
                        && barco.getIdDuenio() == Integer.parseInt(campoIDSocio.getText())
                        && !listaFiltrada.contains(barco)) {
                    listaFiltrada.add(barco);
                }

            }

            for (int i = 0; i < listaFiltrada.size(); i++) {

                tM = (DefaultTableModel) tablaBarcos.getModel();
                Object[] obj = {listaFiltrada.get(i).getNumeroMatricula(),
                    listaFiltrada.get(i).getNombre(),
                    listaFiltrada.get(i).getAmarre(), listaFiltrada.get(i).getCuota(),
                    listaFiltrada.get(i).getIdDuenio()};

                tM.addRow(obj);

            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void actualizarTablaSalidas(int numeroMatricula) {
        DefaultTableModel tM = new DefaultTableModel();
        SalidaDAO salidadao = new SalidaDAOImp1(sqlconnection);

        JTable tabla = null;

        DefaultTableModel dm = (DefaultTableModel) tablaSalidas.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            dm.removeRow(i);

        }

        try {
            List<Salida> lista = salidadao.getAll();
            List<Salida> listafiltrada = new ArrayList();

            for (Salida salida : lista) {
                if (salida.getMatriculaBarco() == Integer.parseInt(campoMatriculaSalida.getText())) {
                    listafiltrada.add(salida);
                }

            }

            for (int i = 0; i < listafiltrada.size(); i++) {

                if (salidadao.find(numeroMatricula) != null) {

                    tabla = tablaSalidas;

                    tM = (DefaultTableModel) tabla.getModel();
                    Object[] obj = {listafiltrada.get(i).getHoraSalida(), listafiltrada.get(i).getFechaSalida(),
                        listafiltrada.get(i).getDestino(), listafiltrada.get(i).getMatriculaBarco()};
                    tM.addRow(obj);
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarSeleccionado;
    private javax.swing.JButton botonBuscarSocio;
    private javax.swing.JButton botonGuardarBarco;
    private javax.swing.JButton botonGuardarNuevoSocio;
    private javax.swing.JButton botonGuardarSalida;
    private javax.swing.JButton botonGuardarSocio;
    private javax.swing.JTextField campBuscaroIDSocio;
    private javax.swing.JTextField campoAmarreBarco;
    private javax.swing.JTextField campoCuotaBarco;
    private javax.swing.JTextField campoDNINuevoSocio;
    private javax.swing.JTextField campoDNISocio;
    private javax.swing.JTextField campoDestinoSalida;
    private javax.swing.JTextField campoFechaSalida;
    private javax.swing.JTextField campoHoraSalida;
    private javax.swing.JTextField campoIDDuenioBarco1;
    private javax.swing.JTextField campoIDNuevoSocio;
    private javax.swing.JTextField campoIDSocio;
    private javax.swing.JTextField campoMatriculaBarco;
    private javax.swing.JTextField campoMatriculaSalida;
    private javax.swing.JTextField campoNombreBarco;
    private javax.swing.JTextField campoNombreNuevoSocio;
    private javax.swing.JTextField campoNombreSocio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaBarcos;
    private javax.swing.JTable tablaSalidas;
    private javax.swing.JTable tablaSocios;
    // End of variables declaration//GEN-END:variables

}
