package projeto.senac.modelo;

public class Municipio extends Estado{

	private int id_municipio;
	private String descricao_municipio;
	private Estado estado;
	
	public Municipio(int id_municipio, String descricao_municipio) {
		super();
		this.id_municipio = id_municipio;
		this.descricao_municipio = descricao_municipio;
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

	public String getDescricao_municipio() {
		return descricao_municipio;
	}

	public void setDescricao_municipio(String descricao_municipio) {
		this.descricao_municipio = descricao_municipio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
