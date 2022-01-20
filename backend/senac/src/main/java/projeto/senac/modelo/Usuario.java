package projeto.senac.modelo;

import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String nome_completo;
	private String apelido;
	private Date nascimento;
	private String documento;
	private TipoDocumento tipoDocumento;
	private Endereco endereco;
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;
	
	public Usuario(int id_usuario, String nome_completo, String apelido, Date nascimento, String documento,
			String email, String senha) {
		
		super();
		this.id_usuario = id_usuario;
		this.nome_completo = nome_completo;
		this.apelido = apelido;
		this.nascimento = nascimento;
		this.documento = documento;
		this.email = email;
		this.senha = senha;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	

	
}