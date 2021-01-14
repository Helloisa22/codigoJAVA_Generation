package Lista2;

import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idadeNadador;

		//entrada
		System.out.println("Qual a idade do nadador: ");
		idadeNadador = teclado.nextInt();

		//processamento
		if(idadeNadador <= 4)
    	{
    		System.out.println("Crianças menores que 4 anos não pode nadar");
		}
		else if (idadeNadador >= 5 && idadeNadador <= 7)
   		{
   			System.out.println("Infantil A");
   		}
		else if (idadeNadador >= 8 && idadeNadador <= 11)
   		{
   			System.out.println("Infantil B");
   		}
		else if (idadeNadador >= 12 && idadeNadador <= 13)
   		{
   			System.out.println("Juvenil A");
   		}
		else if (idadeNadador >= 14 && idadeNadador <= 17)
   		{
   			System.out.println("Juvenil B");
   		}
		else
   		{
   			System.out.println("Maiores de 18 anos são Adultos"); //Saidas
   		}
	}
}
