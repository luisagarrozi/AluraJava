public class Métodos {

    public static void main(String[] args) {
        conta Minhaconta = new conta();
        Minhaconta.saldo = 100;
        Minhaconta.depositar(50);
        System.out.println(Minhaconta.saldo);
    }
}