public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
    // Dar ao gerente uma bonificação igual à dos funcionários + salário
    public double getBonus() {
        return super.getBonus() + super.getSalario();
    }

}
