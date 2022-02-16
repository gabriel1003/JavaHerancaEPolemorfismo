
public class Cliente implements Autenticavel {
	
private String nome;
	private int senha;
	
@Override
public void setSenha(int senha) {
	this.senha= senha;
}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	public String getNOme() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
