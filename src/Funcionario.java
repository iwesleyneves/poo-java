//marley
public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100.0);
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Cargo: " + cargo + " | Salário: R$ " + String.format("%.2f", salario));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public class Main {
        public static void main(String[] args) {
            Funcionario f1 = new Funcionario("Carlos Silva", "Desenvolvedor", 5000.00);

            f1.exibirDados();
            f1.aumentarSalario(10.0);
            f1.exibirDados();
        }
    }
}