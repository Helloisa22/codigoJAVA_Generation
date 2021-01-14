package AtividadeClasseObjeto;

	/*
	 * Crie uma classe paciente e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto paciente, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console. 
	 */

public class Paciente {
	
	String nome;
	int numero;
	String ala;
	String situacao;
	String doenca;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, int numero, String ala, String situacao, String doenca) {
		this.nome = nome;
		this.numero = numero;
		this.ala = ala;
		this.situacao = situacao;
		this.doenca = doenca;
	}
}
