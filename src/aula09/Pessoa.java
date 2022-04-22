package aula09;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	//m�todos
	public void fazerAniver() {
		this.setIdade(this.getIdade()+1);
	}
	
	//m�todos especiais
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return this.sexo;
	}
}
