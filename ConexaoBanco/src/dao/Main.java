import dao.ConexaoBanco;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Main {
    public static void main(String[] args) {
        try {
            ConexaoBanco conexaoBanco = new ConexaoBanco();
            if (conexaoBanco.conectar()) {
                JOptionPane.showMessageDialog(null, "Banco de dados conectado");
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }
}