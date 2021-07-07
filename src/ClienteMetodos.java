public class ClienteMetodos {

    public static void main(String[] args) {
        Conta minhaConta = new Conta(2212, 55555);
        // Depositar dinheiro
        minhaConta.depositar(150);
        System.out.println("Valor inicial da sua conta é " + minhaConta.getSaldo());

        // Sacar dinheiro
        boolean Retirada = minhaConta.sacar(20);
        System.out.println("Valor da conta após saque é " + minhaConta.getSaldo());

        // Criar outra conta para fazer transferência
        Conta contaOutros = new Conta(1122, 10232);
        contaOutros.depositar(1000);

        // Transferir dinheiro
        if (contaOutros.transferir(300, minhaConta)) {
            System.out.println("Transferência concluída com sucesso");
        } else {
            System.out.println("Transferência falhou por falta de dinheiro");
        }
        System.out.println("Saldo da conta de saída " + contaOutros.getSaldo());
        System.out.println("Saldo da conta de entrada " + minhaConta.getSaldo());

        // Novo Cliente
        Cliente luisa = new Cliente();
        luisa.setNome("Luisa Garrozi de Oliveira");
        luisa.setCPF("000.000.000-00");
        luisa.setProfissão("estudante");

        // Associa a conta a um cliente
        minhaConta.setTitular(luisa);
        System.out.println("Essa é a conta de " + luisa.getNome() + ", do CPF " + luisa.getCPF());
        
        // Alterar a profissão do dono da conta minhaConta
        minhaConta.getTitular().setProfissão("programadora");

        // Ver o total de contas criadas até o momento
        System.out.println("O total de contas criadas até o momento é " + Conta.getTotaldecontas());
    }
}