programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real celsius 
		real Fahrenheit 
		
		escreva("Digite a temperatura em grau Fahrenheit: ")
		leia(Fahrenheit)

		celsius = (5*(Fahrenheit-32))/9 //C = (5 * (F-32) / 9)
		escreva("A temperatura em graus celsius é: " + Matematica.arredondar(celsius, 2) + " °C")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */