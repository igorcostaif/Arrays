package br.edu.ifba.cadastros;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.basicas.Funcionario;

public class CadastrarArrayList {
	
	List<Funcionario> lista = new ArrayList<Funcionario>();

	public void adicionar(Funcionario f) {
		lista.add(f);
	}
	
	public String listar() {
		return lista.toString();
	}
	
	public void remover(int posicao) {
		this.lista.remove(posicao);
	}
	
	public Funcionario procurar(String nome) {
		
		for(Funcionario f:this.lista) {
			
			if(f.getNome().equals(nome)) {
				return f;
			}
			
		}
		
		return null;
	}
}
