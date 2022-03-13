
public class CompraVeiculo {
	public static void main(String[] args) {

		Carro car = new Carro("preto", "ronda");
		car.setModelo("fiat");
		System.out.println("O modelo do carro é: " +car.getModelo());
		car.setPreco(23000.00);
		System.out.println("O preço do carro é: " +car.getPreco());
		System.out.println("A comição do vendedor é de: " +car.getComicao());

		Moto moto = new Moto("breta", "YBR");
		moto.setPreco(10000);
		System.out.println("O modelo da moto é: " + moto.getModelo());
		System.out.println("O preço da móto é: " + moto.getPreco());
		System.out.println("A comição paga ao vendedor é: " + moto.getComicao());
		try {
			moto.transfere(0);
		}
		catch (TransferenciaNulaException ex) {
			System.out.println("O valor não é valido: " +ex.getMessage());
		}
}
}
