
public class ByteBank {
public static void main(String[] args) {
	Conta cc = new ContaCorrente(1245, 12);
	cc.deposita(100);
	System.out.println(cc.getSaldo());
}
}
