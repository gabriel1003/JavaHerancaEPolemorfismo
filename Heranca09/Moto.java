
public class Moto extends Componentes implements ValorComicao {

	public Moto(String cor, String modelo) {
		super(cor, modelo);
	}
	
	@Override
	public double getComicao() {
		return super.preco * 0.07;
	}
	
	@Override
	public void transfere(double valor) throws TransferenciaNulaException {
		double valorTransferencia = valor + + 5000;
		super.transfere(valorTransferencia);
	}
}
