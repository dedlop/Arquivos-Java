package br.unis.app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.depositar(50000);
		
		conta.saca(10000);
		
		System.out.println(conta.getSaldo());

	}

}
