package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basicas.Empresa;

public class CadastroEmpresa {
	
	Empresa[] arEmp = new Empresa[3];
	private int total = 0;
	
	public void cadastroEmpresa(Empresa e) {
		
		this.arEmp[this.total] = e;
		this.total++;
		
	}
	
	public String listar() {
		
		return Arrays.toString(this.arEmp);
		
	}
	
	public void cadastrarPorPosicao(int posicao,Empresa e) {
		
		aumentaVetor();
		
		for(int cont = this.total-1;cont>=posicao;cont--) {
			
			this.arEmp[cont+1] = this.arEmp[cont];
		}
		
		this.arEmp[posicao] = e;
		
		this.total++;
				
	}
	
	public void removerPosicao(int posicao) {
		
		aumentaVetor();
		
		for(int cont = posicao;cont<this.total;cont++) {
			this.arEmp[cont] = this.arEmp[cont+1];
		}
		
		this.arEmp[this.total-1]=null;
		
		this.total--;
		
		
	}
	
	public Empresa procurarEmpresa(int posicao) {
		return this.arEmp[posicao];
	}
	
	private void aumentaVetor() {
		
		if(this.arEmp.length==this.total) {
			
			Empresa[] newArEmp = new Empresa[this.arEmp.length*2];
			
			System.arraycopy(this.arEmp, 0, newArEmp, 0, this.arEmp.length);
			
			this.arEmp = newArEmp;
			
		}
		
	}

}
