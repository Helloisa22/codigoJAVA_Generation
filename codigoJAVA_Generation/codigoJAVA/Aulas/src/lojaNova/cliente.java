package lojaNova;

import java.util.Scanner;

public class cliente extends pessoa {
	
	public cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	
	private String cpf;

	public String getcpf() {
		return cpf;
	}
	
	public String corrigeCPF(String novoCPF) {
		String CPF = "a";
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira um novo CPF");
		novoCPF = leia.next();
		
		if(novoCPF != null) {
			CPF = novoCPF;
		}else {
			System.out.println("CPF � inv�lido");
		}
		return novoCPF;
	}
	
}
