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
    //public static void buscarJogos() retorna um array de objetos com os jogos
    public Object[][] buscarJogos() {

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        String queryJogos = "SELECT Game_age, Game_description, Game_name, Game_player_quantity, Game_price, Game_status, Game_time, ID_game FROM Jogos";
        String queryGenero = "SELECT ID_Genero, Genero FROM Genero";
        
        try {

            if (conexaoBanco.conectar()) {
                
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
                
                data[0] = ID_game;
                data[1] = Game_name;
                data[2] = Game_description;
                data[3] = Game_price;
                data[4] = Game_time;
                data[5] = Game_status;
                data[6] = Game_age;
                data[7] = Game_player_quantity;
                data[8] = generos;
                
            
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

    //public static void buscarMotiroramentoPedidos() retorna um array de objetos com os pedidos
    public Object[][] buscarMonitoramentoPedidos() {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        String query = "SELECT ID_locador, ID_game, data_solicitacao FROM PedidosDeLocacoes";
        String queryJogos = "SELECT ID_game, Game_name FROM Jogos";
        String queryLocador = "SELECT id, nome, telefone FROM Locadores";
    
        try {

            if (conexaoBanco.conectar()) {
                
            }
            
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt2 = conexaoBanco.getConnection().prepareStatement(queryJogos);
            PreparedStatement stmt3 = conexaoBanco.getConnection().prepareStatement(queryLocador);
            
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            
            while (rs.next()) {
                Object[] data = new Object[4]; // Move the declaration inside the loop
                String ID_locador = rs.getString("ID_locador");
                String ID_game = rs.getString("ID_game");
                String data_solicitacao = rs.getString("data_solicitacao");
                String Game_name = "";
                String nome = "";
                String telefone = "";
                
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getString("ID_game").equals(ID_game)) {
                        Game_name = rs2.getString("Game_name");
                    }
                }
                
                ResultSet rs3 = stmt3.executeQuery();
                while (rs3.next()) {
                    if (rs3.getString("id").equals(ID_locador)) {
                        nome = rs3.getString("nome");
                        telefone = rs3.getString("telefone");
                    }
                }
                
                data[0] = nome;
                data[1] = Game_name;
                data[2] = telefone;
                data[3] = data_solicitacao;
                
                dataList.add(data);
            }
            
            Object[][] dados = new Object[dataList.size()][4];
            for (int i = 0; i < dataList.size(); i++) {
                dados[i] = dataList.get(i);
            }
            
            return dados;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    return null; // or handle the exception in a different way
                }

    }
    
    //public static void buscarMotiroramentoAlugados() retorna um array de objetos com os jogos alugados
    public Object[][] buscarMonitoramentoAlugados() {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        //id id_locador id_game data_inicio data_fim
        String query = "SELECT ID_locador, ID_game, data_inicio, data_fim FROM Locacoes WHERE data_fim < CURRENT_DATE";
        String queryJogos = "SELECT ID_game, Game_name FROM Jogos";
        String queryLocador = "SELECT id, nome, telefone FROM Locadores";

        try {

            if (conexaoBanco.conectar()) {
                
            }
            
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt2 = conexaoBanco.getConnection().prepareStatement(queryJogos);
            PreparedStatement stmt3 = conexaoBanco.getConnection().prepareStatement(queryLocador);
            
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            
            while (rs.next()) {
                Object[] data = new Object[5]; // Move the declaration inside the loop
                String ID_locador = rs.getString("ID_locador");
                String ID_game = rs.getString("ID_game");
                String data_inicio = rs.getString("data_inicio");
                String data_fim = rs.getString("data_fim");
                String Game_name = "";
                String nome = "";
                String telefone = "";
                
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getString("ID_game").equals(ID_game)) {
                        Game_name = rs2.getString("Game_name");
                    }
                }
                
                ResultSet rs3 = stmt3.executeQuery();
                while (rs3.next()) {
                    if (rs3.getString("id").equals(ID_locador)) {
                        nome = rs3.getString("nome");
                        telefone = rs3.getString("telefone");
                    }
                }
                
                data[0] = nome;
                data[1] = Game_name;
                data[2] = telefone;
                data[3] = data_inicio;
                data[4] = data_fim;
                
                dataList.add(data);
            }
            
            Object[][] dados = new Object[dataList.size()][5];
            for (int i = 0; i < dataList.size(); i++) {
                dados[i] = dataList.get(i);
            }
            
            return dados;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    return null; // or handle the exception in a different way
                }

    }

    //public static void buscarMotiroramentopDevolver() retorna um array de objetos com os jogos alugados
    public Object[][] buscarMonitoramentoDevolver() {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        //id id_locador id_game data_inicio data_fim
        String query = "SELECT ID_locador, ID_game FROM Locacoes WHERE data_fim = CURRENT_DATE";
        String queryJogos = "SELECT ID_game, Game_name FROM Jogos";
        String queryLocador = "SELECT id, nome, telefone FROM Locadores";

        try {

            if (conexaoBanco.conectar()) {
                
            }
            
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt2 = conexaoBanco.getConnection().prepareStatement(queryJogos);
            PreparedStatement stmt3 = conexaoBanco.getConnection().prepareStatement(queryLocador);
            
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            
            while (rs.next()) {
                Object[] data = new Object[4]; // Move the declaration inside the loop
                String ID_locador = rs.getString("ID_locador");
                String ID_game = rs.getString("ID_game");
                String Game_name = "";
                String nome = "";
                String telefone = "";
                
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getString("ID_game").equals(ID_game)) {
                        Game_name = rs2.getString("Game_name");
                    }
                }
                
                ResultSet rs3 = stmt3.executeQuery();
                while (rs3.next()) {
                    if (rs3.getString("id").equals(ID_locador)) {
                        nome = rs3.getString("nome");
                        telefone = rs3.getString("telefone");
                    }
                }
                
                data[0] = nome;
                data[1] = Game_name;
                data[2] = telefone;
                
                dataList.add(data);
            }
            
            Object[][] dados = new Object[dataList.size()][4];
            for (int i = 0; i < dataList.size(); i++) {
                dados[i] = dataList.get(i);
            }
            
            return dados;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    return null; // or handle the exception in a different way
                }

    }


    //public static void buscarMotiroramentoAtrasados() retorna um array de objetos com os jogos atrasados
    public Object[][] buscarMonitoramentoAtrasados() {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        //id id_locador id_game data_inicio data_fim
        String query = "SELECT ID_locador, ID_game, data_fim FROM Locacoes WHERE data_fim < CURRENT_DATE";
        String queryJogos = "SELECT ID_game, Game_name FROM Jogos";
        String queryLocador = "SELECT id, nome, telefone FROM Locadores";

        try {

            if (conexaoBanco.conectar()) {
                
            }
            
        } catch(HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }

        try {
            PreparedStatement stmt = conexaoBanco.getConnection().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            PreparedStatement stmt2 = conexaoBanco.getConnection().prepareStatement(queryJogos);
            PreparedStatement stmt3 = conexaoBanco.getConnection().prepareStatement(queryLocador);
            
            int arraysize = 3;
            List<Object[]> dataList = new ArrayList<>();
            
            while (rs.next()) {
                Object[] data = new Object[4]; // Move the declaration inside the loop
                String ID_locador = rs.getString("ID_locador");
                String ID_game = rs.getString("ID_game");
                String data_fim = rs.getString("data_fim");
                String Game_name = "";
                String nome = "";
                String telefone = "";
                
                ResultSet rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getString("ID_game").equals(ID_game)) {
                        Game_name = rs2.getString("Game_name");
                    }
                }
                
                ResultSet rs3 = stmt3.executeQuery();
                while (rs3.next()) {
                    if (rs3.getString("id").equals(ID_locador)) {
                        nome = rs3.getString("nome");
                        telefone = rs3.getString("telefone");
                    }
                }
                
                data[0] = nome;
                data[1] = Game_name;
                data[2] = telefone;
                data[3] = data_fim;
                
                dataList.add(data);
            }
            
            Object[][] dados = new Object[dataList.size()][4];
            for (int i = 0; i < dataList.size(); i++) {
                dados[i] = dataList.get(i);
            }
            
            return dados;
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    return null; // or handle the exception in a different way
                }

            }

        
            
}   
        
        
        


