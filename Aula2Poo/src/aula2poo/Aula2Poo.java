package aula2poo;

public class Aula2Poo {

	public static void main(String[] args) {
		
		Cao cachorro = new Cao();
		cachorro.setIdade(5);
		
		if(cachorro.VerificarIdade()) {
			System.out.println("ele é idoso");
		}
		else {
			System.out.println("é novinho");
		}

	}

}
