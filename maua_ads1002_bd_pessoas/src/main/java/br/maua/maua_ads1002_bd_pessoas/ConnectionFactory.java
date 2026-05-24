package br.maua.maua_ads1002_bd_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "root";
    private static String senha = "tinCTrom";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "20261_maua_ads1002_pessoas";

    public static Connection conectar() {
        try {
            String s = String.format(
                    "jdbc:mysql://%s:%s/%s",
                    host, porta, db
            );
            Connection conexao = DriverManager.getConnection(
                    s, usuario, senha
            );
            return conexao;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conexao = conectar();
        System.out.println(conexao);
    }
}
