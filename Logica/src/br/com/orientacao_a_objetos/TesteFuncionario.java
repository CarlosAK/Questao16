package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Funcionarios novofunc = new Funcionarios();
		Funcionarios novofunc2 = new Funcionarios();
		
		novofunc.nome = "Jose";
		novofunc.salario = 1800;
		
		System.out.println("O nome do funcionario �: " + novofunc.nome);
		System.out.println("O salario do funcionario �: " + novofunc.salario);
		
		
		
		novofunc2.nome = "rafael";
		novofunc2.salario = 3800;
		
		System.out.println("O nome do funcionario �: " + novofunc2.nome);
		System.out.println("O salario do funcionario �: " + novofunc2.salario);

	}

}
