package ifba.biblioteca.array;

import java.util.Arrays;
	
public class ArrayIFBA<T> {

	Object[] conta = new Object[2];
	int total = 0;

	public void adicionar(T c) {
		aumentaVetor();
		conta[this.total] = c;
		this.total++;
	}

	public void adicionarPorPosicao(int posicao, T cc) {
		aumentaVetor();
		if (!verificaPosicao(posicao)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
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

	public Object procurarPosicao(int p) {

		if (!verificaPosicao(p)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
		}

		return this.conta[p];
	}


	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
	
	private void aumentaVetor() {
		
		if(this.total == this.conta.length){
			
			Object[] newObject = new Object[this.conta.length*2];
			
			System.arraycopy(this.conta, 0, newObject, 0, this.conta.length);
			
			this.conta = newObject;
		}
		
	}
	
	public int tamanho() {
		return this.total;
	}
	
	public void remover(int posicao) {
		
		if(!verificaPosicao(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		aumentaVetor();
		
		for(int cont=posicao;cont<this.total;cont++) {
			this.conta[cont] = this.conta[cont+1];
		}
		
		this.conta[this.total-1] = null;
		
		this.total--;
		
	}

}
