package modelo;

public class Cadastro {
    
    private int idcad;
    private String nomecad;
    private String cpf;
    private int idsexo;
    private String email;
    private String nomesexo;
    private int numCadastros;
    private int somaCodigos;
    private int numSexualidade;
    private String foto;
    

    public Cadastro() {
    }
    
    public Cadastro(String nomecad, String cpf, int idsexo, String email, String nomesexo, String foto) {
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.idsexo = idsexo;
        this.email = email;
        this.nomesexo = nomesexo;
        this.foto = foto;
        
        
    }

 public Cadastro(int idcad, String nomecad, String cpf, int idsexo, String email, String nomesexo, String foto) {
        this.idcad = idcad;     
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.idsexo = idsexo;
        this.email = email;
        this.nomesexo = nomesexo;
        this.foto = foto;        
    }   
  public Cadastro(int numCadastros, int somaCodigos, int numSexualidade) {
        this.numCadastros = numCadastros;
        this.somaCodigos = somaCodigos; 
        this.numSexualidade = numSexualidade;
    }      
    
    public int getIdCad() {
        return idcad;
    }

    public void setIdCad(int idcad) {
        this.idcad = idcad;
    }

    public String getNomeCad() {
        return nomecad;
    }

    public void setNomeCad(String nomecad) {
        this.nomecad = nomecad;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdSexo() {
        return idsexo;
    }

    public void setIdSexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeSexo() {
        return nomesexo;
    }

    public void SetNomeSexo(String nomesexo) {
        this.nomesexo = nomesexo;
    }

    public int getTotalCadastros() {
        return numCadastros;
    }

    public void setTotalCadastros(int numCadastros) {
        this.numCadastros = numCadastros;
    }

    public int getSomaCodigos() {
        return somaCodigos;
    }

    public void SetSomaCodigos(int somaCodigos) {
        this.somaCodigos = somaCodigos;
    }

    public int getNumSexualidade() {
        return numSexualidade;
    }

    public void SetNumSexualidade(int numSexualidade) {
        this.numSexualidade = numSexualidade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}