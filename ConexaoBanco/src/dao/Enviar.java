/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane; // Add this import statement
import java.awt.HeadlessException; // Add this import statement
import java.sql.PreparedStatement; // Add this import statement
import java.sql.ResultSet;
import java.sql.SQLException; // Add this import statement

/**
 *
 * @author NEKO
 */
public class Enviar {
    
    public static void enviarParaServidor(String Game_name, String Game_description, String Game_price, String Game_age, String Game_time, String Game_player_quantity, String Game_status, String Genero) {
        ConexaoBanco conexaoBanco = new ConexaoBanco();

        String queryJogos = "INSERT INTO Jogos (Game_name, Game_description, Game_price, Game_age, Game_time, Game_player_quantity, Game_status) VALUES (?, ?, ?, ?, ?, ?, ?)";

        String queryGenero = "INSERT INTO Genero (ID_Genero, Genero) VALUES (?, ?)";

        String queryPesquisaJogo = "SELECT * FROM Jogos WHERE Game_name = ?";

        // removendo [ ] e separar generos
        String[] generos = Genero.replace("[", "").replace("]", "").split(", ");
        
        try {

            if (conexaoBanco.conectar()) {
                
            }
           
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryJogos);
            stmt.setString(1, Game_name);
            stmt.setString(2, Game_description);
            stmt.setString(3, Game_price);
            stmt.setString(4, Game_age);
            stmt.setString(5, Game_time);
            stmt.setString(6, Game_player_quantity);
            stmt.setString(7, Game_status);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        //buscar id a partir do nome do jogo
        String ID_game = null; // Declare the variable ID_game
        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryPesquisaJogo);
            stmt.setString(1, Game_name);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            ID_game = rs.getString("ID_game"); // Assign a value to ID_game
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        //salvar generos no banco de dados com mesmo id do jogo
        for (String genero : generos) {
            try {
                PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryGenero);
                stmt.setString(1, ID_game);
                stmt.setString(2, genero);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Envio realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }

    
    
}
