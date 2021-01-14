programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real celsius 
		real Fahrenheit 
		
		escreva("Digite a temperatura em grau Celsius: ")
		leia(celsius)

		Fahrenheit = (9*celsius+160)/5
		escreva("A temperatura em graus Fahrenheit é: " + Matematica.arredondar(Fahrenheit, 2) + " F")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */