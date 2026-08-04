
public class Retangulo {
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}


	public Retangulo() {
	}
	
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (this.base + this.altura);
	}
	
	public static void main(String[] args) {
		
		
		Retangulo retangulo1 = new Retangulo(5.0, 3.0);
		
		double area = retangulo1.calcularArea();
		System.out.println("Area: "+area);
		
		double perimetro = retangulo1.calcularPerimetro();
		System.out.println("Perimetro: "+perimetro);
	}
}
