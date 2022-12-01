package com.example.conexaosql.conexao;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Connection conn = null;

        StrictMode.ThreadPolicy politica;
        politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(politica);

        Class.forName("net.sourceforge.jtds.jdbc.Driver");

        String ip = "192.168.10.104:1433";
        String db = "pim";
        String user = "sa";
        String senha = "523719";

        String connString = "jdbc:jtds:sqlserver://"+ip+";databaseName="+db+";user="+user+";password="+senha+";";
        conn = DriverManager.getConnection(connString);


        return conn;
    }
}
