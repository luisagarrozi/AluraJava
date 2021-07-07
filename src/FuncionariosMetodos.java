public class FuncionariosMetodos {

    public static void main(String[] args) {
        // Criando e testando o primeiro funcionário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Amanda Silva");
        funcionario.setCPF("222.222.222-20");
        funcionario.setSalario(1500.00);

        System.out.println("O bônus do funcionário é " + funcionario.getBonus());

        // Criando e testando um gerente
        Gerente gerente = new Gerente();
        gerente.setNome("Marco Antonio");
        gerente.setCPF("111.111.111-11");
        gerente.setSalario(5000.00);
        gerente.setSenha(2222);

        // Autenticação de senha
        boolean autenticar = gerente.autenticar(2222);
        System.out.println(autenticar);

        // Testando bonificação
        System.out.println("O bônus do gerente é " + gerente.getBonus());

// Conferindo soma das bonificações
        Bonus controleBonus = new Bonus();
        controleBonus.registra(funcionario);
        controleBonus.registra(gerente);
        System.out.println("O total dos bônus da empresa é " + controleBonus.getSoma());
    }
}
