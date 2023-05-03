package br.edu.ifba.basicas;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String funcao;
	
	public Funcionario(){}
	
	public Funcionario(String nome, String cpf, String funcao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", funcao=" + funcao + "]";
	}
	
	
	
}
