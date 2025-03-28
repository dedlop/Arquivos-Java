package br.unis.app;

public class Aviao extends Veiculo {
	
	public int qtdAsas;
	
	public Aviao(String c, int r, int v, int a) {
		super(c,r,v);
		
		this.qtdAsas = a;
		
		System.out.println("Cor: " + this.cor);
		System.out.println("Rodas: " + this.qtdRodas);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Asas: " + this.qtdAsas);
	}

}
