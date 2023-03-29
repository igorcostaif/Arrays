package br.edu.ifba.basicas;

public class Aluno implements Comparable<Aluno> {
	
	private int id;
	private String nome;
	private String matricula;
	private String cpf;
	
	public Aluno(){}

	public Aluno(int id, String nome, String matricula, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public Aluno(String nome, String matricula, String cpf) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Aluno [id=" +id+ ", nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf + "]";
	}
	
	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareToIgnoreCase(o.getNome());
	}
	
	
	
	
	

}
