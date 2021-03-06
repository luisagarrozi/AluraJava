public class Gerente extends Funcionario implements Autenticacao{
    private int senha;

    // Dar ao gerente uma bonificação igual à dos funcionários + salário
    @Override
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
