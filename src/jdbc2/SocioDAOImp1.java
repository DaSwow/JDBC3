/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carls
 */
public class SocioDAOImp1 implements SocioDAO {

    private final ConnectionFactory connectionFactory;

    public SocioDAOImp1(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Socio find(int id) throws Exception {
        final String sql = "SELECT idSocio, nombre, dni "
                + "FROM socio WHERE idSocio = "+id;

        try (Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
          // statement.setInt(0, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    return new Socio(
                            resultSet.getInt("idSocio"),
                            resultSet.getString("nombre"),
                            resultSet.getInt("dni"));
                }

                return null;
            }
        }
        
        
        
        
    }

    @Override
    public List<Socio> getAll() throws SQLException {

        final String sql = "SELECT idSocio, nombre, dni "
                + "FROM socio ";
        List<Socio> lista = new ArrayList();

        try (Connection  connection = this.connectionFactory.getConnection();
             Statement    statement = connection.prepareStatement(sql);
                ){
           try(ResultSet resultSet=statement.executeQuery(sql)) {

            while (resultSet.next()) {
                lista.add(new Socio(
                        resultSet.getInt("idSocio"),
                        resultSet.getString("nombre"),
                        resultSet.getInt("dni")));
            }
            return lista;

           }
         
        } 
    }

    @Override
    public void add(Socio socio) throws Exception {
        

        
        
        final String sql = "INSERT INTO `barcos`.`socio`\n" +
    "(`idSocio`,\n" +            
"`nombre`,\n" +
"`dni`)\n" +
"VALUES\n" +
 "("+socio.getId()+",\n" +               
"'"+socio.getNombre()+"',\n" +
""+socio.getDNI()+");";
        
        
        
        
        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
                statement.executeUpdate(sql);
    
   
            
        }
        
    }

    @Override
    public void update(Socio socio) throws Exception {
        
       final String sql= "UPDATE `barcos`.`socio`\n" +
"SET\n" +
"`nombre` = '"+socio.getNombre()+"', \n" +
"`dni` = "+   socio.getDNI() +"\n" +
"WHERE `idSocio` = "+socio.getId()+";";

        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
                statement.executeUpdate(sql);
        }
       
       
       
    }

    @Override
    public void delete(int id) throws Exception {
            final String sql= "DELETE FROM `barcos`.`socio`\n" +
"WHERE idSocio="+id+";";

        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
                statement.executeUpdate(sql);
        }
       
    }

}
