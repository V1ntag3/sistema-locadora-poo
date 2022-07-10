package classesPrincipais;

public class Moto extends Veiculo {
	/**********************************************************************************************************************************************************************************************
	 * Variavel especifica de moto;
	 ***********************************************************************************************************************************************************************************************/
	private int cilindradas;

	public Moto(String string, String string2, int i, String string3, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		setMarca(string);
		setModelo(string2);
		setAno_fab(i);
		setPlaca(string3);
		setValorDiaria(j);
		setValorAvaliado(k);
		setCilindradas(l);
	}

	public Moto() {
		// TODO Auto-generated constructor stub
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos de entradas e saida de dados;
	 ***********************************************************************************************************************************************************************************************/
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
		setTipo();
		setSeguro();
	}

	public void setSeguro() {
		double seguro = getValorAvaliado() * 0.11 / 365;
		this.seguro = seguro;
	}

	public void setTipo() {
		int tipo = 1;
		this.tipo = tipo;
	}

	public String toString() {
		return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Placa: " + placa + "\n" + "Ano: " + ano_fab
				+ "\n" + "Valor da Diaria: " + valorDiaria + "\n" + "Valor do Bem: " + valorAvaliado + "\n"
				+ "Valor do Seguro: " + seguro + "\n" + "Cilindradas: " + cilindradas + "\n";
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da classe;
 ***********************************************************************************************************************************************************************************************/