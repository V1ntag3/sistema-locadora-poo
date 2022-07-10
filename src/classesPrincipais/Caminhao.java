package classesPrincipais;

public class Caminhao extends Veiculo {
	/**********************************************************************************************************************************************************************************************
	 * Variavel especifica de caminhao;
	 ***********************************************************************************************************************************************************************************************/
	private double carga;

	public Caminhao(String string, String string2, int i, String string3, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		setMarca(string);
		setModelo(string2);
		setAno_fab(i);
		setPlaca(string3);
		setValorDiaria(j);
		setValorAvaliado(k);
		setCarga(l);
	}

	public Caminhao() {
		// TODO Auto-generated constructor stub
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos de entradas e saida de dados;
	 ***********************************************************************************************************************************************************************************************/
	public double getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
		setTipo();
		setSeguro();
	}

	public void setTipo() {
		int tipo = 3;
		this.tipo = tipo;
	}

	public void setSeguro() {
		double seguro = getValorAvaliado() * 0.08 / 365;
		this.seguro = seguro;
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos da SuperClasse Object sobreescrito;
	 ***********************************************************************************************************************************************************************************************/
	public String toString() {
		return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Placa: " + placa + "\n" + "Ano: " + ano_fab
				+ "\n" + "Valor da Diaria: " + valorDiaria + "\n" + "Valor do Bem: " + valorAvaliado + "\n"
				+ "Valor do Seguro: " + seguro + "\n" + "Capacidade de Carga: " + carga + "\n";
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da classe;
 ***********************************************************************************************************************************************************************************************/