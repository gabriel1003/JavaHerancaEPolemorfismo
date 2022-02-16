
public class ByteBank {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 1254);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(132, 1984);
		cp.deposita(200.0);
		cc.transfere(10.0, cp);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("cp: " + cp.getSaldo());
	}
}
