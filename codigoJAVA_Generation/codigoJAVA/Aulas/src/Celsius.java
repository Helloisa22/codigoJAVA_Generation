import java.util.Scanner;

public class Celsius {
	
	public static void main(String args [])
	{
		Scanner leia = new Scanner (System.in);
		
		float celsius; float Fahrenheit = 0; 
		
		System.out.println("Digite a temperatura em grau Celsius: ");
		celsius = leia.nextFloat();

		Fahrenheit = (9*celsius+160)/5;
		System.out.println("A temperatura em graus Fahrenheit é: " + Math.round(Fahrenheit) + " °F");
	}
}
