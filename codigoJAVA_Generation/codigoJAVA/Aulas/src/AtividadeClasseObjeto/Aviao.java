package AtividadeClasseObjeto;

	/*
	 *2) Crie uma classe avião e apresente os atributos e 
	 *métodos referentes esta classe, em seguida crie um objeto 
	 *avião, defina as instancias deste objeto e apresente as
	 * informações deste objeto no console. 
	 */

//CLASSE
public class Aviao {
	
	//ATRIBUTOS
	int numero;
	String nomeAviao;
	double valor;
	String aviacao;
	
	//METODOS
	public Aviao() {
		
	}
	
	public Aviao(int numero, String nomeAviao, double valor) {
		
		this.numero = numero;
		this.nomeAviao = nomeAviao;
		this.valor = valor;
	}
	
	public Aviao(String aviacao) {
		this.aviacao = aviacao;
	}
}
