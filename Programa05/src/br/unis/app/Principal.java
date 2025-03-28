package br.unis.app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoas pessoa01 = new Pessoas();
		
		pessoa01.nome = "André";
		pessoa01.idade = 35;
		pessoa01.sexo = 'M';
		
		System.out.println(pessoa01.getNascimento());
		
		pessoa01.getDados();	
	}

}
