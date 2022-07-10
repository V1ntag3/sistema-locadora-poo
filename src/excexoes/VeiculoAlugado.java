package excexoes;

public class VeiculoAlugado extends Exception {
	private static final long serialVersionUID = 1L;

	public VeiculoAlugado(String placa) {
		super("O veiculo de placa " + placa + " ja foi alugado ");
	}
}
