public class FuncionariosMetodos {

    public static void main(String[] args) {
        // Criando e testando o primeiro funcionário do tipo Administrador.
        // Não foi criado nenhum funcionário do tipo Funcionário, já que esse é abstrato.
        Administrador administrador = new Administrador();
        administrador.setNome("Amanda Silva");
        administrador.setCPF("222.222.222-20");
        administrador.setSalario(1500.00);

        System.out.println("O bônus do funcionário é " + administrador.getBonus());

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
        controleBonus.registra(administrador);
        controleBonus.registra(gerente);
        System.out.println("O total dos bônus da empresa é " + controleBonus.getSoma());

        // Conferir sistema de autenticação do Cliente
        Cliente cliente = new Cliente();
        boolean autenticarcliente = cliente.autenticar(1111);
        System.out.println(autenticarcliente);
    }
}
