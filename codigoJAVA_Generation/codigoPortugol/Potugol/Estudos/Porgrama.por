programa
{
	funcao inicio()
	{
		//Portugol tem tipagem forte
		cadeia  nomePessoa
		inteiro anoNascimento
		inteiro anoAtual
		
		escreva("Digite o nome da pessoa: ") //Nome da pessoa
		leia(nomePessoa)
		
		escreva("Qual o ano atual: ") //Data atual
		leia(anoAtual)
		
		escreva("Digite o ano do seu nascimento: ") //Data de Nascimento
		leia(anoNascimento)
		
		escreva("oi " + nomePessoa + " estamos na Generation, a sua idade aproximadamente é: " + (anoAtual-anoNascimento))
		/*O resultado tem que ser o ano atual menos o ano de nascmento da passoa e tem quw trazer a idade*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */