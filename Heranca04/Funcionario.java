
public abstract class Funcionario {

	protected double salario;
	private String nome;
	
	public abstract double getBonificacao();

	public double getSalario() {
		return this.salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
