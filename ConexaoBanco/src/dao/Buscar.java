/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.ConexaoBanco;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;



/**
 *
 * @author duduh
 */
public class Buscar {
    
    public Object[][] buscarJogos() {

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        String query = "SELECT Game_age, Game_description, Game_name, Game_player_quantity, Game_price, Game_status, Game_time, ID_game, ID_genre FROM Jogos";
        
        try {
            
            if (conexaoBanco.conectar()) {
                JOptionPane.showMessageDialog(null, "Banco de dados conectadoBUSCAR TESTE");
            }
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String Game_age = rs.getString("ID_game"); 
                String Game_description = rs.getString("Game_description");
                String Game_name = rs.getString("Game_name");
                String Game_player_quantity = rs.getString("Game_player_quantity");
                String Game_price = rs.getString("Game_price");
                String Game_status = rs.getString("Game_status");
                String Game_time = rs.getString("Game_time");
                String ID_game = rs.getString("Game_age");
                String ID_genre = rs.getString("ID_genre");
                Object[] data = new Object[]{Game_age, Game_description, Game_name, Game_player_quantity, Game_price, Game_status, Game_time, ID_game, ID_genre};
                dataList.add(data);
            }
            
            Object[][] dados = new Object[dataList.size()][9];
            for (int i = 0; i < dataList.size(); i++) {
                dados[i] = dataList.get(i);
            }
            
            return dados;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    return null; // or handle the exception in a different way
                }
    }
};    


