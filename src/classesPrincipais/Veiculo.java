package classesPrincipais;

public class Veiculo {
	/**********************************************************************************************************************************************************************************************
	 * Declarações utilizadas para veiculos;
	 ***********************************************************************************************************************************************************************************************/
	protected int tipo;
	protected String marca;
	protected String modelo;
	protected int ano_fab;
	protected String placa;
	protected double valorDiaria;
	protected double valorAvaliado;
	protected double seguro;
	protected boolean uso; // informa se um veiculo está sendo usado ou não

	/**********************************************************************************************************************************************************************************************
	 * Metodos de entrada e saida;
	 ***********************************************************************************************************************************************************************************************/
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno_fab() {
		return ano_fab;
	}

	public void setAno_fab(int ano_fab) {
		this.ano_fab = ano_fab;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double d) {
		this.valorDiaria = d;
	}

	public double getValorAvaliado() {
		return valorAvaliado;
	}

	public void setValorAvaliado(double valor_bem) {
		this.valorAvaliado = valor_bem;
	}

	public int getTipo() {
		return tipo;
	}

	public boolean isUso() {
		return uso;
	}

	public void setUso(boolean uso) {
		this.uso = uso;
	}

	public double getSeguro() {
		return seguro;
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da classe
 ***********************************************************************************************************************************************************************************************/