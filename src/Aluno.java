public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		return (nota1 + nota2) / 2.0;
	}
	
	
	public void verificarSituacao() {
		double media = calcularMedia();
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media >= 5.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Recuperação");
		}
			
	}	
	
	
	public String getNome() {
				return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
	
	
	public static void main(String[] args) {
		// teste classe aluno
		
		Aluno aluno1 = new Aluno("Breno", 8.0, 7.5);
		System.out.println("Media de " + aluno1.getNome() + ": " + aluno1.calcularMedia());
		System.out.println("Situação: ");
		aluno1.verificarSituacao();
	}
}
