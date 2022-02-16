
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é: " +Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma nova conta: " +this.agencia);
	}

	public double getSaldo() {
		return this.saldo;
	}
	

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public abstract void deposita(double valor);
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
