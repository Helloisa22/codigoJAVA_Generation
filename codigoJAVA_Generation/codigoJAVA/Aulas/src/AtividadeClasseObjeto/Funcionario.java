package AtividadeClasseObjeto;

	/*
	 *4) Crie uma classe funcionário e apresente os 
	 *atributos e métodos referentes esta classe, em 
	 *seguida crie um objeto funcionário, defina as 
	 *instancias deste objeto e apresente as informações 
	 *deste objeto no console. 
	 */

public class Funcionario {
	
	String nome;
	String cargo;
	double salario;
	int horasTrabalhadas;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cargo, double salario, int horasTrabalhadas) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.horasTrabalhadas = horasTrabalhadas;
	}
}
