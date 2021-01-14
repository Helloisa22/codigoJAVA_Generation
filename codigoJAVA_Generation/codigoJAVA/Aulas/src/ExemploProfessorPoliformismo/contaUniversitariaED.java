package ExemploProfessorPoliformismo;

public class contaUniversitariaED extends contaEspecialED
{
	private double emprestimoUniversitario;

	
	//construtor
	public contaUniversitariaED(int numeroConta, double valorLimite, double emprestimoUniversitario) {
		super(numeroConta, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

	//encapsulamento - getters and setters
	
	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	
	
}