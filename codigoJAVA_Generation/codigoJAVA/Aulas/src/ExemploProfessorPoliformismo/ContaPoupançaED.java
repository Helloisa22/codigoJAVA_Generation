package ExemploProfessorPoliformismo;

public class ContaPoupançaED  extends ContaED 
{
	//atributo
	private int dataAniversarioConta;
	
	
	//construtor
	public ContaPoupançaED(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	
	//ENCAPSULAMENTO - GETTER AND SETTERS
	
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	public void correcaoPoupanca(int dataAtual) {
		
		if (dataAtual == this.dataAniversarioConta) {
			super.credito((super.getSaldo()*0.005));
			
			
			
		}
	}
	
}