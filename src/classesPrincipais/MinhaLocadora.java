package classesPrincipais;

import java.util.ArrayList;

import estruturasDados.ListaC;
import estruturasDados.ListaV;
import excexoes.ClienteJaCadastrado;
import excexoes.ClienteNaoCadastrado;
import excexoes.VeiculoAlugado;
import excexoes.VeiculoJaCadastrado;
import excexoes.VeiculoNaoAlugado;
import excexoes.VeiculoNaoCadastrado;
import interfaces.Locadora;

public class MinhaLocadora implements Locadora {
	/***********************************************************************************************************************************************************************************************
	 * Inicializa a lista que irá guardar os clientes da locadora e a lista que
	 * guardará os veiculos;
	 ***********************************************************************************************************************************************************************************************/
	ListaC Cl = new ListaC();
	ListaV Ve = new ListaV();

	/**********************************************************************************************************************************************************************************************
	 * Métodos da classe Locadora: inserir;
	 * 
	 * @throws VeiculoJaCadastrado
	 **********************************************************************************************************************************************************************************************/
	public void inserir(Veiculo v) throws VeiculoJaCadastrado {
		Ve.inserir(v);
	}

	public void inserir(Cliente c) throws ClienteJaCadastrado {
		Cl.inserir(c);
	}

	/**********************************************************************************************************************************************************************************************
	 * Métodos da classe Locadora: pesquisas;
	 * 
	 * @throws VeiculoNaoCadastrado
	 **********************************************************************************************************************************************************************************************/
	public Veiculo pesquisar(String placa) throws VeiculoNaoCadastrado {
		return Ve.procurarVeiculo(placa);
	}

	public ArrayList<Veiculo> pesquisarCarro(int tipoCarro) {
		return Ve.pesquisarCarro(tipoCarro);
	}

	public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		return Ve.pesquisarCaminhao(carga);
	}

	public ArrayList<Veiculo> pesquisarOnibus(int passageiros) {
		return Ve.pesquisarOnibus(passageiros);
	}

	public ArrayList<Veiculo> pesquisarMoto(int cilindradas) {
		return Ve.pesquisarMoto(cilindradas);
	}

	/**********************************************************************************************************************************************************************************************
	 * Métodos da classe Locadora: Finaceiro e controle de carros;
	 * 
	 * @throws VeiculoNaoCadastrado
	 * @throws
	 ***********************************************************************************************************************************************************************************************/
	public double calcularAluguel(String placa, int dias) throws VeiculoNaoCadastrado {
		Veiculo cal = new Veiculo();
		cal = pesquisar(placa);
		if (cal != null) {
			double val = (cal.getValorDiaria() + cal.getSeguro()) * dias;
			return val;
		}
		throw new VeiculoNaoCadastrado(placa);
	}

	public void registrarAluguel(String placa, int dias, Cliente c)
			throws ClienteNaoCadastrado, VeiculoAlugado, VeiculoNaoCadastrado {
		Veiculo V = new Veiculo();
		Cliente C = new Cliente();
		C = Cl.pesquisar(c.getCpf());
		V = Ve.pesquisar(placa);
		if (C == null) {
			throw new ClienteNaoCadastrado(c.getNome());
		} else {
			if (Ve.pesquisar(placa) == null) {
				throw new VeiculoNaoCadastrado(placa);
			} else {

				if (V.isUso() == true) {
					throw new VeiculoAlugado(placa);
				} else {
					double divida = calcularAluguel(placa, dias);
					Ve.mudarUso(true, placa);
					Cl.somadorCarroArraylist(V, C, divida, dias);
				}
			}
		}
	}

	public void registrarDevolucao(String placa, Cliente c)
			throws ClienteNaoCadastrado, VeiculoNaoCadastrado, VeiculoNaoAlugado {
		Veiculo V = new Veiculo();
		if (Cl.pesquisar(c.getCpf()) == null) {
			throw new ClienteNaoCadastrado(c.getNome());
		} else {
			if (Ve.pesquisar(placa) == null) {
				throw new VeiculoNaoCadastrado(placa);
			} else {
				V = Ve.pesquisar(placa);
				if (V.isUso() == false) {
					throw new VeiculoNaoAlugado(placa);
				} else {
					Ve.mudarUso(false, placa);
				}
			}
		}
	}

	public void depreciarVeiculos(int tipo, double taxaDepreciacao) {
		Ve.depreciarVeiculos(tipo, taxaDepreciacao);
	}

	public void aumentarDiaria(int tipo, double taxaAumento) {
		Ve.aumentarDiaria(tipo, taxaAumento);
	}

	public double faturamentoTotal(int tipo) {
		return Cl.somadorFaturamento(tipo);
	}

	public int quantidadeTotalDeDiarias(int tipo) {
		return Cl.somadorDiarias(tipo);
	}

	public double consultarSeguro(String placa) {
		Veiculo aux = new Veiculo();
		aux = Ve.pesquisar(placa);
		return aux.getSeguro();
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da classe;
 ***********************************************************************************************************************************************************************************************/