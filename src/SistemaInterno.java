public class SistemaInterno {

    private int senha = 2222;

    public void autenticar(Autenticacao f){
        boolean autenticou = f.autenticar(this.senha);
        if(autenticou){
            System.out.println("Senha aceita. Entrando no sistema");
        } else {
            System.out.println("Senha incorreta. Impossível entrar no sistema");
        }
    }
}
