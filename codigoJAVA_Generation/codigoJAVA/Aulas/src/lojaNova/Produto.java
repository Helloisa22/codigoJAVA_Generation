package lojaNova;

public class Produto {
	
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	//CONSTRUTOR
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario) {
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
	}
	
	//ENCAPSULAMENTO
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getcodigoProduto() {
		return codigoProduto;
	}
	public void setcodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	//METODO
	 public void tiraEstoque(int saida) {
		 
		 if(testarEstoque(saida)) {
			 this.qtdeProdutoEstoque += saida;
		 }
		 else 
			{
				System.out.println("ESTOQUE INDISPONIVEL");
			}
		 //saida = this.qtdeProdutoEstoque - this.qtdeProdutoEstoque;
	 }
	 
	 public void adicionaEstoque(int entrada) {
		 //entrada = this.qtdeProdutoEstoque + this.qtdeProdutoEstoque;
		 this.qtdeProdutoEstoque += entrada;
	 }
	 
	 /*public double venda(int qtdeVendida) {
		return qtdeVendida++;
		 
	 }*/
	 
	 public double venda(int qtdeVendida) 
		{
			
			if (testarEstoque(qtdeVendida))
			{
				tiraEstoque(qtdeVendida);
				return qtdeVendida * this.precoUnitario;
			
			} 
			else 
			{
				System.out.println("Venda negada!!!");
				return 0;
			}
		
		
		}
	 
	 public boolean testarEstoque(int valor) 
		{
			
			if (valor > this.qtdeProdutoEstoque) 
			{
				return false;
			}
			else if (valor == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque < 0)
			{
				return false;
			}
			else	
			{
				return true;
			}
			
		}
}


