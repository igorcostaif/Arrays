package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basicas.Funcionario;

public class CadastrosFuncionario {
	
	Funcionario[] arFunc = new Funcionario[3];
	private int total = 0;
	
	public void cadastrarFuncionario(Funcionario f) {
		
		this.arFunc[this.total] = f;
		
		this.total++;
		
	}
	
	public void cadastrarPorPosicao(int posicao,Funcionario c) {
		
		aumentaVetor();
		
		for(int cont = this.total-1;cont>=posicao;cont--) {
			
			this.arFunc[cont+1] = this.arFunc[cont];
		}
		
		this.arFunc[posicao] = c;
		
		this.total++;
				
	}
	
	public void removerPosicao(int posicao) {
		
		aumentaVetor();
		
		for(int cont = posicao;cont<this.total;cont++) {
			this.arFunc[cont] = this.arFunc[cont+1];
		}
		
		this.arFunc[this.total-1]=null;
		
		this.total--;
		
		
	}
	
	public String listar() {
		return Arrays.toString(this.arFunc);
	}
	
	private void aumentaVetor() {
		
		if(this.total==this.arFunc.length) {
			
			Funcionario[] newArFunc = new Funcionario[this.arFunc.length*2];
			System.arraycopy(this.arFunc, 0, newArFunc, 0, this.arFunc.length);
			
			this.arFunc = newArFunc;			
		}
		
	}
	
	

}
