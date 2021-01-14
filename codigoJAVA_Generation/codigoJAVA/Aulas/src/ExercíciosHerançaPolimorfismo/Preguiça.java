package ExercíciosHerançaPolimorfismo;

public class Preguiça  extends Animal{
	private String subirArvore;

	public Preguiça(String nome, int idade, String emitirSom, boolean corre) {
		super(nome, idade, emitirSom, corre);
	}
	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

}
