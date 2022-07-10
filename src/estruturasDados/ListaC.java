package estruturasDados;

import classesPrincipais.Cliente;
import classesPrincipais.Veiculo;
import excexoes.ClienteJaCadastrado;

public class ListaC {
	/**********************************************************************************************************************************************************************************************
	 * Declarações utilizadas para a lista;
	 ***********************************************************************************************************************************************************************************************/
	public class Node {
		public Cliente client;
		double fatmoto;
		double fatcar;
		double fatcam;
		double fatoni;
		int diamoto;
		int diacar;
		int diacam;
		int diaoni;
		public Node prox;
	}

	Node inicio = null;
	Node fim = null;
	int cont;

	/**********************************************************************************************************************************************************************************************
	 * Metodo de inserir na lista, o item é sempre inserido no final da lista;
	 * 
	 * @throws ClienteJaCadastrado
	 ***********************************************************************************************************************************************************************************************/
	public void inserir(Cliente c) throws ClienteJaCadastrado {
		Node cliente = new Node();
		if (c == pesquisar(c.getCpf())) {
			throw new ClienteJaCadastrado(c.getNome());
		}
		if (inicio == null && fim == null) {
			cliente.client = c;
			cliente.prox = null;
			inicio = cliente;
			fim = cliente;
		} else {
			cliente.client = c;
			fim.prox = cliente;
			fim = cliente;
		}
		cont++;
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodo de pesquisar o cliente pelo cpf;
	 ***********************************************************************************************************************************************************************************************/
	public Cliente pesquisar(int i) {
		Node aux = new Node();
		aux = inicio;
		while (aux != null) {
			if (aux.client.getCpf() == i) {
				return aux.client;
			}
			aux = aux.prox;
		}
		return null;
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodo de relatorio de diarias e faturamento;
	 ***********************************************************************************************************************************************************************************************/
	public int somadorDiarias(int tipo) {
		int soma = 0;
		Node aux = new Node();
		aux = inicio;
		if (tipo == 0) {
			while (aux != null) {
				soma = soma + aux.client.getDiariasT();
				aux = aux.prox;
			}
			return soma;
		} else {
			while (aux != null) {
				switch (tipo) {
				case 1:
					soma = soma + aux.diamoto;
					break;
				case 2:
					soma = soma + aux.diacar;
					break;
				case 3:
					soma = soma + aux.diacam;
					break;
				case 4:
					soma = soma + aux.diaoni;
					break;
				}
				aux = aux.prox;
			}
			return soma;
		}
	}

	public double somadorFaturamento(int tipo) {
		double soma = 0;
		Node aux = new Node();
		aux = inicio;
		if (tipo == 0) {
			while (aux != null) {
				soma = soma + aux.client.getDividaT();
				aux = aux.prox;
			}
			return soma;
		} else {
			while (aux != null) {
				switch (tipo) {
				case 1:
					soma = soma + aux.fatmoto;
					break;
				case 2:
					soma = soma + aux.fatcar;
					break;
				case 3:
					soma = soma + aux.fatcam;
					break;
				case 4:
					soma = soma + aux.fatoni;
					break;
				}
				aux = aux.prox;
			}
			return soma;
		}
	}

	/**********************************************************************************************************************************************************************************************
	 * Metodos de mudança dentro da lista
	 ***********************************************************************************************************************************************************************************************/
	public void somadorCarroArraylist(Veiculo v, Cliente c, double divida, int diaria) {
		Node aux = new Node();
		aux = inicio;
		while (aux != null) {
			if (aux.client.getCpf() == c.getCpf()) {
				aux.client.setDividaT(divida);
				aux.client.setDiariasT(diaria);
				switch (v.getTipo()) {
				case 1:
					aux.fatmoto = aux.fatmoto + divida;
					aux.diamoto = aux.diamoto + diaria;
					break;
				case 2:
					aux.fatcar = aux.fatcar + divida;
					aux.diacar = aux.diacar + diaria;
					break;
				case 3:
					aux.fatcam = aux.fatcam + divida;
					aux.diacam = aux.diacam + diaria;
					break;
				case 4:
					aux.fatoni = aux.fatoni + divida;
					aux.diaoni = aux.diaoni + diaria;
					break;
				}

			}
			aux = aux.prox;
		}
	}

}
/**********************************************************************************************************************************************************************************************
 * Fim da classe
 ***********************************************************************************************************************************************************************************************/