package com.example.conexaosql.dao;


import com.example.conexaosql.conexao.conexao;
import com.example.conexaosql.model.Administrador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministradorDAO {

    public Administrador selecionaAdmiministrador(String login, String senha){
        try {
            Connection conn = conexao.conectar();
            if (conn!= null){
                String sql = "select * from ADMINISTRADOR where login = '"+login+"' and senha = '"+senha+"'";
                Statement st = null;
                st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    Administrador adm = new Administrador();
                    adm.setCodigo(rs.getInt( 1));
                    adm.setLogin(rs.getString( 2));
                    adm.setSenha(rs.getString( 3));

                    conn.close();
                    return adm;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
