
public class ProjetoInterface {
	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(222);
		g.setNome("Gabriel");
		System.out.println(g.getNome());
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		Cliente cl = new Cliente();
		cl.setNome("Lucas");
		si.autentica(cl);
	}
}
