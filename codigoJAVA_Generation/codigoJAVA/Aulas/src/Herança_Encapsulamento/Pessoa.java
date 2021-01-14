package Heran�a_Encapsulamento;

public class Pessoa {
	
	private String nome; 
	private String endereco; 
	private String telefone;
	private char sexo;
	private int idade;
	
	public Pessoa(String nome, String endereco, String telefone, char sexo, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endere�o) {
		this.endereco = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
