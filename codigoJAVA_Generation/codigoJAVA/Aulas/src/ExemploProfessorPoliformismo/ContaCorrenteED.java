package ExemploProfessorPoliformismo;

public class ContaCorrenteED extends ContaED 
{
	protected int numeroTalaoCheque;

	
	//construtor
	public ContaCorrenteED(int numeroConta) {
		super(numeroConta);
	}
	public ContaCorrenteED(int numeroConta, String cpf) {
		super(numeroConta, cpf);
	}

	//ENCAPSULAMENTO
	
	public int getNumeroTalaoCheque() {
		return numeroTalaoCheque;
	}

	public void setNumeroTalaoCheque(int numeroTalaoCheque) {
		this.numeroTalaoCheque = numeroTalaoCheque;
	}
	
	
	
}