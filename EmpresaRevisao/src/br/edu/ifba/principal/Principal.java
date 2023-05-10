package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.basicas.Empresa;
import br.edu.ifba.basicas.Funcionario;
import br.edu.ifba.cadastros.CadastroEmpresa;
import br.edu.ifba.cadastros.CadastrosFuncionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		CadastrosFuncionario cf = new CadastrosFuncionario();
		CadastroEmpresa c = new CadastroEmpresa();
		
		for(int cont = 0;cont<2;cont++) {
			Empresa e = new Empresa();
			
			System.out.println("Digite o nome da empresa:");
			e.setNome(in.next());
			
			System.out.println("Digite o cnpj: ");
			e.setCnpj(in.next());
			
			System.out.println("Digite o telefone :");
			e.setTelefone(in.next());;	
			c.cadastroEmpresa(e);
			
		}
		
		System.out.println("Empresas cadastradas: "+c.listar());
		
		Empresa e = new Empresa("Apple", "45568","325689");
		
		System.out.println("Digite a posicao para colocar a empresa");
		c.cadastrarPorPosicao(in.nextInt(), e);
		
		System.out.println("Empresas cadastradas: "+c.listar());
		
		System.out.println("Digite a posicao para remover");
		c.removerPosicao(in.nextInt());
		
		System.out.println("Empresas cadastradas: "+c.listar());
		
		
		for(int cont=0; cont<3; cont++) {
			Funcionario f = new Funcionario();
			
			System.out.println("Digite o nome do funcionario: ");
			f.setNome(in.next());
			
			System.out.println("Digite o cpf: ");
			f.setCpf(in.next());
			
			System.out.println("Digite o rg: ");
			f.setRg(in.next());
			
			System.out.println("Digite o telefone: ");
			f.setTelefone(in.next());
			
			System.out.println("Escolha a empresa");
			System.out.println("Empresas disponíveis: "+c.listar());
			f.setEmpresa(c.procurarEmpresa(in.nextInt()));
			
			cf.cadastrarFuncionario(f);
		}
		
		System.out.println("Funcionários Cadastrados: "+cf.listar());
		
		in.close();
		
	}

}
