package br.com.alura.jdbc;

import java.sql.*;

public class TesteListagem {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM produto");
        stm.execute();

        ResultSet rst = stm.getResultSet();

        while(rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println(id);
            String nome = rst.getString("NOME");
            String descricao = rst.getString("DESCRICAO");
            System.out.println(descricao);
        }

        connection.close();
    }

}
