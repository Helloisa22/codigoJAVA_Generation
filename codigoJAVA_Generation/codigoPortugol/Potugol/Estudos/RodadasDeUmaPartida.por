programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		inteiro pontosCorinthians=0, pontosPalmeiras=0, pontosSantos=0, pontosSPFC=0
		const inteiro limite=4
		caracter opcao
		escreva ("\n------------------------------------------------------")
		escreva ("\n      Sistema de Controle de pontos				 ")
		escreva ("\n------------------------------------------------------")
		
		para (inteiro  rodadas=1;rodadas<=limite;rodadas++){
			escreva( "\n"+ rodadas +"°Rodade:\nDigite [G] GANHOU, [E] EMPATOU OU [P] PERDEU: ")
			escreva("\nCorinthians: ")
			leia(opcao)
				se(opcao=='G'){
					 pontosCorinthians= pontosCorinthians+3
				}
				senao se(opcao=='E'){
					 pontosCorinthians= pontosCorinthians+1
				}
				senao se(opcao=='P'){
					 pontosCorinthians=pontosCorinthians
				}
				senao{
					escreva( "Opção invalida\n")
				}
			escreva("Palmeiras: ")
			leia(opcao)
				se(opcao=='G'){
					 pontosPalmeiras+=3
				}
				senao se(opcao=='E'){
					 pontosPalmeiras+=1
				}
				senao se(opcao=='P'){
					pontosPalmeiras=pontosPalmeiras
				}
				senao{
					escreva( "Opção invalida\n")
				}
			escreva("Santos: ")
			leia(opcao)
				se(opcao=='G'){
					 pontosSantos+=3
				}
				senao se(opcao=='E'){
					 pontosSantos+=1
				}
				senao se(opcao=='P'){
					pontosSantos=pontosSantos
				}
				senao{
					escreva( "Opção invalida\n")
				}
			escreva("SPFC: ")
			leia(opcao)
				se(opcao=='G'){
					 pontosSPFC+=3
				}
				senao se(opcao=='E'){
					  pontosSPFC+=1
				}
				senao se(opcao=='P'){
					 pontosSPFC=pontosSPFC
				}
				senao{
					escreva( "Opção invalida\n")
				}
		}
		escreva ("\n------------------------------------------------------")
		escreva ("\n    	  Resultados das 4° rodadas                   ")
		escreva ("\n------------------------------------------------------")
		escreva ("\nCorinthias: "+ pontosCorinthians)
		escreva("\nPalmeiras: "+ pontosPalmeiras)
		escreva("\nSantos: "+ pontosSantos )
		escreva("\nSPFC: "+ pontosSPFC)
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */