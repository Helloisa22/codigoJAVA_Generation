import java.util.Scanner;

public class Lista1_Atividade3 {
	
	public static void main(String[] args)
	{
		/*
		 * Faça um sistema que leia o tempo de 
		 * duração de um evento em uma fábrica expressa 
		 * em segundos e mostre-o expresso em horas, minutos e segundos.
		 *
		 */
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int tempoSegundos; int horas; int minutos; int segundos;

		//entradas
		System.out.println("digite o tempo em segundos: ");
		tempoSegundos = leia.nextInt();

		//processamentos
		horas = (tempoSegundos / 3600); //downcasting
		//Saidas de informações
		System.out.println("\nHora[s]: "+ horas);
		minutos = ((tempoSegundos % 3600) / 60);
		System.out.println("\nMinuto[s]: "+ minutos);
		segundos = ((tempoSegundos % 3600) % 60);
		System.out.println("\nSegundo[s]: "+ segundos);
	
	}
}
