package Heran�a_Encapsulamento;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa people = new Pessoa("Jo�o","Rua s�o Mariano","40028922",'M', 18);
		
		System.out.printf("Nome %s endere�o %s telefone %s do sexo %s com idade %d \n", people.getNome(), people.getEndereco(), people.getTelefone(), people.getSexo(), people.getIdade());
		
		
		Empregado work = new Empregado("Jo�o","Rua s�o Mariano","40028922",'M', 18, 3, 300, 0.005);
		
		
		
		System.out.printf("O codigo do setor %d o salario base %.2f imposto de %.2f ", work.getCodigoSetor(), work.getSalarioBase(), work.getImposto());
	}

}
