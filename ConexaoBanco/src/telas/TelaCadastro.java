import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import dao.ConexaoBanco;

public class TelaCadastro extends JFrame {
    private JLabel lblIdFuncionario, lblCpf, lblNome, lblTelefone, lblUsuario, lblSenha, lblGenero, lblCep, lblRua, lblBairro, lblCidade;
    private JTextField txtIdFuncionario, txtNome, txtUsuario, txtCep, txtRua, txtBairro, txtCidade;
    private JFormattedTextField txtCpf, txtTelefone;
    private JPasswordField txtSenha;
    private JComboBox<String> cmbGenero;
    private JButton btnCadastrar, btnLimpar, btnBuscarCep, btnAlterar, btnExcluir;

    

    public TelaCadastro() {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        setTitle("Tela Cadastro de Funcionário - GeekFalls");
        setSize(500, 600); // Ajuste o tamanho da janela para acomodar os novos botões
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.PLAIN, 14);

        lblIdFuncionario = new JLabel("ID Funcionário:");
        lblCpf = new JLabel("CPF:");
        lblNome = new JLabel("Nome:");
        lblTelefone = new JLabel("Telefone:");
        lblUsuario = new JLabel("Usuário:");
        lblSenha = new JLabel("Senha:");
        lblGenero = new JLabel("Gênero:");
        lblCep = new JLabel("CEP:");
        lblRua = new JLabel("Rua:");
        lblBairro = new JLabel("Bairro:");
        lblCidade = new JLabel("Cidade:");

        txtIdFuncionario = new JTextField(20);
        txtNome = new JTextField(20);
        txtUsuario = new JTextField(20);
        txtCep = new JTextField(8);
        txtRua = new JTextField(20);
        txtBairro = new JTextField(20);
        txtCidade = new JTextField(20);

        try {
            MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) #####-####");
            cpfFormatter.setPlaceholderCharacter('_');
            telefoneFormatter.setPlaceholderCharacter('_');
            txtCpf = new JFormattedTextField(cpfFormatter);
            txtTelefone = new JFormattedTextField(telefoneFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao formatar CPF ou Telefone!");
            return;
        }

        txtSenha = new JPasswordField(20);
        cmbGenero = new JComboBox<>(new String[] {"", "1 - Masculino", "2 - Feminino", "3 - Não Binário", "4 - Assexual", "5 - Mulher trans", "6 - Homem trans"});

        txtRua.setEditable(false);
        txtBairro.setEditable(false);
        txtCidade.setEditable(false);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        btnBuscarCep = new JButton("Buscar CEP");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");

        // Define a fonte para todos os componentes
        lblIdFuncionario.setFont(font);
        lblCpf.setFont(font);
        lblNome.setFont(font);
        lblTelefone.setFont(font);
        lblUsuario.setFont(font);
        lblSenha.setFont(font);
        lblGenero.setFont(font);
        lblCep.setFont(font);
        lblRua.setFont(font);
        lblBairro.setFont(font);
        lblCidade.setFont(font);

        txtIdFuncionario.setFont(font);
        txtCpf.setFont(font);
        txtNome.setFont(font);
        txtTelefone.setFont(font);
        txtUsuario.setFont(font);
        txtSenha.setFont(font);
        cmbGenero.setFont(font);
        txtCep.setFont(font);
        txtRua.setFont(font);
        txtBairro.setFont(font);
        txtCidade.setFont(font);

        btnCadastrar.setFont(font);
        btnLimpar.setFont(font);
        btnBuscarCep.setFont(font);
        btnAlterar.setFont(font);
        btnExcluir.setFont(font);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lblIdFuncionario, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtIdFuncionario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lblCpf, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(txtCpf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblNome, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(txtNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(lblTelefone, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(txtTelefone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(lblUsuario, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(txtUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(lblSenha, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(txtSenha, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(lblGenero, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(cmbGenero, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(lblCep, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(txtCep, gbc);

        gbc.gridx = 2;
        gbc.gridy = 7;
        panel.add(btnBuscarCep, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(lblRua, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(txtRua, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(lblBairro, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        panel.add(txtBairro, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        panel.add(lblCidade, gbc);

        gbc.gridx = 1;
        gbc.gridy = 10;
        panel.add(txtCidade, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        panel.add(btnCadastrar, gbc);

        gbc.gridx = 1;
        gbc.gridy = 11;
        panel.add(btnLimpar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 12;
        panel.add(btnAlterar, gbc);

        gbc.gridx = 1;
        gbc.gridy = 12;
        panel.add(btnExcluir, gbc);

        add(panel);

        ((AbstractDocument) txtIdFuncionario.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        btnBuscarCep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarCep(txtCep.getText());
            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtIdFuncionario.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID do funcionário não pode estar vazio.");
                    return;
                }

                String idFuncionario = txtIdFuncionario.getText();
                String cpf = txtCpf.getText();
                String nome = txtNome.getText();
                String telefone = txtTelefone.getText();
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());
                String genero = (String) cmbGenero.getSelectedItem();
                String cep = txtCep.getText();
                String rua = txtRua.getText();
                String bairro = txtBairro.getText();
                String cidade = txtCidade.getText();

                
                try (Connection conectar = conexaoBanco.getConnection()) {
                    if (conectar == null) {
                        JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados.");
                        return;
                    }
                    String sql = "INSERT INTO funcionario (idFuncionario, cpf, nome, telefone, usuario, senha, genero, cep, rua, bairro, cidade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                        stmt.setString(1, idFuncionario);
                        stmt.setString(2, cpf);
                        stmt.setString(3, nome);
                        stmt.setString(4, telefone);
                        stmt.setString(5, usuario);
                        stmt.setString(6, senha);
                        stmt.setString(7, genero);
                        stmt.setString(8, cep);
                        stmt.setString(9, rua);
                        stmt.setString(10, bairro);
                        stmt.setString(11, cidade);
                
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário: " + ex.getMessage());
                }
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String idFuncionario = JOptionPane.showInputDialog("Digite o ID do funcionário a ser alterado:");
        if (idFuncionario == null || idFuncionario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID do funcionário não pode estar vazio.");
            return;
        }

        String cpf = txtCpf.getText();
        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());
        String genero = (String) cmbGenero.getSelectedItem();
        String cep = txtCep.getText();
        String rua = txtRua.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();

        try (Connection conectar = conexaoBanco.getConnection()) {
            String sql = "UPDATE funcionario SET cpf = ?, nome = ?, telefone = ?, usuario = ?, senha = ?, genero = ?, cep = ?, rua = ?, bairro = ?, cidade = ? WHERE idFuncionario = ?";
            try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                stmt.setString(1, cpf);
                stmt.setString(2, nome);
                stmt.setString(3, telefone);
                stmt.setString(4, usuario);
                stmt.setString(5, senha);
                stmt.setString(6, genero);
                stmt.setString(7, cep);
                stmt.setString(8, rua);
                stmt.setString(9, bairro);
                stmt.setString(10, cidade);
                stmt.setInt(11, Integer.parseInt(idFuncionario));

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível encontrar o funcionário com o ID informado.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar funcionário: " + ex.getMessage());
        }
    }
        });



        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idFuncionario = JOptionPane.showInputDialog("Digite o ID do funcionário a ser excluído:");
                if (idFuncionario == null || idFuncionario.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID do funcionário não pode estar vazio.");
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirm != JOptionPane.YES_OPTION) {
                    return;
                }

                try (Connection conectar = conexaoBanco.getConnection()) {
                    String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
                    try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                        stmt.setInt(1, Integer.parseInt(idFuncionario));
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");

                        // Limpa os campos após a exclusão
                        txtIdFuncionario.setText("");
                        txtCpf.setValue(null);
                        txtNome.setText("");
                        txtTelefone.setValue(null);
                        txtUsuario.setText("");
                        txtSenha.setText("");
                        cmbGenero.setSelectedIndex(0);
                        txtCep.setText("");
                        txtRua.setText("");
                        txtBairro.setText("");
                        txtCidade.setText("");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao excluir funcionário: " + ex.getMessage());
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtIdFuncionario.setText("");
                txtCpf.setValue(null);
                txtNome.setText("");
                txtTelefone.setValue(null);
                txtUsuario.setText("");
                txtSenha.setText("");
                cmbGenero.setSelectedIndex(0);
                txtCep.setText("");
                txtRua.setText("");
                txtBairro.setText("");
                txtCidade.setText("");
            }
        });
    }

    private void buscarCep(String cep) {
        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();

            if (jsonObject.has("erro")) {
                JOptionPane.showMessageDialog(this, "CEP não encontrado!");
                return;
            }

            txtRua.setText(jsonObject.get("logradouro").getAsString());
            txtBairro.setText(jsonObject.get("bairro").getAsString());
            txtCidade.setText(jsonObject.get("localidade").getAsString());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar o CEP!");
        }
    }

    private void carregarFuncionario(String idFuncionario) {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        try (Connection conectar = conexaoBanco.getConnection()) {
            String sql = "SELECT * FROM funcionario WHERE idFuncionario = ?";
            try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                stmt.setInt(1, Integer.parseInt(idFuncionario));
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    txtCpf.setText(rs.getString("cpf"));
                    txtNome.setText(rs.getString("nome"));
                    txtTelefone.setText(rs.getString("telefone"));
                    txtUsuario.setText(rs.getString("usuario"));
                    txtSenha.setText(rs.getString("senha"));
                    cmbGenero.setSelectedItem(rs.getString("genero"));
                    txtCep.setText(rs.getString("cep"));
                    txtRua.setText(rs.getString("rua"));
                    txtBairro.setText(rs.getString("bairro"));
                    txtCidade.setText(rs.getString("cidade"));
                } else {
                    JOptionPane.showMessageDialog(this, "Funcionário não encontrado com o ID informado.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar funcionário: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }
}
