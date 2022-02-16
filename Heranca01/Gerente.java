//Teremos aqui duas formas de acessar o salario da class m�e.

public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Desta maneira acessamos a bonifica��o.
	
//	public double getBonificacao() {
//		return super.salario;
//	}
	
	//Desta forma � quando queremos tornar a bonifica��o maior, por meio de um c�lculo.
	
//	public double getBonificacao() {
//		return this.salario * 0.1 + super.salario;
//	}
	
	//desta forma acessamos mesmo com o atributo privado.
	
public double getBonificacao() {
	return super.getBonificacao() + super.getSalario();
}
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
