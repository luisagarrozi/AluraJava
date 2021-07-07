import javax.sound.midi.Soundbank;

public class Métodos {

    public static void main(String[] args) {
        conta Minhaconta = new conta();
        // Depositar dinheiro
        Minhaconta.depositar(150);
        System.out.println("Valor inicial da sua conta é " + Minhaconta.getSaldo());

        // Sacar dinheiro
        boolean Retirada = Minhaconta.sacar(20);
        System.out.println("Valor da conta após saque é " + Minhaconta.getSaldo());

        // Criar outra conta para fazer transferência
        conta Contaoutros = new conta();
        Contaoutros.depositar(1000);

        // Transferir dinheiro
        if (Contaoutros.transferir(300, Minhaconta)) {
            System.out.println("Transferência concluída com sucesso");
        } else {
            System.out.println("Transferência falhou por falta de dinheiro");
        }
        System.out.println("Saldo da conta de saída " + Contaoutros.getSaldo());
        System.out.println("Saldo da conta de entrada " + Minhaconta.getSaldo());

        // Novo Cliente
        Cliente Luisa = new Cliente();
        Luisa.nome = "Luisa Garrozi de Oliveira";
        Luisa.CPF = "000.000.000-00";
        Luisa.profissão = "estudante";

        // Associa a conta a um cliente
        Minhaconta.setTitular(Luisa);
        System.out.println("Essa é a conta de " + Luisa.nome);
    }
}