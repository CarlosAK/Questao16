package br.com.orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno novoaluno = new Aluno();
		Aluno novoaluno2 = new Aluno();
		
		novoaluno.Nome = "Maria";
		novoaluno.rg = 1593570;
		novoaluno.DataNasc = "01/01/2000";
		
		System.out.println("O nome do aluno �: " + novoaluno.Nome);
		System.out.println("O RG do aluno �: " + novoaluno.rg);
		System.out.println("A data de nascimento do aluno �: " +novoaluno.DataNasc);
		
		
		
		novoaluno2.Nome = "Ana";
		novoaluno2.rg = 9517530;
		novoaluno2.DataNasc = "08/07/1995";
		
		System.out.println("O nome do aluno �: " + novoaluno2.Nome);
		System.out.println("O RG do aluno �: " + novoaluno2.rg);
		System.out.println("A data de nascimento do aluno �: " +novoaluno2.DataNasc);
		

	}

}
