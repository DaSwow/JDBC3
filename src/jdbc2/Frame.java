/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        campoIDSocio = new javax.swing.JTextField();
        botonBuscarSocio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        buscarBarcos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBarcos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        botonSocios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonBuscarSalidas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        botonBorrarBarco = new javax.swing.JButton();
        campoBorrarBarco = new javax.swing.JTextField();
        botonBorrarBSocio = new javax.swing.JButton();
        campoBorrarSocio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoBorrarSalida = new javax.swing.JTextField();
        botonBorrarSalida = new javax.swing.JButton();

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

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonBuscarSocio.setText("Buscar");
        botonBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSocioActionPerformed(evt);
            }
        });

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaSocios);

        jLabel4.setText("Barcos de este socio");

        buscarBarcos.setText("Buscar");
        buscarBarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBarcosActionPerformed(evt);
            }
        });

        tablaBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Amarre", "Cuota $"
            }
        ));
        jScrollPane3.setViewportView(tablaBarcos);

        jLabel5.setText("Socio");

        botonSocios.setText("Buscar");
        botonSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSociosActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar todos los socios");

        jLabel7.setText("Salidas de este Barco");

        botonBuscarSalidas.setText("Buscar");
        botonBuscarSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSalidasActionPerformed(evt);
            }
        });

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora Salida", "Fecha Salida", "Destino", "Barco "
            }
        ));
        jScrollPane4.setViewportView(tablaSalidas);

        jLabel8.setText("Borrar Barco");

        botonBorrarBarco.setText("Borrar");
        botonBorrarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarBarcoActionPerformed(evt);
            }
        });

        botonBorrarBSocio.setText("Borrar");
        botonBorrarBSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarBSocioActionPerformed(evt);
            }
        });

        jLabel9.setText("Borrar Salida");

        jLabel10.setText("Borrar Salida");

        botonBorrarSalida.setText("Borrar");
        botonBorrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoIDSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(botonBuscarSocio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscarSalidas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(buscarBarcos))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonSocios))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 52, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(campoBorrarBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(botonBorrarBarco))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(campoBorrarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addComponent(botonBorrarBSocio))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(campoBorrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addComponent(botonBorrarSalida))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSocios)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarSocio)
                    .addComponent(campoIDSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarBSocio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBorrarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(buscarBarcos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBorrarBarco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoBorrarBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(botonBuscarSalidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarSalida)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBorrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jButton2)
                .addGap(313, 313, 313))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBarcosActionPerformed

        
        DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaBarcos.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("  SELECT * FROM `barcos`.`barco`;");
            
            while (resultSet.next()) {
                String NumeroMatricula=resultSet.getString("NumeroMatricula");
                String Nombre = resultSet.getString("Nombre");
                String NumeroAmarre = resultSet.getString("NumeroAmarre");
                String Cuota = resultSet.getString("Cuota");
                
                tM = (DefaultTableModel) tablaBarcos.getModel();
                Object[] obj = {NumeroMatricula,Nombre, NumeroAmarre, Cuota};
                tM.addRow(obj);

            }

            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
        
        
    }//GEN-LAST:event_buscarBarcosActionPerformed

    private void botonBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSocioActionPerformed
            DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaSocios.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
           try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            Integer id=0;
            try{
             id = Integer.parseInt(campoIDSocio.getText());}catch(Exception e){
                System.out.println("Llene el campo de ID.");
            
            }
            resultSet = statement.executeQuery("  SELECT * FROM `barcos`.`socio` WHERE idSocio = "+id+";");
            
            while (resultSet.next()) {
                String idSocio=resultSet.getString("idSocio");
                String nombre = resultSet.getString("nombre");
                String dni = resultSet.getString("dni");

                tM = (DefaultTableModel) tablaSocios.getModel();
                Object[] obj = {idSocio,nombre, dni};
                tM.addRow(obj);

            }
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
    }//GEN-LAST:event_botonBuscarSocioActionPerformed

    private void botonSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSociosActionPerformed
           DefaultTableModel dm = (DefaultTableModel) tablaSocios.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        actualizarTabla();
    }//GEN-LAST:event_botonSociosActionPerformed

    private void botonBuscarSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSalidasActionPerformed
       
           
        DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaSalidas.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("  SELECT * FROM `barcos`.`salida`;");
            
            while (resultSet.next()) {
                String HoraSalida=resultSet.getString("HoraSalida");
                String FechaSalida = resultSet.getString("FechaSalida");
                String Destino = resultSet.getString("Destino");
                String Barco = resultSet.getString("NumeroMatricula");
                
                tM = (DefaultTableModel) tablaSalidas.getModel();
                Object[] obj = {HoraSalida,FechaSalida, Destino, Barco};
                tM.addRow(obj);

            }

            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_botonBuscarSalidasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonBorrarBSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarBSocioActionPerformed
          DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaSalidas.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            Integer id=0;
            try{
                id=Integer.parseInt(campoBorrarSocio.getText());
            }catch(Exception e){
  
                    }
            resultSet = statement.executeQuery("  DELETE  FROM `barcos`.`socio` WHERE idSocio="+id+";");
            
       actualizarTabla();

            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
        
        
        
    }//GEN-LAST:event_botonBorrarBSocioActionPerformed

    private void botonBorrarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarBarcoActionPerformed
        DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaSalidas.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
               Integer id=0;
            try{
                id=Integer.parseInt(campoBorrarSalida.getText());
            }catch(Exception e){
  
                    }
            resultSet = statement.executeQuery("  DELETE  FROM `barcos`.`barco` WHERE MatriculaBarco="+id+";");
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
        
        
    }//GEN-LAST:event_botonBorrarBarcoActionPerformed

    private void botonBorrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarSalidaActionPerformed
        DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
        
         DefaultTableModel dm = (DefaultTableModel) tablaSalidas.getModel();
            int rowCount = dm.getRowCount();
         for (int i = rowCount - 1; i >= 0; i--) {
                
                    dm.removeRow(i);
                    break;
                }
            
        
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            Integer id=0;
            try{
                id=Integer.parseInt(campoBorrarSalida.getText());
            }catch(Exception e){
  
                    }
            resultSet = statement.executeQuery("  DELETE  FROM `barcos`.`salida` WHERE MatriculaBarco="+id+";");
            


            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }
        
        
        
    }//GEN-LAST:event_botonBorrarSalidaActionPerformed

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
        actualizarTabla();
        
        
    }

    
    public static void actualizarTabla(){
  
        DefaultTableModel tM = new DefaultTableModel();
            
        String user = "root";
        String password = "2399";
        final String connectionString = 
                "jdbc:mysql://localhost:3306/barcos?serverTimezone=UTC";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
             
      
        
        try {
            connection = DriverManager
                    .getConnection(connectionString,
                            user,
                            password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("  SELECT * FROM `barcos`.`socio`;");
            
            while (resultSet.next()) {
                String idSocio=resultSet.getString("idSocio");
                String nombre = resultSet.getString("nombre");
                String dni = resultSet.getString("dni");

                tM = (DefaultTableModel) tablaSocios.getModel();
                Object[] obj = {idSocio,nombre, dni};
                tM.addRow(obj);

            }
            
            
            
            
            
   
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Clean up
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {}
            }
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarBSocio;
    private javax.swing.JButton botonBorrarBarco;
    private javax.swing.JButton botonBorrarSalida;
    private javax.swing.JButton botonBuscarSalidas;
    private javax.swing.JButton botonBuscarSocio;
    private javax.swing.JButton botonSocios;
    private javax.swing.JButton buscarBarcos;
    private javax.swing.JTextField campoBorrarBarco;
    private javax.swing.JTextField campoBorrarSalida;
    private javax.swing.JTextField campoBorrarSocio;
    private javax.swing.JTextField campoIDSocio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaBarcos;
    private javax.swing.JTable tablaSalidas;
    private static javax.swing.JTable tablaSocios;
    // End of variables declaration//GEN-END:variables
}
