package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basica.Conta;

public class CadastroConta {

	Conta[] conta = new Conta[2];
	int total = 0;

	public void adicionar(Conta c) {
		conta[this.total] = c;
		this.total++;
	}

	public void listar() {

		System.out.println(Arrays.toString(this.conta));

	}
	
	public Conta procurarPosicao(int p) {
		return this.conta[p];
	}

}
