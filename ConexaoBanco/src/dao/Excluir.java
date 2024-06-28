/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane; // Add this import statement
import java.awt.HeadlessException; // Add this import statement
import java.sql.PreparedStatement; // Add this import statement
import java.sql.ResultSet;
import java.sql.SQLException; // Add this import statement


/**
 *
 * @author NEKO
 */
public class Excluir {

    public static void excluirJogo(String ID_game) {
    ConexaoBanco conexaoBanco = new ConexaoBanco();

    String queryJogos = "DELETE FROM Jogos WHERE ID_game = ?";
    String queryGenero = "DELETE FROM Genero WHERE ID_Genero = ?";
    String queryAluguel = "SELECT * FROM Locacoes WHERE ID_game = ?";
    String queryPedido = "SELECT * FROM PedidosDeLocacoes WHERE ID_game = ?";

    try {
        if (conexaoBanco.conectar()) {
            PreparedStatement stmtAluguel = conexaoBanco.getConnection().prepareStatement(queryAluguel);
            stmtAluguel.setString(1, ID_game);
            ResultSet rsAluguel = stmtAluguel.executeQuery();

            if (rsAluguel.next()) {
                JOptionPane.showMessageDialog(null, "O jogo está atualmente alugado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            PreparedStatement stmtPedido = conexaoBanco.getConnection().prepareStatement(queryPedido);
            stmtPedido.setString(1, ID_game);
            ResultSet rsPedido = stmtPedido.executeQuery();

            if (rsPedido.next()) {
                JOptionPane.showMessageDialog(null, "O jogo tem um pedido de aluguel pendente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            // Fechar ResultSet e PreparedStatement
            rsAluguel.close();
            stmtAluguel.close();
            rsPedido.close();
            stmtPedido.close();
        }
    } catch (HeadlessException | SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        PreparedStatement stmtJogos = conexaoBanco.getConnection().prepareStatement(queryJogos);
        stmtJogos.setString(1, ID_game);
        stmtJogos.executeUpdate();
        stmtJogos.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        PreparedStatement stmtGenero = conexaoBanco.getConnection().prepareStatement(queryGenero);
        stmtGenero.setString(1, ID_game);
        stmtGenero.executeUpdate();
        stmtGenero.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        return;
    }

    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
}

    //excluir funcionario
    
}
