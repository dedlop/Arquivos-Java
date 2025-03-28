package br.clinica;

public class Paciente {
	
	private String nome;
	private int idade;
	private char sexo;
	private String condicao;
	
	public Paciente(String nome, int idade, char sexo, String condicao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.condicao = condicao;
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Condição: " + this.condicao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
			
}
