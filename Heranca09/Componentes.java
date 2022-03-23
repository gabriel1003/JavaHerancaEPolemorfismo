
public abstract class Componentes {

	protected double preco;
	private int portas;
	private String cor;
	private String modelo;
	private static int totalVendas = 0;

	public Componentes(String cor, String modelo) {
		Componentes.totalVendas ++;
		System.out.println("A quantidade de veículos vendidos é: " +Componentes.totalVendas);
		this.cor = cor;
		this.modelo = modelo;
	}
		public void transfere(double valor) throws TransferenciaNulaException {
			if(this.preco > valor) {
			throw new TransferenciaNulaException("valor: " +this.preco + ", insuficiente: " +valor);
			}
		}
		
		public static int getTotalVendas() {
			return Componentes.totalVendas;
		}
		public String getCor() {
			return this.cor;
		}
		public String getModelo() {
			return this.modelo;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
	
		public double getPreco() {
			return this.preco;
		
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getPortas() {
			return this.portas;
		}
		
		public void setPortas(int portas) {
			this.portas = portas;
		}
}
