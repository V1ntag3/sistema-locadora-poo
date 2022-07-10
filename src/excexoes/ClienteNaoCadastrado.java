package excexoes;

public class ClienteNaoCadastrado extends Exception {
	private static final long serialVersionUID = 1L;

	public ClienteNaoCadastrado(String nome) {
		super("O cliente " + nome + " não foi cadastrado ");
	}
}
