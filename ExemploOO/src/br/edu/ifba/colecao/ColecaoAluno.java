package br.edu.ifba.colecao;

import java.util.Arrays;

import br.edu.ifba.basicas.Aluno;

public class ColecaoAluno {

	private Aluno[] a = new Aluno[5];
	int cont = 0;

	public void cadastrarAluno(Aluno a) {
		for (int cont = 0; cont < this.a.length; cont++) {
			if (this.a[cont] == null) {
				this.a[cont] = a;
				break;
			}
		}

	}

	public void cadastrarAlunoOtimizado(Aluno a) {
		this.a[cont] = a;
		this.cont++;

	}

	public Aluno[] retornoAluno() {

		Arrays.sort(this.a);
		return this.a;

	}

}
