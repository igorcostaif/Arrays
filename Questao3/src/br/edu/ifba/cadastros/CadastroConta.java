package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basica.Conta;

public class CadastroConta {

	Conta[] conta = new Conta[2];
	int total = 0;

	public void adicionar(Conta c) {
		aumentaVetor();
		conta[this.total] = c;
		this.total++;
	}

	public void adicionarPorPosicao(int posicao, Conta cc) {
		aumentaVetor();
		if (!verificaPosicao(posicao)) {

			throw new IllegalArgumentException("posição inválida!");
		}

		for (int cont = this.total - 1; cont >= posicao; cont--) {

			this.conta[cont + 1] = this.conta[cont];

		}

		this.conta[posicao] = cc;

		this.total++;

	}

	public void listar() {

		System.out.println(Arrays.toString(this.conta));

	}

	public Conta procurarPosicao(int p) {

		if (!verificaPosicao(p)) {

			throw new IllegalArgumentException("posição inválida!");
		}

		return this.conta[p];
	}

	public Conta procurarNome(String nome) {
		Conta c = null;

		for (int cont = 0; cont < this.total; cont++) {
			// utilizado o método Equals da classe String para comparar Strings
			if (nome.equalsIgnoreCase(this.conta[cont].getNome())) {
				c = this.conta[cont];
			}

		}

		return c;
	}

	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
	
	private void aumentaVetor() {
		
		if(this.total == this.conta.length){
			
			Conta[] newConta = new Conta[this.conta.length*2];
			
			System.arraycopy(this.conta, 0, newConta, 0, this.conta.length);
			
			this.conta = newConta;
		}
		
	}

}
