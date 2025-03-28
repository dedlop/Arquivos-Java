package br.unis.app;

public class Conta {
	
	public int conta;
	private double saldo = 100;
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
