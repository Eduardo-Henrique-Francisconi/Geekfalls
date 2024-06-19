package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoBanco {   
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;   
    public ConexaoBanco() {
        this.servidor = "200.195.171.122";
        this.banco = "grupo10_GeekFalls";
        this.usuario = "grupo10";
        this.senha = "gopMi1PKCuJpaB29";
    }
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection() {
        return conexao;
    }

}