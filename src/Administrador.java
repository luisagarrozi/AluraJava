public class Administrador extends Funcionario implements Autenticacao{
    private int senha;


    public double getBonus() {
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

}

