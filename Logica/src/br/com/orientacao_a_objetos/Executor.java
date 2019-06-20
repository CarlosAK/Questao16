package br.com.orientacao_a_objetos;

public class Executor {

	public static void main(String[] args) {
		
		Clientes novocli = new Clientes();
		Clientes novocli2 = new Clientes();
		
		novocli.nome = "Carlos";
		novocli.codigo = 753;
		
		System.out.println("Nome do cliente é: " +(novocli.nome));
		System.out.println("Codigo do cliente: " +(novocli.codigo));
		
		
		novocli2.nome = "Joao";
		novocli2.codigo = 8920;
		
		System.out.println("Nome do cliente é: " +(novocli2.nome));
		System.out.println("Codigo do cliente: " +(novocli2.codigo));
		
		
		CartaoCredito novocard = new CartaoCredito();
		CartaoCredito novocard2 = new CartaoCredito();
		
		novocard.NmCartao = 123456;
		novocard.Validade = "19/06/2020";
		
		System.out.println("Numero do cartao é: " +(novocard.NmCartao));
		System.out.println("Validade do cartao é: " +(novocard.Validade));
		
		
		novocard2.NmCartao = 987654;
		novocard2.Validade = "08/01/2022";
		
		System.out.println("Numero do cartao é: " +(novocard2.NmCartao));
		System.out.println("Validade do cartao é: " +(novocard2.Validade));
		
		
		Agencia novoagencia = new Agencia();
		Agencia novoagencia2 = new Agencia();
		
		novoagencia.agencia1 = 556;
		novoagencia.agencia2 = 810;
		
		System.out.println("O numero da agencia 1 é: " +(novoagencia.agencia1));
		System.out.println("O numero da agencia 2 é: " +(novoagencia.agencia2));
		
		
		ContaBanco novobanco = new ContaBanco();
		ContaBanco novobanco2 = new ContaBanco();
		
		novobanco.numero = 0147;
		novobanco.saldo = 1000;
		novobanco.limite = 5000;
		
		novobanco2.numero = 0253;
		novobanco2.saldo = 2500;
		novobanco2.limite = 7000;
		
		System.out.println("O numero da conta é: " + novobanco.numero);
		System.out.println("O saldo da conta é: " + novobanco.saldo);
		System.out.println("O limite da conta é: " + novobanco.limite);
		
		System.out.println("O numero da conta é: " + novobanco2.numero);
		System.out.println("O saldo da conta é: " + novobanco2.saldo);
		System.out.println("O limite da conta é: " + novobanco2.limite);
		
		

	}

}
