package AtividadeClasseObjeto;
	
	/*
	 * 3) Crie uma classe produto eletr�nico e apresente os atributos
	 *  e m�todos referentes esta classe, em seguida crie um objeto
	 *   produto eletr�nico, defina as instancias deste objeto e 
	 *   apresente as informa��es deste objeto no console.
	 */

public class Eletronico {
	
	String nome;
	double valor;
	String caracteristica;
	int quantidade;
	
	public Eletronico() {
		
	}
	
	public Eletronico(String nome, double valor, String caracteristica, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.caracteristica = caracteristica;
		this.quantidade = quantidade;
	}
	
	
}
