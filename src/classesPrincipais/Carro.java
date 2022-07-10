package classesPrincipais;
public class Carro extends Veiculo{

/**********************************************************************************************************************************************************************************************
	Variavel especifica de carro;
	1 - passeio;
	2 - SUV;
	3 - pickup;
***********************************************************************************************************************************************************************************************/
	private int TipoCarro;
public Carro(String string, String string2, int i, String string3, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	setMarca(string);
	setModelo(string2);
	setAno_fab(i);
	setPlaca(string3);
	setValorDiaria(j);
	setValorAvaliado(k);
	setTipoCarro(l);
	}
public Carro() {
	// TODO Auto-generated constructor stub
}
/**********************************************************************************************************************************************************************************************
	Metodos de entradas e saida de dados;
***********************************************************************************************************************************************************************************************/
	public void setSeguro() {
		double seguro = getValorAvaliado()*0.03/365;
		this.seguro = seguro;
	}
	public void setTipo() {
		int tipo = 2;
		this.tipo = tipo;
	}

	public int getTipoCarro() {
		return TipoCarro;
	}

	public void setTipoCarro(int tipoCarro) {
		TipoCarro = tipoCarro;
		setTipo();
		setSeguro();
	}
	public String toString() {
		switch(TipoCarro) {
			case 1:		
				return "Marca: " + marca + "\n" 
			+"Modelo: " + modelo + "\n"
			+"Placa: " + placa + "\n"
			+"Ano: "+ ano_fab + "\n"
			+"Valor da Diaria: "+ valorDiaria + "\n"
			+"Valor do Bem: "+ valorAvaliado + "\n"
			+"Valor do Seguro: "+ seguro + "\n"
			+"Categoria do carro: Passeio \n"
			;
			case 2: 
				return "Marca: " + marca + "\n" 
			+"Modelo: " + modelo + "\n"
			+"Placa: " + placa + "\n"
			+"Ano: "+ ano_fab + "\n"
			+"Valor da Diaria: "+ valorDiaria + "\n"
			+"Valor do Bem: "+ valorAvaliado + "\n"
			+"Valor do Seguro: "+ seguro + "\n"
			+"Categoria do carro: SUV \n"
			;
				
			case 3:
				return "Marca: " + marca + "\n" 
			+"Modelo: " + modelo + "\n"
			+"Placa: " + placa + "\n"
			+"Ano: "+ ano_fab + "\n"
			+"Valor da Diaria: "+ valorDiaria + "\n"
			+"Valor do Bem: "+ valorAvaliado + "\n"
			+"Valor do Seguro: "+ seguro + "\n"
			+"Categoria do carro: Pickup \n"
			;
			default:
				return "erro 00001a";
		}
	}
}
/**********************************************************************************************************************************************************************************************
Fim da classe;
***********************************************************************************************************************************************************************************************/