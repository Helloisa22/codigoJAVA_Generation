package AtividadeClasseObjeto;

	/*
	 * 6) Crie uma classe conta bancaria e apresente os atributos e
	 *  métodos referentes esta classe, em seguida crie um objeto conta
	 *   bancaria, defina as instancias deste objeto e apresente as 
	 *   informações deste objeto no console. 
	*/


public class ContaBancaria {
	
	String nome;
	String tipoConta;
	int numeroConta;
	String cpf;
	double valorEmConta;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nome, String tipoConta, int numeroConta, String cpf, double valorEmConta) {
		this.nome = nome;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.cpf = cpf;
		this.valorEmConta = valorEmConta;
	}
}
