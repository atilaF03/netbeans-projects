/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package conexao;

/**
 *
 * @author aluno.den
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/cadastro_pessoa";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("erro a conexão com banco de dados"+e.getMessage());
        }

    }

}
