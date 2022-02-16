//Aqui teremos as duas formas de tornanr este atributo acessado por outra class.

public class Funcionario {

	private String nome;
	private String cpf;
//	protected double salario; //desta forma tornamos este atributo visivel pela class filha e somente por ela.
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSalario( ) {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
