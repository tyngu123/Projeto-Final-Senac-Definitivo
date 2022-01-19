package projeto.senac.modelo;

public class Estado {

	private int id_estado;
	private String descricao;
	private String uf; // mudei para varchar no banco de dados
	
	public Estado(int id_estado, String descricao, String uf) {
		super();
		this.id_estado = id_estado;
		this.descricao = descricao;
		this.uf = uf;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
}
