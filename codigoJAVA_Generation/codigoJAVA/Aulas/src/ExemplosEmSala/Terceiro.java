package ExemplosEmSala;

public class Terceiro extends Funcionario{
	
	private double valorTerceiro;
	
	public Terceiro(String nome, int horasMensais, double valorHora) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}
	
	@Override
	double pagamentoSalario(int horasMensais, double valorHora) {
		
		return((horasMensais * valorHora)+valorTerceiro);
	}
	
}
