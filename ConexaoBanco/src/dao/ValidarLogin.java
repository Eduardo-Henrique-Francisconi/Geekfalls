package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidarLogin {
    private ConexaoBanco conexaoBanco;

    public ValidarLogin(ConexaoBanco conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
    }

    public boolean validarLogin(String login, String senha) {
        String sql = "SELECT * FROM funcionario WHERE usuario = ? AND senha = ?";
        try {
            Connection conexao = conexaoBanco.getConnection();
            if (conexao == null || conexao.isClosed()) {
                conexaoBanco.conectar();
                conexao = conexaoBanco.getConnection();
            }
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            return rs.next();
            
        } catch (SQLException e) {
            System.out.println("Erro ao validar login: " + e.getMessage());
        }
        return false;
    }
}

