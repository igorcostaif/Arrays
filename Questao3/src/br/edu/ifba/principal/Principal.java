package br.edu.ifba.principal;

import br.edu.ifba.basica.Conta;
import br.edu.ifba.cadastros.CadastroConta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta("Fulano", 20);
		Conta c1 = new Conta("Beltrano", 10.5);
		
		CadastroConta cc = new CadastroConta();
		cc.adicionar(c);
		cc.adicionar(c1);
		cc.listar();
		System.out.println(cc.procurarPosicao(1));
		

	}

}
