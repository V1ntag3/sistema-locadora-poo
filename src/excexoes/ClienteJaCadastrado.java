package excexoes;

public class ClienteJaCadastrado extends Exception {
	private static final long serialVersionUID = 1L;

	public ClienteJaCadastrado(String nome) {
		super("O cliente " + nome + " já foi cadastrado ");
	}
}
