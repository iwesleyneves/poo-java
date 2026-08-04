//wesley neves
public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public Produto() {
	}
	
	public void adicionarEstoque(int quantidade) {
		this.estoque += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		if(quantidade <= this.estoque) {
			this.estoque -= quantidade;
		} else {
			System.out.println("Quantidade insuficiente em estoque.");
		}
	}
	
	public double calcularValorTotalEstoque() {
		return this.preco * this.estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public static void main(String[] args) {
		
		Produto prod = new Produto("Celular", 1500.00, 10);
		System.out.println("Estoque atual: " + prod.getEstoque());
		
	    System.out.println("Valor total em estoque: R$ " + prod.calcularValorTotalEstoque());
	    
	    prod.adicionarEstoque(5);
	    
	    prod.removerEstoque(3);
	    
	    System.out.println("Estoque atual: " + prod.getEstoque());
	    System.out.println("Novo valor total: R$ " + prod.calcularValorTotalEstoque());
	}
	
}
