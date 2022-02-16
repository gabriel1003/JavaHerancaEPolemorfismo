
public class TestaGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel ");
		g1.setSalario(5000);
		g1.setSenha(222);
		System.out.println("o seu salario é de: " + g1.getSalario());
		System.out.println("o seu nome é: " + g1.getNome());
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		System.out.println("a sua bonificação é de: " + g1.getBonificacao());
	}
}
