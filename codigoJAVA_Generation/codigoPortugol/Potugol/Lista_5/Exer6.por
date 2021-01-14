programa
{
	
	funcao inicio()
	{
		/*
			Faça um programa que lê um vetor de 3 
			elementos e uma matriz de 3 x 3 elementos. 
			Em seguida o programa deve fazer a multiplicação 
			do vetor pelas colunas da matriz.
		*/
		inteiro i, j, m[3][3], v[3]

		//Capitura os elementos do vetor
		escreva("Os elementos do vetor são: \n")
		leia(i)
		para(i = 0; i < 3; i++)
		{
			escreva("Elemento: \n", i)
		}

		//Capitura os elementos da matriz
		escreva("Os elementos da matriz são: \n")
		leia(j)
		para(i = 0; i < 3; i++)
		{
			para(j = 0; j < 3; i++)
			{
				escreva("Elementos: \n", i, j)
			}
		}

		//multiplica vetor pelas colunas da matriz
		para(i = 0; i < 3; i++)
		{
			para(j = 0; j < 3; i++)
			{
				m[i][j] = v[i]*m[i][j]
			}
		}

		//exibe valores multiplicados
		escreva("multiplicação do vetor pelas colunas da matriz ", m[i][j])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */