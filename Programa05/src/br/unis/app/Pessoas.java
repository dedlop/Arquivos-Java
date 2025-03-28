package br.unis.app;

public class Pessoas {
	
	public String nome;
	public int idade;
	public char sexo;
	
	public int getNascimento() {
		int nascimento = 2023 - this.idade;
		
		return nascimento;
	}
	
	public void getDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
	}

}
