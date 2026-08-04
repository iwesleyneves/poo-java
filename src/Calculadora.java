//wesley neves
public class Calculadora {
	
	
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}
	
	
	public static void main(String[] args) {
		
		double resultadoSoma = Calculadora.somar(10, 5);
		System.out.println("Soma: "+resultadoSoma);
		
		double resultadoSubtracao = Calculadora.subtrair(10, 5);
		System.out.println("Subtração: "+resultadoSubtracao);
		
		double resultadoMultiplicacao = Calculadora.multiplicar(10, 5);
		System.out.println("Multiplicação: "+resultadoMultiplicacao);
		
		double resultadoDivisao = Calculadora.dividir(10, 5);
		System.out.println("Divisão: "+resultadoDivisao);
	}
}
