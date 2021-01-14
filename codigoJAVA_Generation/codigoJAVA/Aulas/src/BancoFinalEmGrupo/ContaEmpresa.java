package BancoFinalEmGrupo;

import java.util.Scanner;
public class ContaEmpresa extends Conta {

	private double emprestimoEmpresa;
	
	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
		
	}
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void emprestar(double valorEmprestimo)
	{
		if(valorEmprestimo<=this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.saldo=this.saldo+valorEmprestimo;
			System.out.printf("Seu saldo emprestimo atual � %.2f \n",this.emprestimoEmpresa);
			//System.out.printf("SEU SALDO ATUAL %.2f \n ",this.saldo);
		}
		else 
		{
			System.out.println("OPERA��O INV�LIDA");
		}
		
		
	}
	
	
}