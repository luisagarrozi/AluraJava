public class Bonus {

    private double soma;

    public void registra(Funcionario func) {
        double bonus = func.getBonus();
        this.soma = this.soma + bonus;
    }

    public double getSoma() {
        return soma;
    }
}
