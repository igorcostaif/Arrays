import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.ifba.basicas.Funcionario;
import br.edu.ifba.cadastros.CadastrosFuncionarios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		CadastrosFuncionarios c = new CadastrosFuncionarios();
		int cont=0;
		System.out.println("Digite a quantidade de funcion�rios:");
		int qtd = in.nextInt();
		while(cont<qtd) {
			
			Funcionario f = new Funcionario();
			System.out.println("Digite o cpf:");
			f.setCpf(in.next());
			System.out.println("Digite o nome:");
			f.setNome(in.next());
			System.out.println("Digite a fun��o:");
			f.setFuncao(in.next());
			c.adicionar(f);
			
			cont++;
		}
		
		System.out.println("Listando funcion�rios: "+c.listar());
		System.out.println("Digite um nome para procurar: ");
		Funcionario funcionario = c.procurar(in.next());
		if(funcionario!=null) {
			System.out.println(funcionario);
		}else {
			JOptionPane.showMessageDialog(null, "Funcion�rio n�o encontrado");
			
			System.out.println("Funcion�rio n�o encontrado");
			
			
		}
		
		System.out.println("Digite uma posi��o para remover: ");
		c.remover(in.nextInt());
		System.out.println(c.listar());
		
		System.out.println("Digite o cpf para remover: ");
		c.removerCpf(in.next());
		
		System.out.println("Remover por CPF: "+ c.listar());
		

	}

}
