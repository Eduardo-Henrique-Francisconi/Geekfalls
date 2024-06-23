/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane; // Add this import statement
import java.awt.HeadlessException; // Add this import statement
import java.sql.PreparedStatement; // Add this import statement
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

        try {
            if (conexaoBanco.conectar()) {
                JOptionPane.showMessageDialog(null, "Banco de dados conectado");
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryJogos);
            stmt.setString(1, ID_game);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryGenero);
            stmt.setString(1, ID_game);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
