package excexoes;

public class VeiculoNaoCadastrado extends Exception {
	private static final long serialVersionUID = 1L;

	public VeiculoNaoCadastrado(String placa) {
		super("O veiculo de placa " + placa + " n�o foi cadastrado ");
	}
}
