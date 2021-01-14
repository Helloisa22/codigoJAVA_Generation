programa
{
	
	funcao inicio()
	{
		/*
			Leia o nome do Aluno (Cadei)
			Nota
			"Oi aluno, aprovado ou aprovado" menino ou menina
			
			até 5 reprovado
			depois de 6 aprovado
		*/

		cadeia nomeAluno
		caracter genero
		inteiro nota

		escreva("Qual o seu Genero? [F]Feminino, [M]Masculino e [O]Outros: ")
		leia(genero)
		escreva("Qual o nome do aluno(a): ")
		leia(nomeAluno)
		escreva("Qual a nota do Aluno: ")
		leia(nota)

		se (genero == 'M' ou genero == 'm'){
			escreva("Aluno: " + nomeAluno + "\n")
		}
		senao se (genero =='F' ou genero == 'f') {
			escreva("Aluna: " + nomeAluno + "\n")	
		}
		senao se (genero =='O' ou genero =='o'){
			escreva("Aluno(a): "+ nomeAluno + "\n")	
		}
		senao {
			escreva("VC ESCOLHEU UMA TECLA ERRADA!!!")	
		}


		se (nota >= 6)
   		{
   			escreva("O aluno aprovado com sucesso!")
   		}
   		senao se (nota >= 5)
   		{
   			escreva("O aluno Reprovado")
   		}
		
		escreva("\nFim de programa")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */