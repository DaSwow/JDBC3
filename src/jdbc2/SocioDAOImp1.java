/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
        final String sql = "SELECT idSocio, nombre, dni " +
            "FROM socio WHERE id = ?";
        
        try (Connection connection = this.connectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            
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
    public List<Socio> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Socio socio) throws Exception {
        final String sql = "INSERT INTO `barcos`.`socio` (nombre, dni) " +
            "VALUES (?, ?)";
        try (
            Connection connection = this.connectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, socio.getNombre());
            statement.setInt(2, socio.getDNI());
            int id = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            socio.setId(id);
        }
    }

    @Override
    public void update(Socio socio) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
