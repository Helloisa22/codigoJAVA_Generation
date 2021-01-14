package lojaNova;

public abstract class pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	//CONSTRUTOR
	public pessoa(String nome, char genero, int anoNascimento) {
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	//METODO
	public int voltaIdade(int anoNascimento, int idadeAtual) {
		idadeAtual = 2020 - this.anoNascimento;
		return idadeAtual;
	}
}



