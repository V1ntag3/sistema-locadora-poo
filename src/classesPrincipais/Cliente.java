package classesPrincipais;
public class Cliente {
/**********************************************************************************************************************************************************************************************
	Declarações utilizadas para cliente;
***********************************************************************************************************************************************************************************************/
	private String nome;
	private int cpf;
	private double dividaT;
	private int diariasT;
	public Cliente(String string, int i) {
		// TODO Auto-generated constructor stub
		setNome(string);
		setCpf(i);
	}
public Cliente() {
	// TODO Auto-generated constructor stub
}
/**********************************************************************************************************************************************************************************************
	Metodos de entrada e saida;
***********************************************************************************************************************************************************************************************/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getDividaT() {
		return dividaT;
	}
	public void setDividaT(double divida) {
		this.dividaT = this.dividaT + divida;
	}
	public int getDiariasT() {
		return diariasT;
	}
	public void setDiariasT(int diariasT) {
		this.diariasT = this.diariasT + diariasT;
	}
}
/**********************************************************************************************************************************************************************************************
Fim da classe
***********************************************************************************************************************************************************************************************/