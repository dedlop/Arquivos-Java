package br.unis.app;

public class Carro extends Veiculo {
	
	public Carro(String c, int r, int v) {
		super(c,r,v);
		
		System.out.println("Cor: " + this.cor);
		System.out.println("Rodas: " + this.qtdRodas);
		System.out.println("Velocidade: " + this.velocidade);
	}
}
