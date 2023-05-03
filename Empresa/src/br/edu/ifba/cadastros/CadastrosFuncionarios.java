package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basicas.Funcionario;

public class CadastrosFuncionarios {
	
	Funcionario[] func = new Funcionario[5];
	int total = 0;
	
	public void adicionar(Funcionario f) {
		aumentaVetor();
		this.func[this.total] = f;
		this.total++;
		
	}
	
	public String listar() {
		return Arrays.toString(this.func);
	}
	
	public Funcionario procurar(String nome) {
		
		for(int cont=0; cont<total; cont++) {
			
			if(this.func[cont].getNome().equals(nome)) {
				return this.func[cont];
			}
		}
		
		return null;
	}
	
	public void remover(int posicao) {
		aumentaVetor();
		for(int cont = posicao; cont<this.total-1;cont++) {
			this.func[cont] = this.func[cont+1];
		}
		this.func[this.total-1] = null;
		this.total--;
	}
	
	public void removerCpf(String cpf) {
		
	for(int cont=0; cont<this.total; cont++) {
			
			if(this.func[cont].getCpf().equals(cpf)) {
				this.remover(cont);
			}
		}

	}
	
	
	private void aumentaVetor() {
		
		if(this.func.length == this.total) {
			
			Funcionario[] newFunc = new Funcionario[this.func.length*2];
			
			System.arraycopy(this.func, 0, newFunc, 0, this.func.length);
			
			this.func = newFunc;
			
		}
		
		
	}
	
	
}
