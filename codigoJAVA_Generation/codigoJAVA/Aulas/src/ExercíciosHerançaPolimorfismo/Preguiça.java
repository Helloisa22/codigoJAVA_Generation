package Exerc�ciosHeran�aPolimorfismo;

public class Pregui�a  extends Animal{
	private String subirArvore;

	public Pregui�a(String nome, int idade, String emitirSom, boolean corre) {
		super(nome, idade, emitirSom, corre);
	}
	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

}
