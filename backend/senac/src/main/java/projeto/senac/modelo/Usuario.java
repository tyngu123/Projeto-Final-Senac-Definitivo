package projeto.senac.modelo;

import java.util.Date;

public class Usuario {
	private int id;
	private String email;
	private String nome;
	private Date nascimento;
	private String senha;
	
	public Usuario(String email,String nome,Date nascimento,String senha) {
		this.email = email;
		this.nome = nome;
		this.nascimento = nascimento;
		this.senha = senha;
		
	}
	
	public Usuario(String email,String senha) {
		this.email = email;
		this.senha = senha;
	}
	

	
	public Usuario() {
		
	}
	
	public Usuario(int id) {
		this.id = id;
	}

	public Usuario(String email,String nome,Date nascimento,String senha,int id) {
		this.email = email;
		this.nome = nome;
		this.nascimento = nascimento;
		this.senha = senha;
		this.id = id;
		
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}