package excexoes;

public class VeiculoJaCadastrado extends Exception {
	private static final long serialVersionUID = 1L;

	public VeiculoJaCadastrado(String placa) {
		super("O veiculo de placa " + placa + " ja foi cadastrado ");
	}
}
