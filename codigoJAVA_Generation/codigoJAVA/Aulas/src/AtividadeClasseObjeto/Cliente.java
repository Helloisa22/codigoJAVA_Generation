package AtividadeClasseObjeto;

	/*
	 *1) Crie uma classe cliente e apresente os atributos
	 * e métodos referentes esta classe, em seguida crie um 
	 * objeto cliente, defina as instancias deste objeto e
	 *  apresente as informações deste objeto no console. 
	 */

//CLASSE
public class Cliente {
	
	//ATRIBUTOS
	String nome;
	String cpf;
	int tamanho;
	
	//METODOS
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Cliente(int tamanho) {
		
		this.tamanho = tamanho;
	}
}
