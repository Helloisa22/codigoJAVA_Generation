programa
{
			/*NUMERO CONTA
		SALDO
		EMPRESTIMO EMPRESA
		CPF
		- DEBITO E CREDITO POR DIA
		- SOLICITAR UM EMPRESTIMO DEFINI O VALOR POSSIVEL E SE SIM COLOCAR SALDO*/
	
	funcao inicio()
	{
		//
		cadeia numeroConta = "0001"
		real saldo = 0.00, valor = 0.00
		const cadeia NOMEUSUARIO = "Tesla"
		const cadeia CPF= "400.765.828-23"
		caracter opcao, dia
		//NOME, CONTA, CPF, SALDO

		//nome, conta, cpf, saldo
	    escreva("======== Banco Grupo 3 ==========\n")
	    escreva("Olá ", NOMEUSUARIO, "\n")
	    escreva("NÚMERO DA CONTA: ", numeroConta, "\n")
	    escreva("CPF: ", CPF, "\n")
	    escreva("SALDO: ", saldo, "\n")
	    escreva("=================================\n")

		faca
		{
			escreva("Para solicitar um emprestimo digite[1], finalizar transação digite[2]: ")
			leia(opcao)
			se(opcao == '1')
			{
				escreva("insira o saldo: ")
				leia(valor)
				saldo = saldo + valor
			}senao {
				escreva("Transação finalizada seu saldo é: ", saldo)
			}
			escreva("Deseja ir para o próximo dia?\n[S]sim\n[N]não")
	    	  	leia(dia)
		}enquanto(dia == 'S' ou dia == 's')
			escreva("Seu saldo do dia: ")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 793; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */