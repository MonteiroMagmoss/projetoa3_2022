
public class Usuario {

    private int id_usuario;
    private String nome = "";
    private String email = "";
    private String senha = "";
    private int tipo;
    private String apelido = "";

    public Usuario() {
    }

    public Usuario(int id_usuario, int tipo) {
        this.id_usuario = id_usuario;
        this.tipo = tipo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Arrumar toString";
    }

    public void selecionarProdutos() {
    }

    public void realizarPedido() {
    }

    public void efetuarPagamento() {
    }

    public void visualizarPedidos() {
    }

    public void atenderPedidos() {
    }

    public void visualizarUsuarios() {
    }

    public void inserirUsuarios() {
    }

    public void deletarUsuarios() {
    }

    public void atualizarUsuarios() {
    }

    public void inserirProdutos() {
    }

    public void visualizarProdutos() {
    }

    public void deletarProdutos() {
    }

    public void manterProdutos() {
    }

}
