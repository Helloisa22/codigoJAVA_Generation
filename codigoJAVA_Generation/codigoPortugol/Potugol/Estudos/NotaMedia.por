programa
{
	
	funcao inicio()
	{
		cadeia materia[4]
		inteiro notas[4], media = 0
		caracter genero
		
		materia[0]="PORTUGUES" //POSIÇÃO E CARREGAMENTO DO VETOR
		materia[1]="MATEMATICA"
		materia[2]="CIENCIAS"
		materia[3]="ARTES"

		escreva("Qual o seu genero F-Feminino M-Masculino O-Outros: ")
		leia(genero)

		para (inteiro x = 0; x < 4; x++){
			escreva(materia[x],"\n")
			escreva("Digite a nota: ")
			leia(notas[x])
		}
		
			se (genero == 'F' ou genero == 'f'8)
			{
				media = ((notas[0] + notas[1] + notas[2] + notas[3])/ 4)
				escreva("\n","Aluna sua média é", " - ",media)
			} senao se (genero == 'M' ou genero == 'm')
			{
				media = ((notas[0] + notas[1] + notas[2] + notas[3])/ 4)
				escreva("\n","Aluno sua média é", " - ",media)
			} senao se (genero == 'O' ou genero == 'o')
			{
				media = ((notas[0] + notas[1] + notas[2] + notas[3])/ 4)
				escreva("\n","Sua média é", " - ",media)
			}

			se (media >= 5)
			{
				escreva("\nVocê foi Aprovada")
			} senao
			{
				escreva("\nReprovada")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 959; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */