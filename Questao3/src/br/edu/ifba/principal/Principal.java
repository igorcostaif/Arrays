package br.edu.ifba.principal;

import br.edu.ifba.basica.Conta;
import br.edu.ifba.cadastros.CadastroConta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c = new Conta("Fulano", 20);
		Conta c1 = new Conta("Beltrano", 10.5);
		Conta c2 = new Conta("Sicrano", 15.5);
		Conta c3 = new Conta("Coisinha", 0.5);
		CadastroConta cc = new CadastroConta();
		cc.adicionar(c);
		cc.adicionar(c1);
		cc.adicionar(c2);
		cc.adicionarPorPosicao(1, c3);
		cc.listar();

	/*	System.out.println(cc.procurarPosicao(2));
		Conta conta = cc.procurarNome("hulano");
		if (conta == null) {
			System.out.println("Conta não encontrada");
		} else {
			System.out.println(conta);
		} */

		System.out.println();

	}

}
