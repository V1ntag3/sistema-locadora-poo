package excexoes;

public class VeiculoNaoAlugado extends Exception {
	private static final long serialVersionUID = 1L;

	public VeiculoNaoAlugado(String placa) {
		super("O veiculo de placa " + placa + " não foi alugado ");
	}
}
