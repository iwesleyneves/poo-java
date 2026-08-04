//marley
public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
	
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque inválido.");
		} else if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }


    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public static void main(String[] args) {
    	ContaBancaria conta = new ContaBancaria("Maria", 1000.0);

        System.out.println("Saldo inicial: R$ " + conta.consultarSaldo());

        conta.depositar(500.0);  
        conta.sacar(200.0);     
        conta.sacar(2000.0);     

        System.out.println("Saldo final: R$ " + conta.consultarSaldo()); 
	}

}
	
