package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteListagem {

    public static void main(String[] args) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        Connection con = criaConexao.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM produto");

        ResultSet rst = stm.getResultSet();

        while(rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println(id);
            String nome = rst.getString("NOME");
            String descricao = rst.getString("DESCRICAO");
            System.out.println(descricao);
        }

        con.close();
    }

}
