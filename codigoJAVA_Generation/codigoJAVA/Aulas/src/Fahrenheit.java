import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float celsius; 
		float Fahrenheit; 
		
		System.out.println("Digite a temperatura em grau Fahrenheit: ");
		Fahrenheit = leia.nextFloat();

		celsius = (5*(Fahrenheit-32))/9; //C = (5 * (F-32) / 9)
		System.out.println("A temperatura em graus celsius é: " + Math.round(celsius) + " °C");

	}

}
