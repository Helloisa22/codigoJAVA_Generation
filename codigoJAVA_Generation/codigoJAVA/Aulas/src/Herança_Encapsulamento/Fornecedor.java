package Herança_Encapsulamento;

public class Fornecedor extends Pessoa {

	private  double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor(String nome, String endereco, String telefone, char sexo, int idade, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone, sexo, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double valorCredito, double valorDivida) {
		
		return(this.valorCredito - this.valorDivida);
	}
	
}
