package aula1poo;

public class Cao {
	String nome;
	String cor;
	int idade;
	double peso;
	
	public Cao() {
		cor = "Caramelo";
	}
	
	public Cao(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	private void Anda() {
		System.out.println("Estou andando..." + cor);
	}
	
	public void DadosCao() {
		System.out.println(nome + " " + idade);
	}
}
