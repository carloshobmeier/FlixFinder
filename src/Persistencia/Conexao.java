package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection getConexao() {

        final String URL = "jdbc:mysql://localhost/filmes";
        final String USER = "root";
        final String PASS = "PUC@1234";


        public static Connection getConexao() {
            try {
                Connection c = DriverManager.getConnection(URL, USER, PASS);
                return c;
            } catch (Exception e) {
                return null;
            }
        }
    }
}