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
import java.util.ArrayList;
import java.util.List;

public class SalidaDAOImp1 implements SalidaDAO {

    private final ConnectionFactory connectionFactory;

    public SalidaDAOImp1(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Salida find(int numeroMatricula) throws Exception {

        final String sql = "SELECT `salida`.`HoraSalida`,\n"
                + "    `salida`.`FechaSalida`,\n"
                + "    `salida`.`Destino`,"
                + "    `salida`.`NuMeroMatricula` \n"
                + "FROM `barcos`.`salida` WHERE NumeroMatricula = " + numeroMatricula;

        try (Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    return new Salida(
                            resultSet.getString("HoraSalida"),
                            resultSet.getString("FechaSalida"),
                            resultSet.getString("Destino"),
                            resultSet.getInt("NumeroMatricula")
                    );
                }

                return null;
            }
        }

    }

    @Override
    public List<Salida> getAll() throws Exception {
        List<Salida> salidas = new ArrayList<>();

        final String sql = "SELECT `salida`.`HoraSalida`,\n"
                + "    `salida`.`FechaSalida`,\n"
                + "    `salida`.`Destino`,\n"
                + "    `salida`.`NuMeroMatricula` \n"
                + "FROM `barcos`.`salida`;";

        try (Connection connection = this.connectionFactory.getConnection();
                Statement statement = connection.prepareStatement(sql);) {

            try (ResultSet resultSet = statement.executeQuery(sql);) {

                while (resultSet.next()) {

                    salidas.add(new Salida(
                            resultSet.getString("HoraSalida"),
                            resultSet.getString("FechaSalida"),
                            resultSet.getString("Destino"),
                            resultSet.getInt("NumeroMatricula")
                    ));
                }

            }
            return salidas;
        }

    }

    @Override
    public void add(Salida salida) throws Exception {
        final String sql = "INSERT INTO `barcos`.`salida`\n"
                + "(`NumeroMatricula`,\n"
                + "`Nombre`,\n"
                + "`NumeroAmarre`,\n"
                + "`Cuota`)\n"
                + "VALUES     (                 )                    ";
        try (
                Connection connection = this.connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, salida.getHoraSalida());
            statement.setString(2, salida.getFechaSalida());
            statement.setString(3, salida.getDestino());

        }
    }

    @Override
    public void update(Salida salida) throws Exception {
        final String sql = "UPDATE `barcos`.`salida`\n" +
"SET\n" +
"`HoraSalida` = '"+salida.getHoraSalida()+"',\n" +
"`FechaSalida` = '"+salida.getFechaSalida()+"',\n" +
"`Destino` ='"+salida.getDestino()+"',\n" +
"`NumeroMatricula` ="+salida.getMatriculaBarco()+" \n" +
"WHERE `NumeroMatricula` = "+salida.getMatriculaBarco()+";";

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
