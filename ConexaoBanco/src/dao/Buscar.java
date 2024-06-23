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
    
    public Object[][] buscarJogos(Integer IDgame, Integer Gamename, Integer Gamedescription, Integer Gameprice, Integer Gametime, Integer Gamestatus, Integer Gameage, Integer Gameplayerquantity, Integer IDgenre) {

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        String queryJogos = "SELECT Game_age, Game_description, Game_name, Game_player_quantity, Game_price, Game_status, Game_time, ID_game FROM Jogos";
        String queryGenero = "SELECT ID_Genero, Genero FROM Genero";
        
        try {
            
            if (conexaoBanco.conectar()) {
                JOptionPane.showMessageDialog(null, "Banco de dados conectadoBUSCAR TESTE");
            }
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(queryJogos);
            ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt2 = conexaoBanco.getConnection().prepareStatement(queryGenero);
            
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            
            while (rs.next()) {
                Object[] data = new Object[9]; // Move the declaration inside the loop
                String ID_game = rs.getString("ID_game"); 
                String Game_name = rs.getString("Game_name");
                String Game_description = rs.getString("Game_description");
                String Game_price = rs.getString("Game_price");
                String Game_time = rs.getString("Game_time");
                String Game_status = rs.getString("Game_status");
                String Game_age = rs.getString("Game_age");
                String Game_player_quantity = rs.getString("Game_player_quantity");
                String generos = "";
                
                
                //pesquisa generos com os mesmo id do jogo atual e adiciona a string generos
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getString("ID_Genero").equals(ID_game)) {
                        generos += rs2.getString("Genero") + ", ";
                    }
                }
                
                    
                
                
                if (!generos.isEmpty()) {
                    generos = generos.substring(0, generos.length() - 2); // Remove the last comma and space
                }
                data[IDgenre] = generos;
            
                if (IDgame != null) {
                    data[IDgame] = ID_game;
                }
                if (Gamename != null) {
                    data[Gamename] = Game_name;
                }
                if (Gamedescription != null) {
                    data[Gamedescription] = Game_description;
                }
                if (Gameprice != null) {
                    data[Gameprice] = Game_price;
                }
                if (Gametime != null) {
                    data[Gametime] = Game_time;
                }
                if (Gamestatus != null) {
                    data[Gamestatus] = Game_status;
                }
                if (Gameage != null) {
                    data[Gameage] = Game_age;
                }
                if (Gameplayerquantity != null) {
                    data[Gameplayerquantity] = Game_player_quantity;
                }
                if (IDgenre != null) {
                    data[IDgenre] = generos;
                }
            
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


