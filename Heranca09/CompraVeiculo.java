
public class CompraVeiculo {
	public static void main(String[] args) {

		Carro car = new Carro("preto", "ronda");
		car.setModelo("fiat");
		System.out.println("O modelo do carro �: " +car.getModelo());
		car.setPreco(23000.00);
		System.out.println("O pre�o do carro �: " +car.getPreco());
		System.out.println("A comi��o do vendedor � de: " +car.getComicao());

		Moto moto = new Moto("breta", "YBR");
		moto.setPreco(10000);
		System.out.println("O modelo da moto �: " + moto.getModelo());
		System.out.println("O pre�o da m�to �: " + moto.getPreco());
		System.out.println("A comi��o paga ao vendedor �: " + moto.getComicao());
		try {
			moto.transfere(0);
		}
		catch (TransferenciaNulaException ex) {
			System.out.println("O valor n�o � valido: " +ex.getMessage());
		}
}
}
