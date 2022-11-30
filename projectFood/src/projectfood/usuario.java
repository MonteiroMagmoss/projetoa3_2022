package projectfood;

public class usuario {

    private Integer idUsuario, tipoUsuario, senha;

    public enum usuarios {
        ADM, CAIXA, CLIENTE
    }
    private usuarios tipos;
    //private Integer adm = 1, funcionario = 2, cliente = 3;

    private String apelido, email;

    usuario() {
        System.out.println(" Criando Usuario padrao... ");
    }

    usuario(Integer idUsuario, String apelido, String email, Integer tipoUsuario, Integer senha) {

        //adm = 1;
        //funcionario = 2;
        //cliente = 3;
        System.out.println("Criando Usuario... ");

        parametros(idUsuario, apelido, email, tipoUsuario, senha);

    }

    public void statusVars() {
        System.out.println(" Id " + this.idUsuario
                + " Nome " + this.apelido
                + " Email " + this.email
                + " Tipo de Usuario " + this.tipoUsuario
                + " Insira a Senha " + this.senha);
    }

    private void parametros(int idUsuario, String apelido, String email, int tipoUsuario, int senha) {

        this.idUsuario = idUsuario;
        this.apelido = apelido;
        this.email = email;
        this.tipoUsuario = tipoUsuario;

        if (this.tipoUsuario == 1) {

            //this.tipoUsuario = adm;
            System.out.println("Criando Usuario ADM... ");

        }
        if (this.tipoUsuario == 2) {
            // this.tipoUsuario = funcionario;
            System.out.println("Criando Usuario Atendente.... ");

        }
        if (this.tipoUsuario == 3) {
            // this.tipoUsuario = cliente;
            System.out.println("Criando Usuario Cliente... ");

        }
        if (this.tipoUsuario < 1 & this.tipoUsuario > 3) {
            System.out.println("Impossivel Criar qualquer Usuario... ");
        }

        this.senha = senha;

    }

    void selecionarPedido() {

    }

}
