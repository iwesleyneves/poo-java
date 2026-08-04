
public class Main {
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
