package Banco;

import java.util.Random;
import java.util.Scanner;

public class banco_Individual {
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random randomico = new Random(); //objeto randomico
						
				String alunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
				char sexo[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
				final int numeroConta[]= new int[40];
		        double saldo=0.00, valor=0.0; 
		        final String NOMEUSUARIO= "Tesla";
		        final String CPF= "400.765.828-23";
		        String movimentacoes[] = new String[10];
			    int DATA = 0;
			    double limiteEmprestimo;
			    char opcao = '0',dia = '0';
			    int controle[] = new int[40];
			    int tipoConta[] = new int[40];
			    double limite []= new double [40];
			    
			    for (int x=0; x<40; x++)
    			{
    				limite[x]=randomico.nextInt(1000);
    			}
			    	   
			            //nome, conta, cpf, saldo
			    	    System.out.println("======== Banco Grupo 3 ==========\n");
			    	    System.out.println("Olá "+ NOMEUSUARIO+ "\n");
			    	    System.out.println("NÚMERO DA CONTA: "+ numeroConta+ "\n");
			    	    System.out.println("CPF: "+ CPF+ "\n");
			    	    System.out.println("SALDO: "+ saldo+ "\n");
			    	    System.out.println("=================================\n");
			    	    do
			    	    {
			    	    	////////GERAR CODIGO ALEATORIO PARA CONTAS PESSOAS//////////
			    	    	
			    	    	for (int x=0; x<40; x++)
			    			{
			    				controle[x] = (x+1);
			    				tipoConta[x]=randomico.nextInt(5)+1;
			    			}
			    	    	
			    	    	System.out.println("NUMERO\tTIPO CONTA\tNOME DA PESSOA");
			    	    	for (int x=0; x<40;x++)
			    			{
			    				System.out.printf("%d\t%d\t\t%s\n",controle[x],tipoConta[x],alunos[x]);
			    			}
			    	    	
			    	    	
			    	    	////////////////////////////////
			    	    	for(int i=0 ; i<10 ; i++)
			    	    	{
			    	    		System.out.println("\n"+NOMEUSUARIO+" deseja fazer um [1]saque um [2]depósito ou um [3]emprestimo ");
			    	    		opcao = teclado.next().charAt(0);
			    	    		if(opcao == '1') {
			    	    			System.out.println("Entre com o valor do saque: ");
			    	    			valor = teclado .nextDouble();
			    					if(saldo>=valor) {
			    						saldo = saldo-valor;
			    								System.out.println("operação realizada com sucesso\n SALDO ATUAL: "+saldo);
			    											
			    					} else {
			    						System.out.println("Saldo insuficiente para saque.\n SALDO ATUAL: "+saldo);
			    					}
			    	    			
			    	    		}
			    	    		else if(opcao == '2') {
			    	    			System.out.println("Entre com o valor do depósito: ");
			    	    			valor = teclado.nextDouble();
			    				if(valor<0) {
			    	    			System.out.println("Digite um número válido");
			    				}
			    				else {
			    					saldo = saldo+valor;
			    					System.out.println("operação realizada com sucesso.\n SALDO ATUAL: "+saldo);
			    					
			    				}
			    	    		}
			    	    			if(opcao == '3') {
			   
			    	    			int x = 0;
									limiteEmprestimo = limite[x];
									
									System.out.println("O valor do seu emprestimo é: " + limiteEmprestimo);
			    	    			
			    	    	 		System.out.println("Entre com o valor do emprestimo: ");
			    	    			valor = teclado.nextDouble();
			    				if(valor >limiteEmprestimo || valor<0) {
			    	    			System.out.println("Valor informado é maior que o saldo do emprestimo atual digite um número válido");
			    				}else {
			    					limiteEmprestimo = limiteEmprestimo-valor;
			    					saldo = saldo + valor;
			    					System.out.println("operação realizada com sucesso.\n SALDO ATUAL: "+saldo+ " seu limite emprestimo é: "+ limiteEmprestimo);
			    					}
			    	    		}
			    	    		
			    	    		
			    	  	}
			    	    	  System.out.println("\nDeseja ir para o próximo dia?\n[S]sim \n[N]não ");
			    	    	  dia = teclado.next().charAt(dia);
			    	    }
			    	    while(dia == 'S' || dia == 's');
			    	    System.out.println("\nSaldo atual: "+saldo);	
	}
}
