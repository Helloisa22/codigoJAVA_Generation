package AtividadeClasseObjeto;

	/*
	 *2) Crie uma classe avi�o e apresente os atributos e 
	 *m�todos referentes esta classe, em seguida crie um objeto 
	 *avi�o, defina as instancias deste objeto e apresente as
	 * informa��es deste objeto no console. 
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
