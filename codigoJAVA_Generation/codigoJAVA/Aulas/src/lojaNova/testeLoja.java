package lojaNova;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class testeLoja {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//cliente fregues = new cliente("Joao", );
		int tamanho = 80; char opcao; String nomeCliente ="";
		
		//usar uma interface
		List<Produto> prodlista = new ArrayList<>();
		
		prodlista.add(new Produto("pacote push pop","BEST-001",50.25));
		prodlista.add(new Produto("pacote balas caramelizadas","BEST-002",80.00));
		prodlista.add(new Produto("pacote tortilhas doces","BEST-003",20.00));
		prodlista.add(new Produto("pacote tortilhas salgadas","BEST-003",20.00));
		prodlista.add(new Produto("pacote balas amargas","BEST-003",20.00));
		prodlista.add(new Produto("pacote balas de coco","BEST-003",20.00));
		prodlista.add(new Produto("pacote pão de mel","BEST-003",20.00));
		prodlista.add(new Produto("pacote bala caramelo","BEST-003",20.00));
		prodlista.add(new Produto("pacote baton maluco","BEST-003",20.00));
		prodlista.add(new Produto("pacote moedas de chocolate","BEST-003",20.00));
		
		linha(tamanho);
		System.out.println("\n═                              Sugary Sweets                                   ═");
		System.out.println("═                       Sua vontade na palma da mão!                           ═");
		linha(tamanho);
		System.out.println();
		
		System.out.println("PRODUTOS PARA COMPRA");
		System.out.println("CODIGO\t\tVALOR UNITARIO\t\tPRODUTO");
		for (Produto visao : prodlista) 
		{
			System.out.println(visao.getcodigoProduto()+"\t  "+ visao.getPrecoUnitario()+"\t\t\t"+visao.getNomeProduto());
		}
		linha(tamanho);
	}
	
	
	
	//FUNCAO
		static void linha(int tamanho) {
			for(int x =0; x<tamanho; x++) {
				System.out.print("═");
			}
		}
		
}
