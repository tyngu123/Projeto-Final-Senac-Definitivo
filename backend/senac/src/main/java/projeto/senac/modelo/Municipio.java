package projeto.senac.modelo;

public class Municipio {

	private int id_municipio;
	private String descricao;
	private Estado estado;
	
	public Municipio(int id_municipio, String descricao) {
		super();
		this.id_municipio = id_municipio;
		this.descricao = descricao;
	}

	public Municipio() {
		// TODO Auto-generated constructor stub
	}

	public int getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}