programa
{
	
	funcao inicio()
	{
		/*Ler inteiro 
		diser se par ou impar 
		se não for valido diser 
		ou diser se ele digitou 0 */

		//Variaveis
		inteiro numeroA

		//entrada
		escreva("Digite um número inteiro: ")
		leia(numeroA)

		//processamento e Saidas
		se (numeroA % 2  == 0){
				escreva("O número ", numeroA, " é par")
		}senao {
				escreva("O número ", numeroA, "é ímpar")
			}
			
		}senao{
			escreva("Valor digitado é invalido! Digite um valor maior que zero e que seja positivo")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */