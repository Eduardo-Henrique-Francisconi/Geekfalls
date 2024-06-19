package dao;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBancoteste {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;

    public ConexaoBancoteste() {
        this.servidor = "200.195.171.122";
        this.banco = "grupo10_grupo10_GeekFalls";
        this.usuario = "grupo10";
        this.senha = "gopMi1PKCuJpaB29";
    }

    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }

    // Method to get contents of the "Jogos" table as DefaultTableModel
    public DefaultTableModel getJogosTableModel() throws SQLException {
        String[] colunas = {"ID jogo", "Nome", "Preço", "Descrição", "Idade Minima", "Tempo de jogo", "Nº de jogadores", "Genero", "status"};
        DefaultTableModel modelteste = new DefaultTableModel(colunas, 0);
        String query = "SELECT * FROM Jogos";
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Object[] rowData = {
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getString("descricao"),
                        rs.getInt("idade_minima"),
                        rs.getInt("tempo_jogo"),
                        rs.getInt("num_jogadores"),
                        rs.getString("genero"),
                        rs.getString("status")
                };
                modelteste.addRow(rowData);
            }
        }
        return modelteste;
    }
}
