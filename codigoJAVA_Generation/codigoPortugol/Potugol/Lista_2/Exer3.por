programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		/*
			 Desenvolva um sistema em que:
			 -- Leia 4 (quatro) números;
			 -- Calcule o quadrado de cada um;
			 -- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			 -- Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		*/

		//variaveis
		inteiro NumA, NumB, NumC, NumD

		//Entrada
		escreva("Escreva o primeiro número: ")
		leia(NumA)

		escreva("Escreva o segundo número: ")
		leia(NumB)

		escreva("Escreva o terceiro número: ")
		leia(NumC)

		escreva("Escreva o quarto número: ")
		leia(NumD)

		inteiro NA1, NA2, NA3, NA4
		NA1 = (NumA * NumA)
		NA2 = (NumB * NumB)
		NA3 = (NumC * NumC)
		NA4 = (NumD * NumD)

		//Processamento
		se(NA3 >= 1000)
		{
			escreva("O resutado da terceira conta é maior que 1000")
		}
		senao
		{
			escreva("Resultado do primeiro: " + NA1 + "\n" +
				   "Resultado do segundo: " + NA2 +  "\n" + 
				   "Resultado do terceiro: " + NA3 +  "\n" +
				   "Resultado do quarto: " + NA4)  //Saidas
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1060; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */