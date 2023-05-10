package br.edu.ifba.basicas;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private String telefone;
	public Empresa(String nome, String cnpj, String telefone) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
	public Empresa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone + "]";
	}
	
	

}
