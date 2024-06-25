package telas;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import dao.Buscar;
import dao.Enviar;
import dao.Alterar;
import dao.Excluir;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author duduh
 */
public class EstoqueJogos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroJogos
     */
    public EstoqueJogos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    DefaultListModel<String> modelGenero = new DefaultListModel<>();
    Object[][] dados = new Buscar().buscarJogos(0,1,2,3,4,5,6,7,8);
 
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

         
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextIdade = new javax.swing.JTextField();
        jTextDescricao = new javax.swing.JTextField();
        jTextTempo = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(modeloTabela);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextIdade.setText("Idade minima");
        jTextIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdadeActionPerformed(evt);
            }
        });

        jTextDescricao.setText("Descrição");
        jTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoActionPerformed(evt);
            }
        });

        jTextTempo.setText("Tempo de jogo");
        jTextTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTempoActionPerformed(evt);
            }
        });

        jTextNumero.setText("Numero de jogadores");
        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jTextNome.setText("Nome");
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextPreco.setText("Preço");
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

        jTextGenero.setText("Generos");

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

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Idade minima:");

        jLabel5.setText("Generos:");

        jLabel6.setText("Numero de jogadores:");

        jLabel7.setText("Generos adicionados:");

        jLabel8.setText("status:");

        jLabel9.setText("ID");

        jLabel10.setText("Tempo de jogo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDescricao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextTempo)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status, 0, 148, Short.MAX_VALUE)
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
                                    .addComponent(jToggleLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void jButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarMouseClicked
        // TODO add your handling code here:

        Enviar.enviarParaServidor(jTextNome.getText(), jTextDescricao.getText(), jTextPreco.getText(), jTextIdade.getText(), jTextTempo.getText(), jTextNumero.getText(), status.getSelectedItem().toString(), modelGenero.toString());

        //atualizando tabela
        Object[][] dados = new Buscar().buscarJogos(0,1,2,3,4,5,6,7,8);
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Retorna false para tornar todas as células não editáveis
                return false;
            }
        };

        jTable1.setModel(modeloTabela);

    }//GEN-LAST:event_jButtonAdicionarMouseClicked

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
            Object[][] dados = new Buscar().buscarJogos(0,1,2,3,4,5,6,7,8);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //pegando os valores da linha selecionada
        int linha = jTable1.getSelectedRow();

        jTextID.setText(jTable1.getValueAt(linha, 0).toString());
        jTextNome.setText(jTable1.getValueAt(linha, 1).toString());
        jTextDescricao.setText(jTable1.getValueAt(linha, 2).toString());
        jTextPreco.setText(jTable1.getValueAt(linha, 4).toString());
        jTextIdade.setText(jTable1.getValueAt(linha, 7).toString());
        jTextTempo.setText(jTable1.getValueAt(linha, 6).toString());
        jTextNumero.setText(jTable1.getValueAt(linha, 3).toString());
        status.setSelectedItem(jTable1.getValueAt(linha, 5).toString());
        modelGenero.clear();
        //add generos a jListGenero separando por virgula retirando os colchetes e espaços
        String[] generos = jTable1.getValueAt(linha, 8).toString().replace("[", "").replace("]", "").split(", ");
        for (String genero : generos) {
            modelGenero.addElement(genero);
        }
        //atualizando tabela
        Object[][] dados = new Buscar().buscarJogos(0,1,2,3,4,5,6,7,8);
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Retorna false para tornar todas as células não editáveis
                return false;
            }
        };

        jTable1.setModel(modeloTabela);
        


    }//GEN-LAST:event_jTable1MouseClicked

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
            Object[][] dados = new Buscar().buscarJogos(0,1,2,3,4,5,6,7,8);
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstoqueJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueJogos().setVisible(true);
            }
        });
    }

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