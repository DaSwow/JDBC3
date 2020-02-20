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
public class BarcoDAOImp1 implements BarcoDAO {

    private final ConnectionFactory connectionFactory;

    public BarcoDAOImp1(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Barco find(int idSocio) throws Exception {
        final String sql = "SELECT `barco`.`NumeroMatricula`,\n"
                + "    `barco`.`Nombre`,\n"
                + "    `barco`.`NumeroAmarre`,\n"
                + "    `barco`.`Cuota`,\n"
                + "    `barco`.`idSocio`\n"
                + "FROM `barcos`.`barco`"
                + "WHERE idSocio=" + idSocio + ";";

        try (Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    return new Barco(
                            resultSet.getInt("NumeroMatricula"),
                            resultSet.getString("Nombre"),
                            resultSet.getInt("NumeroAmarre"),
                            resultSet.getFloat("Cuota"),
                            resultSet.getInt("idSocio")
                    );
                }

                return null;
            }
        }
    }

    @Override
    public List<Barco> getAll() throws Exception {
        List<Barco> barcos = new ArrayList<>();

        final String sql = "SELECT `barco`.`NumeroMatricula`,\n"
                + "    `barco`.`Nombre`,\n"
                + "    `barco`.`NumeroAmarre`,\n"
                + "    `barco`.`Cuota`,\n"
                + "    `barco`.`idSocio`\n"
                + "FROM `barcos`.`barco`;";

        try (Connection connection = this.connectionFactory.getConnection();
                Statement statement = connection.prepareStatement(sql);) {

            try (ResultSet resultSet = statement.executeQuery(sql);) {

                while (resultSet.next()) {

                    barcos.add(new Barco(
                            resultSet.getInt("NumeroMatricula"),
                            resultSet.getString("Nombre"),
                            resultSet.getInt("NumeroAmarre"),
                            resultSet.getFloat("Cuota"),
                            resultSet.getInt("idSocio")
                    ));
                }

            }
            return barcos;
        }

    }

    @Override
    public void add(Barco barco) throws Exception {
        final String sql = "INSERT INTO `barcos`.`barco`\n"
                + "`Nombre`,\n"
                + "`NumeroAmarre`,\n"
                + "`Cuota`)\n"
                + "VALUES     (                 )                    ";
        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setString(2, barco.getNombre());
            statement.setInt(3, barco.getAmarre());
            statement.setFloat(4, barco.getCuota());

            int id = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            barco.setNumeroMatricula(id);
        }
    }

    @Override
    public void update(Barco barco) throws Exception {
        final String sql = "UPDATE `barcos`.`barco`\n"
                + "SET\n"
                + "`Nombre` = '" + barco.getNombre() + "',\n"
                + "`NumeroAmarre` = '" + barco.getAmarre() + "',\n"
                + "`Cuota` = " + String.valueOf(barco.getCuota()) + "\n"
                + "WHERE `NumeroMatricula` = " + barco.getNumeroMatricula() + ";";

        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.executeUpdate(sql);
        }

    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
