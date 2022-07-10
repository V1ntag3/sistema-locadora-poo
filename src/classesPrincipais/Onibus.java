package classesPrincipais;

public class Onibus extends Veiculo {
	/**********************************************************************************************************************************************************************************************
	 * Variavel especifica de onibus;
	 ***********************************************************************************************************************************************************************************************/

	private int capac_passagerios;

	public Onibus(String string, String string2, int i, String string3, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		setMarca(string);
		setModelo(string2);
		setAno_fab(i);
		setPlaca(string3);
		setValorDiaria(j);
		setValorAvaliado(k);
		setCapac_passageiros(l);
	}

	public Onibus() {
		// TODO Auto-generated constructor stub
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos de entradas e saida de dados;
	 ***********************************************************************************************************************************************************************************************/
	public int getCapac_passageiros() {
		return capac_passagerios;
	}

	public void setCapac_passageiros(int capac_passagerios) {
		this.capac_passagerios = capac_passagerios;
		setTipo();
		setSeguro();
	}

	public void setSeguro() {
		double seguro = getValorAvaliado() * 0.2 / 365;
		this.seguro = seguro;
	}

	public void setTipo() {
		int tipo = 4;
		this.tipo = tipo;
	}

	public String toString() {
		return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Placa: " + placa + "\n" + "Ano: " + ano_fab
				+ "\n" + "Valor da Diaria: " + valorDiaria + "\n" + "Valor do Bem: " + valorAvaliado + "\n"
				+ "Valor do Seguro: " + seguro + "\n" + "Capacidade de Passageiros: " + capac_passagerios + "\n";
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da classe;
 ***********************************************************************************************************************************************************************************************/