
public class Carro extends Componentes implements ValorComicao {
	
	public Carro(String cor, String modelo) {
		super(cor, modelo);
	}
	
	@Override
	public double getComicao() {
		return super.preco * 0.1;
	}
	
	@Override
	public void transfere(double valor) throws TransferenciaNulaException {
		double valorTransferencia = valor + super.preco * 0.5;
		super.transfere(valorTransferencia);
	}
}
