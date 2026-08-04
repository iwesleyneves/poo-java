
public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Pessoa() {
		
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa("Wesley", 23, 1.70);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Marley");
		pessoa2.setIdade(20);
		pessoa2.setAltura(1.74);
		
		pessoa1.exibirDados();
		
		pessoa2.exibirDados();
	}
}
