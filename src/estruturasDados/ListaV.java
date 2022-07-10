package estruturasDados;

import java.util.ArrayList;

import classesPrincipais.Caminhao;
import classesPrincipais.Carro;
import classesPrincipais.Moto;
import classesPrincipais.Onibus;
import classesPrincipais.Veiculo;
import excexoes.VeiculoJaCadastrado;
import excexoes.VeiculoNaoCadastrado;

public class ListaV {
	/**********************************************************************************************************************************************************************************************
	 * Declarações utilizadas para a lista;
	 ***********************************************************************************************************************************************************************************************/
	ArrayList<Veiculo> list = new ArrayList<Veiculo>();
	int cont = 0;

	/**********************************************************************************************************************************************************************************************
	 * Metodo de inserir na lista, o item é sempre inserido no final da lista;
	 * 
	 * @throws VeiculoJaCadastrado
	 ***********************************************************************************************************************************************************************************************/
	public void inserir(Veiculo auto) throws VeiculoJaCadastrado {
		if (auto == pesquisar(auto.getPlaca())) {
			throw new VeiculoJaCadastrado(auto.getPlaca());
		} else {
			list.add(auto);

		}
		cont++;
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodoa de pesquisar placas;
	 ***********************************************************************************************************************************************************************************************/
	public Veiculo pesquisar(String placa) {
		for (int i = 0; i < cont; i++) {
			if (list.get(i).getPlaca() == placa) {
				return list.get(i);
			}
		}
		return null;
	}

	public Veiculo procurarVeiculo(String placa) throws VeiculoNaoCadastrado {
		for (int i = 0; i < cont; i++) {
			if (list.get(i).getPlaca() == placa) {
				return list.get(i);
			}
		}
		throw new VeiculoNaoCadastrado(placa);
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos de pesquisa por cateogoria com retorno veiculos;
	 ***********************************************************************************************************************************************************************************************/
	public ArrayList<Veiculo> pesquisarMoto(int cilindradas) {
		ArrayList<Veiculo> list2 = new ArrayList<Veiculo>();
		Moto motoaux = new Moto();
		for (int i = 0; i < cont; i++) {
			motoaux = (Moto) list.get(i);
			if (list.get(i).getTipo() == 1) {
				if (motoaux.getCilindradas() == cilindradas) {
					list2.add(motoaux);
				}
			}
		}
		return list2;
	}

	public ArrayList<Veiculo> pesquisarCarro(int TipoCarro) {
		ArrayList<Veiculo> list2 = new ArrayList<Veiculo>();
		Carro carroaux = new Carro();
		for (int i = 0; i < cont; i++) {
			carroaux = (Carro) list.get(i);
			if (list.get(i).getTipo() == 2) {
				if (carroaux.getTipoCarro() == TipoCarro) {
					list2.add(carroaux);
				}
			}
		}
		return list2;
	}

	public ArrayList<Veiculo> pesquisarOnibus(int capac_passageiros) {
		ArrayList<Veiculo> list2 = new ArrayList<Veiculo>();
		Onibus oniaux = new Onibus();
		for (int i = 0; i < cont; i++) {
			oniaux = (Onibus) list.get(i);
			if (list.get(i).getTipo() == 4) {
				if (oniaux.getCapac_passageiros() == capac_passageiros) {
					list2.add(oniaux);
				}
			}
		}
		return list2;
	}

	public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		ArrayList<Veiculo> list2 = new ArrayList<Veiculo>();
		Caminhao caminhaoaux = new Caminhao();
		for (int i = 0; i < cont; i++) {
			caminhaoaux = (Caminhao) list.get(i);
			if (caminhaoaux.getTipo() == 3) {
				if (caminhaoaux.getCarga() == carga) {
					list2.add(caminhaoaux);
				}
			}
		}
		return list2;
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos mudanças de variáveis;
	 ***********************************************************************************************************************************************************************************************/
	public void aumentarDiaria(int tipo, double taxaAumento) {
		if (tipo == 0) {
			for (int i = 0; i < cont; i++) {
				list.get(i).setValorDiaria(list.get(i).getValorDiaria() * (1 + (taxaAumento)));
			}
		} else {
			for (int i = 0; i < cont; i++) {
				if (list.get(i).getTipo() == tipo) {
					list.get(i).setValorDiaria(list.get(i).getValorDiaria() * (1 + (taxaAumento)));
				}
			}
		}
	}

	public void depreciarVeiculos(int tipo, double taxaDepreciacao) {
		if (tipo == 0) {
			for (int i = 0; i < cont; i++) {
				list.get(i).setValorAvaliado(list.get(i).getValorAvaliado() * (1 - taxaDepreciacao));
			}

		} else {
			for (int i = 0; i < cont; i++) {
				if (list.get(i).getTipo() == tipo) {
					list.get(i).setValorAvaliado(list.get(i).getValorAvaliado() * (1 - taxaDepreciacao));
				}
			}

		}
	}

	public void mudarUso(boolean uso, String placa) {
		for (int i = 0; i < cont; i++) {
			if (list.get(i).getPlaca() == placa) {
				list.get(i).setUso(uso);
			}
		}
		return;
	}
}
/**********************************************************************************************************************************************************************************************
 * Fim da Classe;
 ***********************************************************************************************************************************************************************************************/