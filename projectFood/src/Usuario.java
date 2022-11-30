
public abstract class Usuario {

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

    public abstract void selecionarProdutos();

    public abstract void realizarPedido();

    public abstract void efetuarPagamento();

    public abstract void visualizarPedidos();

    public abstract void atenderPedidos();

    public abstract void manterUsuarios();

    public abstract void manterProdutos();

    public abstract void manterMaquinas();

}
