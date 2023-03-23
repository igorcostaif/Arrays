package br.edu.ifba.principal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import br.edu.ifba.basicas.Aluno;
import br.edu.ifba.colecao.ColecaoAluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		ColecaoAluno ca = new ColecaoAluno();
		Random r = new Random();
		
		for (int cont = 0; cont < 5; cont++) {
			
			Aluno a = new Aluno();
			System.out.println("Digite o nome do aluno: ");
			
			a.setNome(in.nextLine());
			System.out.println("Digite o cpf do aluno: ");
			a.setCpf(in.nextLine());
			System.out.println("Digite a matrícula do aluno: ");
			a.setMatricula(in.nextLine());

			ca.cadastrarAlunoOtimizado(a);
		}

		System.out.println(Arrays.toString(ca.retornoAluno()));

	}

}
