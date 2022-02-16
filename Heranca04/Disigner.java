
public class Disigner extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() + 200;
	}
}
