/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import dao.Alterar;
import dao.Enviar;
import dao.Excluir;
import dao.Buscar;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEKO
 */
public class EstoqueJogosJpanel extends javax.swing.JPanel {

    /**
     * Creates new form EstoqueJogosJpanel
     */
    public EstoqueJogosJpanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextTempo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextPreco = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListGenero = new javax.swing.JList<>();
        jTextGenero = new javax.swing.JTextField();
        jToggleAdd = new javax.swing.JToggleButton();
        jToggleLimpar = new javax.swing.JToggleButton();
        jTextID = new javax.swing.JTextField();
        jButtonExcluir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Idade minima:");

        jTable1.setModel(modeloTabela);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Generos:");

        jLabel6.setText("Numero de jogadores:");

        jTextIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Generos adicionados:");

        jTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoActionPerformed(evt);
            }
        });

        jLabel8.setText("status:");

        jTextTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTempoActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Tempo de jogo:");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecoActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarMouseClicked(evt);
            }
        });
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAlterarMouseClicked(evt);
            }
        });
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponível", "alugado", "manutenção" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jListGenero.setModel(modelGenero);
        jScrollPane3.setViewportView(jListGenero);

        jToggleAdd.setText("Add");
        jToggleAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleAddMouseClicked(evt);
            }
        });

        jToggleLimpar.setText("limpar");
        jToggleLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleLimparMouseClicked(evt);
            }
        });

        jTextID.setEditable(false);
        jTextID.setText("ID");
        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jButtonExcluir1.setText("Excluir");
        jButtonExcluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExcluir1MouseClicked(evt);
            }
        });
        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNome)
                            .addComponent(jTextNumero)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDescricao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextTempo)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPreco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextID)
                                    .addComponent(jTextIdade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(108, 108, 108)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleLimpar)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdicionar)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonExcluir1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    DefaultListModel<String> modelGenero = new DefaultListModel<>();
    Object[][] dados = new Buscar().buscarJogos();
 
         // Define os nomes das colunas
         String[] colunas = {"id", "nome", "descrição", "preço", "tempo em Min", "status", "idade", "players", "genero"}; // "ID_game", "ID_genre
 
         // Cria o modelo de tabela com os dados e as colunas
         DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Retorna false para tornar todas as células não editáveis
                return false;
            }
        };
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //pegando os valores da linha selecionada
        int linha = jTable1.getSelectedRow();

        jTextID.setText(jTable1.getValueAt(linha, 0).toString());
        jTextNome.setText(jTable1.getValueAt(linha, 1).toString());
        jTextDescricao.setText(jTable1.getValueAt(linha, 2).toString());
        jTextPreco.setText(jTable1.getValueAt(linha, 3).toString());
        jTextTempo.setText(jTable1.getValueAt(linha, 4).toString());
        status.setSelectedItem(jTable1.getValueAt(linha, 5).toString());
        jTextIdade.setText(jTable1.getValueAt(linha, 6).toString());
        jTextNumero.setText(jTable1.getValueAt(linha, 7).toString());

        modelGenero.clear();
        //add generos a jListGenero separando por virgula retirando os colchetes e espaços
        String[] generos = jTable1.getValueAt(linha, 8).toString().replace("[", "").replace("]", "").split(", ");
        for (String genero : generos) {
            modelGenero.addElement(genero);
        }
        //atualizando tabela
        Object[][] dados = new Buscar().buscarJogos();
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Retorna false para tornar todas as células não editáveis
                return false;
            }
        };

        jTable1.setModel(modeloTabela);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdadeActionPerformed

    private void jTextDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescricaoActionPerformed

    private void jTextTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTempoActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecoActionPerformed

    private void jButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarMouseClicked
        // TODO add your handling code here:

        Enviar.enviarParaServidor(jTextNome.getText(), jTextDescricao.getText(), jTextPreco.getText(), jTextIdade.getText(), jTextTempo.getText(), jTextNumero.getText(), status.getSelectedItem().toString(), modelGenero.toString());

        //atualizando tabela
        Object[][] dados = new Buscar().buscarJogos();
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Retorna false para tornar todas as células não editáveis
                return false;
            }
        };

        jTable1.setModel(modeloTabela);
    }//GEN-LAST:event_jButtonAdicionarMouseClicked

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAlterarMouseClicked
        // TODO add your handling code here:
        //perguntando se o usuario tem certeza que deseja alterar
        int resposta = javax.swing.JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar?", "Alterar", javax.swing.JOptionPane.YES_NO_OPTION);

        if (resposta == javax.swing.JOptionPane.YES_OPTION) {
            //pegando os valores dos campos
            String ID_game = jTextID.getText();
            String Game_name = jTextNome.getText();
            String Game_description = jTextDescricao.getText();
            String Game_price = jTextPreco.getText();
            String Game_age = jTextIdade.getText();
            String Game_time = jTextTempo.getText();
            String Game_player_quantity = jTextNumero.getText();
            String Game_status = status.getSelectedItem().toString();
            String Genero = modelGenero.toString();
            //enviando para o banco de dados
            Alterar.alterarJogo(ID_game, Game_name, Game_description, Game_price, Game_age, Game_time, Game_player_quantity, Game_status, Genero);
            //atualizando tabela
            Object[][] dados = new Buscar().buscarJogos();
            DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Retorna false para tornar todas as células não editáveis
                    return false;
                }
            };

            jTable1.setModel(modeloTabela);
        }
    }//GEN-LAST:event_jButtonAlterarMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void jToggleAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleAddMouseClicked
        // TODO add your handling code here:

        //criando array para salvar os generos e adicionando generos a jListGenero

        String[] generos = jTextGenero.getText().split(",");

        for (String genero : generos) {
            modelGenero.addElement(genero);
        }

    }//GEN-LAST:event_jToggleAddMouseClicked

    private void jToggleLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleLimparMouseClicked
        // TODO add your handling code here:
        modelGenero.clear();
    }//GEN-LAST:event_jToggleLimparMouseClicked

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonExcluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluir1MouseClicked
        // TODO add your handling code here:
        //perguntando se o usuario tem certeza que deseja excluir
        int resposta = javax.swing.JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "Excluir", javax.swing.JOptionPane.YES_NO_OPTION);
        if (resposta == javax.swing.JOptionPane.YES_OPTION) {
            //pegando o id do jogo selecionado
            String ID_game = jTextID.getText();
            //enviando para o banco de dados
            Excluir.excluirJogo(ID_game);
            //atualizando tabela
            Object[][] dados = new Buscar().buscarJogos();
            DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Retorna false para tornar todas as células não editáveis
                    return false;
                }
            };

            jTable1.setModel(modeloTabela);
        }

    }//GEN-LAST:event_jButtonExcluir1MouseClicked

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextGenero;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPreco;
    private javax.swing.JTextField jTextTempo;
    private javax.swing.JToggleButton jToggleAdd;
    private javax.swing.JToggleButton jToggleLimpar;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}