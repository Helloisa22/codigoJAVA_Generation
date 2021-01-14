programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dias, tempoDias = 0
		
		escreva("Digite o tempo em dias: ")
		leia(tempoDias)

		ano = (tempoDias/365)
		mes = (tempoDias%365)/30
		dias = (tempoDias%365)%30
		
		escreva("Ano(s): " + ano + " - mes(es): " + mes + " e " + dias + " dia(s).")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */