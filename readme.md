Projeto baseado nas aulas de Java da Alura.

Arquivos iniciais: Cliente, Conta e Cliente Métodos. Criam um esboço de banco virtual.
O arquivo Cliente cria a classe Cliente, com variáveis privadas, para teste de getters e setters.
O arquivo Conta, também com variáveis privadas, implementa as funções sacar, transferir e depositar, além de uma função para somar o total de contas abertas;
O arquivo ClienteMetodos é onde é criado um cliente e uma conta, este cliente é associado à conta e são testadas todas as funções de Conta.

Os arquivos da segunda fase do projeto são Administrador, Bonus, Funcionário, FuncionárioMétodos e Gerente.
A classe Funcionário é uma classe abstrata, que cria variáveis e seus getters e setters, além de uma função abstrata getBonus.
As classes Administrador e Gerente fazem as mesmas coisas. São classes com herança (da classe Funcionário).
A classe Bonus implementa as funções registra, para registrar os bônus dos funcionários (que foram implementados através da função na classe Funcionário), além de fazer a soma de todos os bônus registrados.
Por fim, a classe FuncionárioMétodos é onde são feitos os testes, criando funcionarios das classes Gerente e Administrador, testando suas bonificações e somas.

Na terceira fase há o arquivo Autenticação, realizando o teste de interfaces, com utilização da função Autenticar, usada nas classes Cliente, Administrador e Gerente, e testada através do arquivo FuncionárioMétodos.
