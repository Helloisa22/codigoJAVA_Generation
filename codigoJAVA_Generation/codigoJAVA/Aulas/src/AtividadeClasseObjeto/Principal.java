package AtividadeClasseObjeto;

public class Principal {

	public static void main(String[] args) {
		
		Cliente room = new Cliente();
		Aviao airplane = new Aviao();
		Eletronico eletric = new Eletronico();
		Funcionario employee = new Funcionario();
		Patinete Scooter = new Patinete();
		ContaBancaria Bank = new ContaBancaria();
		Paciente Patient = new Paciente();
		
		room.nome = "Ana";
		room.cpf = "005.006.007.06";
		room.tamanho = 23;
		
		System.out.printf("O nome do cliente � %s\t o CPF �: %s O tamanho �: %d.\n", room.nome, room.cpf, room.tamanho);
		
		
		airplane.valor = 1300;
		airplane.nomeAviao = "Boeing";
		airplane.numero = 787;
		airplane.aviacao = "Via��o Garcia";
		
		System.out.printf("O avi�o %s, n� %d, tem valor de %f, pertence a %s \n", airplane.nomeAviao, airplane.numero, airplane.valor, airplane.aviacao);
		
		
		eletric.caracteristica = "Sistema Operacional. Android iOS 9";
		eletric.nome = "LG G5";
		eletric.quantidade = 10;
		eletric.valor = 1200;
		
		System.out.printf("Celular %s, com %s, valor %f, cont�m %d unidade. \n",eletric.nome, eletric.caracteristica, eletric.valor, eletric.quantidade);
		
		
		employee.cargo = "Analista";
		employee.horasTrabalhadas = 29 ;
		employee.nome = "Antonio";
		employee.salario = 2000;
		
		System.out.printf("Empresa TOTVS funcion�rio %s, cargo de %s, teve %d horas trabalhadas, com salario de %f \n",employee.nome, employee.cargo, employee.horasTrabalhadas, employee.salario);
		
		
		Bank.nome = "Raul";
		Bank.cpf = "006.007.008.008";
		Bank.numeroConta = 004;
		Bank.tipoConta = "Corrente";
		Bank.valorEmConta = 200;
		
		System.out.printf("Banco BB, tipo conta %s, numero conta %d dono da conta %s, CPF %s, valor em conta %f \n", Bank.numeroConta, Bank.numeroConta, Bank.nome, Bank.cpf, Bank.valorEmConta);
		
		
		Patient.ala = "UTI";
		Patient.doenca = "Peneumonia";
		Patient.nome = "Patrick";
		Patient.numero = 057;
		Patient.situacao = "Est�vel";
		
		System.out.printf("Hospital Vila Celina paciente %s, doen�a %s, N� %d, a ala que ele est� � %s, siatua��o atual %s ",Patient.nome, Patient.doenca, Patient.numero, Patient.ala, Patient.situacao);
	}

}
